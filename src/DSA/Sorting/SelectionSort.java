/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package DSA.Sorting;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] num = {5,4,2,3,1};
//        int[] num = {1};
//        int[] num = {};
//        int[] num = {1,2,3,4,5};
//        int[] num = {0,1};
        int[] num = {5,0,-2,32,1};
        System.out.println(Arrays.toString(selectionSort(num)));
    }
    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaximumIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    public static int getMaximumIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {

            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
