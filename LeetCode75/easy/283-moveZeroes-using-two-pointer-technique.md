# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The goal is to move all zeroes to the end of the array while maintining the order of non-zero elements. 

We can use the Two-Pointers Technique:
* `leftP`: Tracks where the next non-zero lement should go
* `rightP`: Scans ahead looking for a non zero to swap with the zero at `leftP`.

Whenever `leftP` is pointing to a 0 and `rightP` finds a non-zero, we swap them.

If `leftP` already points to a non-zero, it means, it's already in the correct place, so we just need to move forward. 


# Approach
<!-- Describe your approach to solving the problem. -->
1. Initialize two pointers:
* `leftP = 0`: potential index of a 0.
* `rightP = 1`: we start scanning from the next element.

2. While `rightP` is within the array bounds, we have two cases:
* if element in `leftP` is aleady zero and element in `rightP` is non-zero, we swap the elements then increment leftP because it is not correctly pointing to a non-zero
* if element in `leftP` is already non-zero, we only increment `leftP`

In both cases, we always increment `rightP` to keep scanning ahead.

3. We continue until the entire array is processed. 

# Complexity
- Time complexity:$$O(n)$$ where n is the length of the array. Each eleemnt is visited at most once by each pointer while swapping is done in constant time.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$ because we are doing an in-place modification and no extra space is used. 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public void moveZeroes(int[] nums) {
        int leftP=0;
        int rightP=leftP+1;

        while(rightP<nums.length){
            if(nums[leftP]==0 && nums[rightP]!=0){
                nums[leftP]=nums[rightP];
                nums[rightP]=0;
                leftP++;
            }else if(nums[leftP]!=0){
                leftP++;
            }
            rightP++;
        }
    }    
}
```
