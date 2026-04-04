package com.gla.LifeCycle;

public class A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Harsh");
        }
    }

    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
    }
}
