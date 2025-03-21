package com.test.testapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public interface HelloApi {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable String name);

}
