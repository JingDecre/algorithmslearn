package com.code.decre.algorithms.demo;

/**
 * @author liaofa
 * @date 2019/9/12
 * 求小于某数的最大回文积
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(bigPalindrome(666));
    }

    /**
     * 求最大回文积
     * @param digits
     * @return
     */
    public static int bigPalindrome(int digits) {
        if (digits < 2) return digits;
        int num = 0;
        for (int i = digits; i > 0 ; i--) {
            for (int j = digits; j > 0 ; j--) {
                int product = i * j;
                if (product > num && palindrome(product)) num = product;
            }
        }
        return num;
    }


    /**
     * 判断是否是回文数
     * @param num
     * @return
     */
    private static boolean palindrome(int num) {
        String numStr = String.valueOf(num);
        if (numStr.equals(strReverseWithRecursive(numStr))) return true;
        return false;
    }

    /**
     * 字符串反转
     * @param string
     * @return
     */
    private static String strReverseWithRecursive(String string){
        if(string==null||string.length()==0)return string;
        int length = string.length();
        if(length==1){
            return string;
        }else{
            return  strReverseWithRecursive(string.substring(1))+string.charAt(0);
        }
    }
}
