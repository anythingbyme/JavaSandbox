package com.dp.abstractfactory;

public interface IDevice {
    void init();
    void execute();
    void abort();
    void retry();
    void shutdown();
}
