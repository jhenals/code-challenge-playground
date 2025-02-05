package Blind75.Arrays;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int j = 0; j < nums.length; j++) {
      map.put(nums[j], j);
    }

    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
      }
    }
    return res;
  }
}
