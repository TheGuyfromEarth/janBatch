package strings;

/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

        Example 1:

        Input: s1 = "ab", s2 = "eidbaooo"

        Output: true

        Explanation: s2 contains one permutation of s1 ("ba").

        Example 2:

        Input: s1 = "ab", s2 = "eidboaoo"

        Output: false

        Constraints:

        1 <= s1.length, s2.length <= 104

        s1 and s2 consist of lowercase English letters.*/

import java.util.ArrayList;

public class StringPermutation {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        // find all permutations for s1 and store them in a list

        ArrayList<String> list = new ArrayList<>();
        String str = "";

//        for(int i=0;i<s1.length();i++){
//            for(int j=0;j<s1.length()-1;j++){
//                str = s1.charAt(i) +
//
//            }
//        }

        // recursion


    }
}

// abc

// abc
// acb


// bac
// bca
// cab
// cba

