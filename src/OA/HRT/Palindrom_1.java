/*
 * Copyright (c) 10/9/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 10/9/2022
 */

/*Problem - You are given a string inputStr. How many total ways are there of adding zero or one letter to this string to make it a permutation of some palindrome. Note that the answer doesn't exceed 27 - you can either add zero letters, or add any one of the 26 letters of English alphabet. Adding the same letter to different places of the initial string counts only once.
        Example

        For inputStr = "aabb", the output should be solution ( inputStr ) = 27.
        Explanation: "aabb" can be transformed to a palindrome "abba" by rearranging the letters even without adding an extra letter. It is also possible to add any of 26 letters of English alphabet in between "ab" and "ba": "ababa", "abbba", "abcba", etc. So, in this example there are 1 + 26 = 27 ways to make inputStr a permutation of some palindrome.

        Note that it's also possible to construct a palindrome "baab" from the initial string and add any of 26 English letters to it to obtain another 5 - letter palindrome, but that's doesn't count as a new way.

        For inputStr = "abbb", the output should be solution ( inputStr ) = 2.
        Explanation: "abbb" can be transformed into palindrome "abbba" or "bbabb" by adding extra letter "a" or "b" respectively and rearranging the letters.*/
package OA.HRT;

public class Palindrom_1 {
}
