# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
In my previous approach, i sorted first the char arrays, in this approach we will directly count the mismatches while iterating through the strings.

# Approach
<!-- Describe your approach to solving the problem. -->
- I will use an auxialary space to save the indices of the mismatched characters.
- If the size of the list is more than 2, then we return false immediately because it means the two strings are not equal when one swapping operation is performed.
- If the size of the list is exactly two, we need to check if the characters are equal.
# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1) we store at most 2 indices.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


# Code
```java []
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

        List<Integer> mm= new ArrayList<>();

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                mm.add(i);
            }
            if(mm.size()>2) return false;
        }

        return mm.size()==2 && s1.charAt(mm.get(0))==s2.charAt(mm.get(1)) &&
        s1.charAt(mm.get(1))==s2.charAt(mm.get(0));


    }
}
```
