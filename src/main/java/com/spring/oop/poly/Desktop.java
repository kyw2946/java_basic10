package com.spring.oop.poly;

public class Desktop {
    Monitor monitor;

    double[] arr;

    public Desktop() {
        this.monitor = new LgMonitor();

        arr = new double[]{10, 20, 30, 40};
    }
}
