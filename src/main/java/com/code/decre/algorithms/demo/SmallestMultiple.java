package com.code.decre.algorithms.demo;

/**
 * @author liaofa
 * @date 2019/9/12
 * 求1-某数的最小倍数
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        System.out.println(smallestMultiple(4));
    }

    public static int smallestMultiple(int num) {
        int product = num * (num - 1);
        int m = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            m = product * i;
            for (int j = 2; j <= num; j++) {
                if (m % j != 0) break;
                if (j == num) return m;
            }
        }
        return m;
    }

}
