# Two Sum using HashMap

## Intuition
Inorder to make time complexity better than O(n^2), we need to make sure that we scan the array only one time. We can use a HashMap to store the numbers encountered so far. In our Hashmap, we need to put as <Key, Value> this pair : <nums[i], i> where nums[i] is the element and i is the index. 

For each element, we are sure that it is one of the combination that we need if its complement to reach the target is already in HashMap. In other words: target- current element = val. If val is already in the HashMap then we just need to return it's corresponding index. 

## Approach
1. Initialize an empty HashMap, with the key being the number itself and the value its index.
2. Iterate through the array.
3. For each element, calculate the complement needed to reach the target by subtracting the current eleemnt from the target. 
4. Check if this complement exists in the HashMap. If it does, return the indices of the current elementn and the complement from the HashMap. If it doesn't, add the current element to the HashMap. 

# Complexity
- Time complexity:O(n)
The time complexity is O(n) because we iterate through the array once, and for each element, we perform constant-time oepration such as checking for the complement in the HashMap and adding elements to the hashMap


- Space complexity: O(n)
The space complexity is also O(n) because in the worst case, we may need to store all elements of the array in the HashMap

## Code
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]= new int[2]; 
        HashMap<Integer, Integer> hm = new HashMap<>();

        for( int i= 0; i<nums.length; i++){
            int val = target - nums[i];
            if ( hm.containsKey(val) ){
                res[0]=i;
                res[1] = hm.get(val);
            }else{
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}
```
