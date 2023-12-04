# Problem Description
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
## Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
## Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exist

-----------------------------------------------------
# My Solution

## Intuition
This is not an efficient way of solving the problem but the easiest and the first that will come to mind. My first thought is to try all the possible combinayion and find the two elements that will give me the target as their sum.

## Approach
I set eah element as the first number. Then i iterate on all the numbers after the current element to find the second number.

## Complexity
### Time complexity:
O(n^2) -> for each number (given n elements), i need to do another for-loop to find the complementary which takes another O(n).

### Space complexity:
O(1) constant because the result array does not depend on the size of the input.

## Code
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]= new int[2]; 
        for( int i= 0; i<nums.length; i++){
            for ( int j=i+1; j<nums.length; j++){
                if( nums[i]+nums[j] == target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}
``` 
