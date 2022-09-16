/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 * https://leetcode.com/problems/count-items-matching-a-rule/
 */

package LeetCode.DSA.String;

import java.util.ArrayList;
import java.util.List;

class E_1773_Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        List<String> innerList = new ArrayList<>();

        // Adding elements to innerList
        innerList.add("phone");
        innerList.add("blue");
        innerList.add("pixel");

        // Adding innerList to listOfLists
        items.add(innerList);
        List<String> innerList2 = new ArrayList<>();
        innerList2.add("computer");
        innerList2.add("silver");
        innerList2.add("lenovo");

        // Adding innerList to listOfLists
        items.add(innerList2);

        List<String> innerList3 = new ArrayList<>();
        innerList3.add("phone");
        innerList3.add("gold");
        innerList3.add("iphone");

        // Adding innerList to listOfLists
        items.add(innerList3);
//        System.out.println("Modified list : " + items.toString());
        System.out.println(countMatches(items, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex;
        int rk = -1;
        if(ruleKey.equals("type"))
            rk=0;
        else if(ruleKey.equals("color"))
            rk=1;
        else
            rk=2;

        int count = 0;
        for (List<String> stringList : items){
            if(stringList.get(rk).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}