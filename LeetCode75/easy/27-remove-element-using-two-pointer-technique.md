# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To solve the problem in-place, we need to overwrite the elements, in particularly, the elements that are equal to `val` with the elements that are not equal to `val`.
We'll use a two-pointer approach:
* `i` - pointer that go through all the elements
* `k` - pointer that tracks where the next non-val element should be.

# Approach
<!-- Describe your approach to solving the problem. -->
1. We initialize the k pointer which count the non-val elements
2. Inside the for-loop, we use i pointer to check search for the next non-val element. If the current element is not equal to val, then we move the current non-val element to the front (k pointer). 
3. We increase count of the non-val elements.
4. When all the elements are checked, we simply return k which is the number of non-val elements. 

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
```
