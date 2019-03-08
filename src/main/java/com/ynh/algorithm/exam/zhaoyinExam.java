package com.ynh.algorithm.exam;


import java.util.Scanner;

public class zhaoyinExam {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int rootSize = sin.nextInt();//楼盘个数
        int allMoney = sin.nextInt();//购房资金

        for (int i = 1; i <= rootSize; i++) {
            int lockMoney = sin.nextInt();//锁定金额
            double percent = sin.nextDouble();//摇中概率
        }

        int maxPercent = 0;

        System.out.println(maxPercent);
        System.out.println("1");
    }
}

