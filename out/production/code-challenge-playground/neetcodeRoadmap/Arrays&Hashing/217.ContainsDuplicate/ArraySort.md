Runtime: 21ms
Memory: 57.84MB

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Sort the array. Since the elements are all sorted in their natural order,duplicates will remain in the order in which they originally appeared in the array or list. We only need to compare the current element and the next one to check if there are duplicates in the input. 

# Approach
<!-- Describe your approach to solving the problem. -->
1. Use sort method of java's Array class
2. Once sorted, compare i-th and ith+1 element
3. It will return true once the algorithm finds duplicates.

# Complexity
- Time complexity: O(n*logn)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. Sorting the array usign Arrays.sort(nums) takes O(n*logn) time , where n is the number of elements in the array
2. The subsequent loop that compares eleemnts takes O(n) time. 
SInce the sorting step is the dominant factor, it is the overall time complexity of the solution.

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
The space complexity is O(1) because it uses a constant amount od additional space, regardless od the input size. The sorting is performed in-place on the input array and there are no auxiliary data structures with a size dependent on the input

# Code
```
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
           if( nums[i] == nums[i+1] ){
               return true;
           }
        }
        return false;
    }
}
```
