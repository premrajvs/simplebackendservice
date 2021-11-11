package com.performanceengineering.simplebackendservice.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
@Service
public class simpleservice {
    int iHitsCountSinceLaunch = 0;

    @RequestMapping(method = RequestMethod.GET)
    public String getSampleResponseString() {
        try {
            iHitsCountSinceLaunch++;
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return "HitCount : " + iHitsCountSinceLaunch;
    }
}
