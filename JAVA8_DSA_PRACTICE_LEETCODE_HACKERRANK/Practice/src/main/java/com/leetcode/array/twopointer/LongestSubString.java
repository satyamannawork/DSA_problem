package com.leetcode.array.twopointer;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubString {


    public static void main(String[] args) {
        int[] arr =  { 7,1,5,3,6,4 }; ///2, 4, 1 //[7,1,5,3,6,4] // [1,2,3,4,5]
        lengthOfLongestSubstring2("asdsddkol");

    }

    //. my attempt
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = "dvdf".toCharArray(); // dvdf
        int right = 0;
        int left =0 ;
        int maxWindowsSize = Integer.MIN_VALUE;
        HashMap<Character , Integer> map = new LinkedHashMap<>();
        while (right < arr.length) {
            if (!map.containsKey(arr[right])) {
                map.put( arr[right], right );
            }else{
                left = Math.max(map.get(arr[right]) + 1, left);
                map.put( arr[right], right );
            }
            right++;
            maxWindowsSize = Math.max(maxWindowsSize, right - left);
        }
        return maxWindowsSize;

    }
    // best way
    public static int lengthOfLongestSubstring2(String s) {
        char[] arr = "dvdf".toCharArray(); // dvdf
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // 2. Using int[] instead of LinkedHashMap for O(1) space and better performance
        // Use 128 for standard ASCII or 256 for extended
        int[] lastSeen = new int[128];
        java.util.Arrays.fill(lastSeen, -1); // Initialize with -1

        int left = 0;
        int maxWindowSize = 0;
        //char[] arr = s.toCharArray();

        for (int right = 0; right < arr.length; right++) {
            char current = arr[right];

            // 3. The "Jump" logic you correctly identified
            if (lastSeen[current] >= left) {
                left = lastSeen[current] + 1;


            }

            lastSeen[current] = right;
            maxWindowSize = Math.max(maxWindowSize, right - left + 1);
        }

        return maxWindowSize;

    }




}
