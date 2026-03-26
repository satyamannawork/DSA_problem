package com.leetcode.array;

public class LongestSubstringWithoutRepeatingCharacters {


    public static void main(String[] args) {
        System.out.printf("Maximum subarray sum"
                + " " + lengthOfLongestSubstring("abcabcbb"));

    }

    public static  int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        String st= "" ;
        for (int  right = 0 ;  right < arr.length -1 ;  right++){
            if(!st.contains(String.valueOf(arr[right])))  {
                st = st.concat(String.valueOf(arr[right]));
            }



        }
        return st.length() ;
    }
}
