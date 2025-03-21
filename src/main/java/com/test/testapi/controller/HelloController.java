package com.test.testapi.controller;

import com.test.testapi.api.HelloApi;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloController implements HelloApi {

    @Override
    public String hello(String name) {
        log.info("Hello {}", name);
        return "Hello " + name;
    }

}
