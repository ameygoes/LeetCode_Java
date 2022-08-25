/*
 * Copyright (c) 8/23/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/23/2022
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.Arrays;

public class No_1920_BuildArrayFromPermutation {

//    PROBLEM LINK - https://leetcode.com/problems/build-array-from-permutation/


//=====================================================
//    BRUTE FORCE SOLUTION
//    TIME COMPLEXITY - O(n)
//    SPACE COMPLEXITY - O(n)
//    REALLY FAST - 1 ms
//=====================================================
    public static int[] buildArrayBruteForce(int[] givenArray) {

    //    MAKE NEW ARRAY FOR STORING THE NEW VALUES/ PERMUTED VALUES
        int[] answerArray = new int[givenArray.length];

    //    RUN A FOR LOOP OVER THE GIVEN ARRAY AND UPDATE THE NEW ARRAY VALUES
        for(int indexOfOriginalArray = 0; indexOfOriginalArray < givenArray.length; indexOfOriginalArray++ ){
            answerArray[indexOfOriginalArray] = givenArray[givenArray[indexOfOriginalArray]];
        }

    //    RETURN THE UPDATED ARRAY
        return answerArray;
    }


/*=====================================================
//    SPACE OPTIMIZED SOLUTION
//    TIME COMPLEXITY - O(n)
//    SPACE COMPLEXITY - O(1)
//    TAKES LONGER TIME TO RUN - 3 ms

 Explanation:
 We have to use the same array to avoid extra space complexity,
 so to accomplish that, we need to change the existing values such that
 it should contain either the correct value/ final values that
 are required or we should have a number there such that, we can extract
 both(existing value of an array and the expected value) the values, from that number.

 Let's say if we go by the first rule, we can't swap or modify the single value as the
 indexes are randomized. So first option is automatically out of question.

 For the second option, we can imagine any number can be defined as -

 Number = Quotient*CONSTANT + Remainder

 Hence, given a Number, we can easily get, either Quotient or Remainder just by
 Dividing(/) or Using Modulo(%) Operator.
 and the condition on CONSTANT MUST BE, IT SHOULD BE GREATER THAN THE MAXIMUM NUMBER IN ARRAY,
 Otherwise the division might result in different values, which we don't want.

 So we will go with the CONSTANT as length of an array.


 So, what we will do is,
 we can update the given number at index i as -
 NumberAtPositionI = CONSTANT*(givenArray[givenArray[postionI]]%CONSTANT) + NumberAtPositionI

WE NEED A %CONSTANT OPERATOR TO GET THE EXPECTED NUMBER

givenArray[givenArray[postionI]]%CONSTANT - THIS TERM IS OUR QUOTIENT WHICH THE PERMUTED ELEMENT
ITSELF

SO TO FIND THE PERMUTED ARRAY WE WILL JUST DIVIDE ARRAY BY CONSTANT
//==================================================== */




    public static int[] buildArraySpaceOptimized(int[] givenArray) {

        //    WE WON'T NEED THE FOLLOWING ARRAY
//        int[] answerArray = new int[givenArray.length];

        int CONSTANT =  givenArray.length;

        //    RUN A FOR LOOP OVER THE GIVEN ARRAY AND UPDATE THE NEW ARRAY VALUES
        for(int indexOfOriginalArray = 0; indexOfOriginalArray < CONSTANT; indexOfOriginalArray++ ){

//            PRINT TO UNDERSTAND WHAT'S GOING ON
            System.out.println("PERMUTED VALUE: " + (CONSTANT*(givenArray[givenArray[indexOfOriginalArray]]%CONSTANT) + givenArray[indexOfOriginalArray]) + " = "
            + CONSTANT + " * ( " + givenArray[givenArray[indexOfOriginalArray]] + " % " + CONSTANT +
                            " ) + " + givenArray[indexOfOriginalArray]
            );

            givenArray[indexOfOriginalArray] = CONSTANT*(givenArray[givenArray[indexOfOriginalArray]]%CONSTANT) + givenArray[indexOfOriginalArray];

        }

//        PRINT THE UPDATED ARRAY TO SEE VALUES IN BETWEEN
//        System.out.println(Arrays.toString(givenArray));


        for(int indexOfOriginalArray = 0; indexOfOriginalArray < CONSTANT; indexOfOriginalArray++ ){
            givenArray[indexOfOriginalArray] = givenArray[indexOfOriginalArray]/CONSTANT;
        }

        //    RETURN THE UPDATED ARRAY
        return givenArray;
    }


    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4}; //{5,0,1,2,3,4}

//        Expected output sample case 2 - [0,1,2,4,5,3]
//        Expected output sample case 2 - [4,5,0,1,2,3]
        System.out.println("Array with Brute Force: " + Arrays.toString(buildArrayBruteForce(nums)));
        System.out.println("Array with Space Optimized: " + Arrays.toString(buildArraySpaceOptimized(nums)));


    }
}
