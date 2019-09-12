package com.code.decre.algorithms.demo;

/**
 * @author liaofa
 * @date 2019/9/12
 *
 */
public class PrimeFactors {

    /**
     * 求最大质因数
     */
    public static long primeFactors(long number) {
        if (number == 1) return 1;
        for (int i = 2; i < number; i++) {
            if ( number % i == 0) return primeFactors(number / i);
        }
        return number;
    }


    public static void main(String[] args) {
        System.out.println(primeFactors(60085));
    }
}
