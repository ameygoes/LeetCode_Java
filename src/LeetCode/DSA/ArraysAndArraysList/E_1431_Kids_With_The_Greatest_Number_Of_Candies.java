/*
 * Copyright (c) 8/31/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/31/2022
 * LeetCodeLink - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.ArrayList;
import java.util.List;

public class E_1431_Kids_With_The_Greatest_Number_Of_Candies {
    static int calculateMax(int[] candies){

        int max = Integer.MIN_VALUE;
        for (int element:candies) {
            max = Math.max(element, max);
        }
        return max;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ansList=new ArrayList<Boolean>();

        int max = calculateMax(candies);
        for (int itemIndex = 0; itemIndex < candies.length; itemIndex++) {
            if(candies[itemIndex] + extraCandies >= max ){
                ansList.add(Boolean.TRUE);
            }
            else {
                ansList.add(Boolean.FALSE);
            }

        }
        return ansList;

    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}

