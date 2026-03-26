package com.leetcode.array;

public class LeftSum_RightSum {


    public int[] leftRigthDifference_more_efficient(int[] nums) {
        int rightSum = 0  ;
        int leftSum =0  ;
        for (int a  :  nums) rightSum += a ;
        for (int i=0 ; i<  nums.length  ;  i++) {
            int val = nums[i] ;
            rightSum -=  val ;
            nums[i]  =  Math.abs(  leftSum - rightSum) ;
            leftSum  += val  ;
        }

        return  nums  ;

    }
    public int[] leftRigthDifference(int[] nums) {
        int[] leftArray = new int[nums.length] ;
        int[] rightArray = new int[nums.length] ;
        int[] diff = new int[nums.length] ;
        int j =0 ;
        for (int i=0 ;i < nums.length ; i++ ){
            leftArray[j++] = sum( 0 , i,  nums);
        }
        j =0 ;
        for (int i=0 ;i < nums.length ; i++ ){
            int startIndex =  i  + 1 ;

            rightArray[j++] = sum( startIndex , nums.length,  nums);
        }
        System.out.println( rightArray);
        for (int i  = 0; i < nums.length  ;  i++) {
            diff [i] =  Math.abs(leftArray[i] - rightArray [i] );
        }
        return  diff ;
    }

    static int  sum(int startIndex, int endIndex , int[] nums) {
        int sum =0;
        for (int i=startIndex ;  i < endIndex ; i ++  ) {

            sum+=nums[i] ;

        }
        return sum ;
    }

    public static void main(String[] args) {
        LeftSum_RightSum ob = new LeftSum_RightSum();
        int[]  arr =  {10,4,8,3};
        System.out.println("first approach");
        for (int i : ob.leftRigthDifference(arr) ) {
            System.out.println(i);
        }
        System.out.println("second approach");
        for (int i : ob.leftRigthDifference_more_efficient(arr) ) {
            System.out.println(i);
        }
    }


}


//  alternate solution

/*
int leftSum = 0, rightSum = 0, n = nums.length;
.//10,4,8,3 --25
left -- [0,10,14,22]
right -- [15,11,3,0]
final result -- [15,1,11,22]
        for(int num : nums) rightSum += num; 25
        for(int i = 0; i < n; i++) {
            int val = nums[i]; //10 4
            rightSum -= val; // 15 //11
            nums[i] = Math.abs(leftSum - rightSum);//15 //1
            leftSum += val; //10
        }
        return nums;
 */

/*
Problem Description
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */