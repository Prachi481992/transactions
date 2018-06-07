package com.bb.transaction.application;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bb.transaction.dto.Transaction;
import com.bb.transaction.dto.Transactions;

@RestController
public class TransactionController {
	
	private static final String API_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyIiOiIifQ.Y9djraiiTmBz1O6INxhESMpDlFvsHdxa-4Skd4IOQJw";

    private Object getResponse(String uri, Class object) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "DirectLogin token="+API_TOKEN);
        headers.set("Host","127.0.0.1:8080");
        headers.set("Connection","close");
        headers.set("User-Agent", "Paw/2.3.3 (Macintosh; OS X/10.11.3) GCDHTTPRequest");
        headers.set("Content-Length", "0");
        HttpEntity<?> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity exchange = restTemplate.exchange(uri, HttpMethod.GET, entity, object);
        return exchange.getBody();
    }

    @RequestMapping("/anamolytransactions") @Produces(MediaType.APPLICATION_JSON) @CrossOrigin public HttpEntity<Transactions> getTransactions(
        @RequestParam(value = "accountID", required = true) String accountID) {
    	
    	String obpTransactions = "https://beyondbanking.openbankproject.com/obp/v3.0.0/banks/bb.01.nl.nl/accounts/MyAccount/owner/transactions";
    	
    	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(obpTransactions).queryParam("ACCOUNT_ID", accountID);

        System.out.println(builder.toUriString());
        Transactions transactions = (Transactions) getResponse(builder.build().encode().toString(),Transactions.class);
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }

}
