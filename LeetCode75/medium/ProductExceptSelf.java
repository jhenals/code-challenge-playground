package LeetCode75.medium;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

public class ProductExceptSelf {
  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] answer = new int[n];

    int prefix = 1, suffix = 1;
    //prefix
    for (int i = 0; i < n; i++) {
      answer[i] = prefix;
      prefix *= nums[i];
    }

    //suffix
    for (int i = n - 1; i >= 0; i--) {
      answer[i] *= suffix;
      suffix *= nums[i];
    }
    return answer;
  }//productExceptSelf

  private static String printArray(int[] a) {
    StringBuilder sb = new StringBuilder(500);
    sb.append("[");
    for (int i = 0; i < a.length; i++) {
      sb.append(a[i]);
      if (i == a.length - 1)
        sb.append("]");
      else
        sb.append(",");
    }
    return sb.toString();
  }//printArray

  public static void main(String[] args) {
    int[] n1 = {1, 2, 3, 4};
    System.out.println(printArray(productExceptSelf(n1)));
  }
}
