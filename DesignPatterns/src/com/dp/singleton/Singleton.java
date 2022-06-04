package com.dp.singleton;

public class Singleton {

    private static SharedResource sharedResource;

    private Singleton() {}

    public static SharedResource getSharedResource(String value) {
        if (sharedResource == null) {
            sharedResource = new SharedResource(value);
        }
        return sharedResource;
    }

    public static String hello(String v) {
        return getSharedResource(v).getValue();
    }
}
