package LeetCode.DSA.Sorting;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class E_448_Find_All_Missing_Numbers_In_An_Array {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        List<Integer> outputList = new ArrayList<>();

        while(i < arr.length){
            int correctIndex = arr[i];
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index=0; index<arr.length;index++){
            if(arr[index] != index){
                outputList.add(index+1);
            }
        }
        return outputList;

    }

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}