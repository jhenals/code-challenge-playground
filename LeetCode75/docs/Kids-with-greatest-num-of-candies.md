# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem is about determining which kid/kids, after receiving a certain number of extra candies, can have the greatest or equal number of candies compare to others. The intuition is that, if a kid's candies plus the extra candies are atleasst equal to the current maximum, then that kid can be one of the top candy holders.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Find the maximum number of candies any kid currently has.
2. Iterate through each kid's candies and check if their candies plus the extra candies are greater than or equal to the maximum.
3. Store the result in a List<Boolean>, where ```true``` means the kid can have the maximum candies and ```false``` otherwise. 
4. Return the list containing the boolean values. 

# Complexity
**Time complexity:O(n)**
- Finding the maximum values takes O(n) 
- Iterating through the ```candies``` array to compute the sum takes O(n)
- Total time complexity is O(n)+O(n)=O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

**Space complexity:O(n)** due to the output list. 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=maxArray(candies);
        List<Boolean> result= new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }

    private int maxArray(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
```
