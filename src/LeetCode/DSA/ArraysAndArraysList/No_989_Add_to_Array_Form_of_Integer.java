/*
 * Copyright (c) 8/26/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/26/2022
 */
package LeetCode.DSA.ArraysAndArraysList;


//    PROBLEM LINK - https://leetcode.com/problems/add-to-array-form-of-integer/


import java.util.ArrayList;
import java.util.List;

public class No_989_Add_to_Array_Form_of_Integer {

    static List<Integer> getArrayFromNumber(long number){
        List<Integer> arrayList = new ArrayList<>();
        int numberOfDigits = (int) (Math.log10(number))+1;
        while (numberOfDigits > 0 ){
            int element = (int)(Math.pow(10, numberOfDigits-1));
            long arrayElem = number / element;
            arrayList.add((int)(arrayElem));
            number = number % element;
            numberOfDigits--;
        }

        return arrayList;
    }

    static long getNumberFromArray(int[] numArray){
        int arrayLength = numArray.length;
        long number = 0;

        for (int arrayIndex=0; arrayIndex<arrayLength; arrayIndex++){

            number+=numArray[arrayIndex]*(Math.pow(10,(arrayLength-arrayIndex-1)));
        }

        return number;
    }

    static long add(long num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(add(getNumberFromArray(num),k));
        System.out.println(getArrayFromNumber(add(getNumberFromArray(num),k)));
    }
}
