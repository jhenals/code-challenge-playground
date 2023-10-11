Runtime: 10ms
Memory: 54.74MB

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Use Hashset: Hashset is often used in programming to efficiently check for the existence of duplicate elements or to create a collection of unique elements from another collection. 
In our case, we can use Hashset to filter the array input. Once Hashset tries to add an element from the input to an auxiliary container and the element is already present in the auxiliary container (using contains method of Hashset), we can simply return true and the algorithm will stop. 

# Approach
<!-- Describe your approach to solving the problem. -->
1. Create a HashSet (auxiliary container)
2. For loop of the input array and add the current element to  set
3. If the current element is already present in set, the algorithm will return true. 

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
1. For loop takes O(n) time where n is the number of elements in the array
2. Within the loop, contains method has an average time of O(1) because Hashset is designed for efficient lookups. However, in the worst case where there are hash collisions, it can degared to O(n).
3. Thereforse the overall time complexity is O(n)

- Space complexity: O(N)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
Since we use an additional space to create our Hashset, in the worst case where there are no duplicates, the Hashset will store all n unique elements from the input array.

# Code
```
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for( int i=0; i<nums.length; i++ ){
           if(set.contains(nums[i])){
               return true; 
           }
            set.add(nums[i]);
       }
          return false;
    }
}
```
