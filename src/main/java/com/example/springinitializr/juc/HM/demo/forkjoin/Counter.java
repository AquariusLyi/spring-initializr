package com.example.springinitializr.juc.HM.demo.forkjoin;

public class Counter {

    public static void main(String[] args) {

        int j = 0;
        for (int i = 0; i < 1000; i++) {
            j+=i;
        }

    }
}
