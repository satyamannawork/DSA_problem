package com.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kids_Greatest_NumberofCandies {


    public static void main(String[] args) {
        Kids_Greatest_NumberofCandies  ob = new Kids_Greatest_NumberofCandies() ;
        int[] arr =  {2,3,5,1,3}  ;
        System.out.println(ob.kidsWithCandies(arr, 3) );

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        // important
        // boxed() ==  maptoObj(Integer :: valueOf) --
        // Comparator.comparing(p-> p) //  compare between each element
        Optional<Integer> a  =
                Arrays.stream(candies).boxed().toList().stream().
                max(Comparator.comparing(p-> p));

        Optional<Integer> a1  =
                Arrays.stream(candies).mapToObj(Integer :: valueOf).toList().stream().
                        max(Comparator.comparing(p-> p));

       // Arrays.stream(candies).mapToObj(Integer::valueOf).sorted().collect(Collectors.toSet()). ;


        //System.out.println(a.get()) ;
        List<Boolean>  list = new ArrayList<>() ;
        int j =0 ;
        for  ( int i =0 ; i<  candies.length  ;  i++ ) {
             int max =  candies[i]  +  extraCandies ;
              list.add(max >= a.get()) ;
        }

        return  list;
    }


    //  Description


    /*
There are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies
the ith kid has, and an integer extraCandies,
denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.



Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
     */
}
