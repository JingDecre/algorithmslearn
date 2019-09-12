package com.code.decre.algorithms.demo;

/**
 * @author liaofa
 * @date 2019/9/12
 */
public class SelectSort {

    private static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            if (i != index) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }
}
