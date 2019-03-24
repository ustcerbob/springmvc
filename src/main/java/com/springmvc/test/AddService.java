package com.springmvc.test;

import java.util.concurrent.locks.ReentrantLock;

public class AddService{
    private int value = 0;

    private ReentrantLock lock = new ReentrantLock();

    public void add(){
        lock.lock();
        value++;
        System.out.println(Thread.currentThread().getName());
        lock.unlock();
    }

    public int getValue(){
        return value;
    }
}