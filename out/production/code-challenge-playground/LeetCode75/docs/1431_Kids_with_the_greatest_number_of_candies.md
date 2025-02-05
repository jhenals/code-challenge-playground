# Approach
<!-- Describe your approach to solving the problem. -->
1. 1st loop: Find the maximum candies any kid has inthe candies array.
2. 2nd loop: Check the potential of each kid. For each kid, add the extraCandies and compare if it would be greater than the maxCandies. 

# Complexity
- Time complexity: O(N) because i need to iterate through all elements in the array to find the maximum candies and to compare each kid's candies with the extraCandies to the maximum candies. 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(N) for the result list.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { 
        List<Boolean> result= new ArrayList<>();
        int maxCandies = 0;
        for( int candy: candies ){
            maxCandies = candy>maxCandies ? candy: maxCandies;
        }

        for( int candy: candies){
            result.add(candy + extraCandies >= maxCandies);
        }
            
        return result;
    }
}
```
