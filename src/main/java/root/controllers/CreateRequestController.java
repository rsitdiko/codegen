package root.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import root.api.AddApi;
import root.services.SomeService;

@Controller
public class CreateRequestController implements AddApi {

    @Autowired
    private SomeService someService;


    @Override
    public ResponseEntity<Integer> addTwoNumbers(Integer firstNumber, Integer secondNumber) {

        System.out.println("ASDFASDFASDF");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");

        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body(firstNumber + secondNumber);
    }
}
