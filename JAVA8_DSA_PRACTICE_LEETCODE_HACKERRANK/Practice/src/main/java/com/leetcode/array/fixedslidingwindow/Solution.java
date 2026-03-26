package com.leetcode.array.fixedslidingwindow;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String small, String big) {
        int [] s2freq = new int[26];
        int [] s1freq = new int[26];
        for (int i=0;i<small.length();i++){
            s1freq[small.charAt(i)-'a']++;
        }
        int gg = 0 ;
        s1freq[ gg ]++ ;
        int start = 0;
        int end = 0;
        while (end < big.length()){
            s2freq[big.charAt(end)-'a']++;
            if(end-start+1 == big.length()){
                if(Arrays.equals(s1freq,s2freq)){
                    return true;
                }
                s2freq[big.charAt(start)-'a']--;
                start++;
            }
            end++;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkInclusion("ab","eidbaooo"));
    
    }
}