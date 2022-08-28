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

//    THE FIRST APPROACH THAT I TOOK COMPLETELY FAILED BECAUSE,
//    1 <= num.length <= 10^4, SO IT WAS MISRABLY FAILING FOR
//    LARGE NUMBERS !

/*
* THE FIRST APPROACH WAS -
* WRITE A FUNCTION WHICH WILL MAKE ARRAY FROM NUMBER
* WRITE A FUNCTION WHICH WILL MAKE NUMBER FROM ARRAY
* WRITE A FUNCTION WHICH WILL ADD TWO NUMBERS
* CALL EACH OF THE FUNCTION ACCORDINGLY
* TIME COMPLEXITY: O(N)
* SPACE COMPLEXITY: O(N)
* FAILING REASON: NOT ABLE TO ACCOMODATE NUMBERS LONG THAN 20 DIGITS
* */

//    ===========================================================
//    =================  APPROACH 1: FAILED ONE =================
//    ===========================================================
    static List<Integer> getArrayFromNumber(long number){
        List<Integer> arrayList = new ArrayList<>();
        int numberOfDigits = (int) (Math.log10(number))+1;
        System.out.println(number);
        while (numberOfDigits > 0 ){
            double element = Math.pow(10, numberOfDigits-1);
            System.out.println(element);
            double arrayElem = number / element;
            arrayList.add((int)(arrayElem));
            number = (long) (number % element);
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

//    ===========================================================
//    =============  APPROACH 2: OPTIMAL APPROACH ===============
//    ===========================================================
/*
* Continuing the example of 123 + 912, we start with [1, 2, 3+912].
* Then we perform the addition 3+912, leaving 915. The 5 stays as the digit,
* while we 'carry' 910 into the next column which becomes 91.
* We repeat this process with [1, 2+91, 5]. We have 93, where 3 stays and
* 90 is carried over as 9. Again, we have [1+9, 3, 5] which transforms into [1, 0, 3, 5].
*
*/

//    ===========================================================
//      TIME COMPLEXITY: O(max(N, log K))where N is the length of A.
//      Space Complexity: O(max(N, log K)).
//    ===========================================================

    static List getModifiedArray(int[] num, int k){

        int lengthOfArray = num.length;
        int currentAdditionCarry = k;

//        CREATE AM ARRAYLIST TO RETURN
        ArrayList<Integer> ansList = new ArrayList<>();

//        RUN A LOOP WHILE -
//        1. EITHER THE LENGTH OF AN ARRAY EXHAUSTS/ WE TRAVERSED THE WHOLE ARRAY
//        2. WE EXHAUSTED THE NUMBER k WHILE ADDING TO A BIG NUMBER

        while(lengthOfArray >=1 || currentAdditionCarry > 0){

//            TO MAKE RUN THE LOOP OVER ARRAY EVEN IF K EXHAUSTS
            if (lengthOfArray >= 1) {
                currentAdditionCarry = num[lengthOfArray - 1] + currentAdditionCarry;
            }

            ansList.add(currentAdditionCarry%10);
            System.out.println(ansList);
            lengthOfArray--;
            currentAdditionCarry/=10;
            System.out.println(currentAdditionCarry);
        }

        return ansList;
    }
    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

        int k = 516;

//        FUNCTION CALL FOR NON-OPTIMAL SOLUTION
//        System.out.println(getArrayFromNumber(add(getNumberFromArray(num),k)));

//        FUNCTION CALL FOR OPTIMAL SOLUTION
        System.out.println(getModifiedArray(num,k));
    }
}
