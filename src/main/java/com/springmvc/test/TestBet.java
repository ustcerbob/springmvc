package com.springmvc.test;

import java.util.Scanner;

public class TestBet {

    public static void main(String[] args){
        double alreadyLose=0;
        double interest = 0;
        double rate=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入已经输的金额：");

        alreadyLose = scanner.nextDouble();
        System.out.println("输入这次盘口的浮盈比例：");

        interest = scanner.nextDouble();
        System.out.println("输入想要达到的收益：");

        rate = scanner.nextDouble();

        double needPay = 0;
        needPay = alreadyLose*(1+rate)/(interest - rate);
        System.out.println("这次需要购买："+needPay);
    }
}

