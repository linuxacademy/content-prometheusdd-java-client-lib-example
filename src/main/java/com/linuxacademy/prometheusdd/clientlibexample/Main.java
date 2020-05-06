package com.linuxacademy.prometheusdd.clientlibexample;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Counting to 1000...");
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Done counting!");
    }

}
