package ru.isntrui.holodos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ReceiptController {
    WebClient client = WebClient.create("https://proverkacheka.com/api/v1/check/get");

    @PostMapping("receipt")
    public ResponseEntity<String> getProductsFromReceiptToHolodos(@RequestBody String qr) {
        Map<String, String> bodyMap = new HashMap<>();
        bodyMap.put("qrraw", qr);
        bodyMap.put("token", "{{sensitive data}}");

        try {
            return ResponseEntity.status(200).body(client
                    .post()
                    .body(BodyInserters.fromValue(bodyMap))
                    .retrieve()
                    .bodyToMono(String.class)
                    .block());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

}
