package com.interview.interview.juc;

/**
 * @PackageName com.interview.interview.juc
 * @ClassName Cas
 * @Description
 * @Author XuFeng
 * @Date 2023-02-13 10:29:12
 */
public class Cas {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final Cas test = new Cas();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 1000; j++)
                        test.increase();
                }

                ;
            }.start();
        }
        while (Thread.activeCount() > 1)
            Thread.yield();
        System.out.println(test.inc);
    }
}
