package com.dp.singleton;

public class SharedResource {
    private String value;

    public SharedResource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
