package org.msurvey.ussd.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("v1")
public class UssdController {


    @RequestMapping(method = RequestMethod.GET, value = "/ussd", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<HashMap<String, Object>> processUssd (@RequestParam (required = false) String request){
        HashMap<String, Object> response= new HashMap<>();
        response.put("Status", true);
        response.put("Message", "Success");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
