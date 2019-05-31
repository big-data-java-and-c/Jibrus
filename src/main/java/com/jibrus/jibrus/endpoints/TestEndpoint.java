package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.services.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class TestEndpoint {
    private TestServiceImpl testService;

    @Autowired
    public TestEndpoint(TestServiceImpl testService) {
        this.testService = testService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String cos() {
        return testService.getTest();
    }


}
