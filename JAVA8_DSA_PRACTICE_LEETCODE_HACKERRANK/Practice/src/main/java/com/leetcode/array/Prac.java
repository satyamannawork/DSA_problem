package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Prac {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4}; ///2, 4, 1 //[7,1,5,3,6,4] // [1,2,3,4,5] // [7,6,4,3,1] // [6,1,3,2,4,7]
        //System.out.println(maxProfit(arr) );
        // System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(checkInclusion("abc", "ccccbbbbaaaa"));
        ;
    }

    public static int maxProfit(int[] prices) {
        int diff = 0;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int totalProfit = profit;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }


            diff = prices[i] - min;

            if (diff > profit) {
                profit = diff;


            }

            if (diff < profit) {
                //if (!flag) {
                totalProfit += profit;
                //}
                profit = 0;
                //flag = true;
                min = prices[i];
            }


        }

        return totalProfit != 0 ? totalProfit + profit : profit;
    }


    public static int lengthOfLongestSubstring(String s) {
        char[] arr = "dvdf".toCharArray(); // dvdf
        int right = 0;
        int left = 0;
        int maxWindowsSize = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        while (right < arr.length) {
            if (!map.containsKey(arr[right])) {
                map.put(arr[right], right);
            } else {
                left = Math.max(map.get(arr[right]) + 1, left);
                map.put(arr[right], right);
            }
            right++;
            maxWindowsSize = Math.max(maxWindowsSize, right - left);
        }
        return maxWindowsSize;

    }

    public static boolean checkInclusion(String s1, String s2) {


        s1 = "a";
        s2 = "ab";
        if (s2 == null || s2.isEmpty()) {
            return false;
        }
        int right = 0;
        int left = 0;
        int[] cache = new int[128];
        Arrays.fill(cache, -1);
        for (int i = 0; i < s1.length(); i++) {
            char current = s1.charAt(i);
            cache[current] = i;
        }
        if (s1.length() == 1 &&
                s2.length() == 2 && (s2.charAt(left) == s1.charAt(0) || s2.charAt(right) == s1.charAt(0))) {
            return true;
        }

        if (s1.length() == 1 &&
                s2.length() == 1 && (s2.charAt(left) == s1.charAt(0))) {
            return true;
        } else {
            while (right < s2.length()) {
                char current = s2.charAt(right);
                if (cache[current] == -1) {
                    left++;
                } else {
                    if (right > 0 && s2.charAt(right) == s2.charAt(right - 1)) {
                        left = right;
                    }
                    cache[current] = left;
                    if ((right - left) + 1 == s1.length()) {
                        return true;
                    }
                }
                right++;
            }
        }

        return false;


    }


}
