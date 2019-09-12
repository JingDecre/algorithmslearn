package com.code.decre.algorithms.demo;

/**
 * @author liaofa
 * @date 2019/9/12
 * 冒泡排序
 */
public class BubbleSort {

    private static void bubbleSort(int array[]) {
        int length = array.length;
        for (int i = 0; i < length -1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }
}
