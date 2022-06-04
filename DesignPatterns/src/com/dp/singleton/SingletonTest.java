package com.dp.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    private SharedResource sharedResource;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Inside setup");
        sharedResource = Singleton.getSharedResource("One");
    }

    @Test
    void getSharedResource() {
        sharedResource = Singleton.getSharedResource("One");
        Assertions.assertEquals("One", sharedResource.getValue());
    }

    @Test
    void getSharedResource2() {
        sharedResource = Singleton.getSharedResource("Two");
        Assertions.assertEquals("One", sharedResource.getValue());
    }

    @Test
    void hello() {
        Assertions.assertEquals("hello", Singleton.hello("One"));
    }
}