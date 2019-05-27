package com.jibrus.jibrus.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TestEndpoint {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
public String cos(){
    return "hellol world";
}
}
