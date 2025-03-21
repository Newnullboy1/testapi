package com.test.testapi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        String name = "Phumiphas";
        String expected = "Hello " + name;
        String result = controller.hello(name);

        assertEquals(expected, result);
    }
}