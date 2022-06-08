package com.dp.abstractfactory;

public class Device implements IDevice {
    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }

    @Override
    public void abort() {
        System.out.println("Abort");
    }

    @Override
    public void retry() {
        System.out.println("retry");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown");
    }
}
