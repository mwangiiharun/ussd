package org.msurvey.ussd.web;

import org.apache.log4j.Logger;
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
    private final Logger logger=Logger.getLogger(this.getClass());


    @RequestMapping(method = RequestMethod.GET, value = "/ussd", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> processUssd (@RequestParam (required = false) Map<String, String> params){

        logger.info(params);
        String response="END Test works";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
