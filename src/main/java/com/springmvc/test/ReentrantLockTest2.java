package com.springmvc.test;

import java.util.concurrent.CountDownLatch;

public class ReentrantLockTest2 {

    //测试非公平锁顺序
    public static void main(String[] args) {
        AddService addService = new AddService();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threadNum; i++) {
            new Thread(()-> {


                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                addService.add();
                countDownLatch.countDown();
            }).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("耗时："+(System.currentTimeMillis()-start));
        System.out.println(addService.getValue());

    }






}
