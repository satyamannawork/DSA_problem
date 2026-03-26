package com.leetcode.array.twopointer;

public class ContainerWithMostWater {




    public static void main(String[] args) {
        int[] arr  = {1,2, 3, 9, 8}  ;
        System.out.println(maxArea(arr));
    }




    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = ( height.length - 1 ) ;

        while (left < right) {
            int distance = right - left;
            maxArea = Math.max( distance * Math.min(height[left], height[right]), maxArea);

            if (height[left] < height[right]) {

                left++;

            } else {
                right--;
            }
        }

        return maxArea;

    }
}
