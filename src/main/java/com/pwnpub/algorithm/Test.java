package com.pwnpub.algorithm;

import com.pwnpub.recursion.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Giannis
 * @date 2020-07-09 00:46
 * @desc
 */
class Solution {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumHash(int[] sum, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < sum.length; i++) {
            if (hashtable.containsKey(target - sum[i])) {
                return new int[]{hashtable.get(target - sum[i]), i};
            }
            hashtable.put(sum[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int [] sums = {2, 5, 7, 8, 9};
        int target = 10;
        int[] ints = twoSumHash(sums, target);
        for (int a : ints) {
            System.out.println(a);
        }
        Arrays.asList(ints).forEach(single -> System.out.println(single));
        Arrays.asList(ints).forEach(System.out::println);
    }
}