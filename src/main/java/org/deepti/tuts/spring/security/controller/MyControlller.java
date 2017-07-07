package org.deepti.tuts.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControlller {

    @RequestMapping("/protected")
    public  String getProtected() {
        return "Protected response";
    }
}

