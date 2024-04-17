# Intuition
To determine if s and t are anagrams, we can compare their sorted character arrays. If the sorted character arrays are equal, then the strings are anagrams.

# Approach
1. Convert both strings into character arrays using the toCharArray() mtehod of Strings in Java
2. Sort the character arrays using sort method of Arrays class.
3. Compare the sorted character arrays using equals method of Arrays class. If the method return true, then the s and t are anagrams.

# Complexity
- Time complexity: O(n log n)
1. Converting strings to character arrays : O(n)where n is the length of the strings.
2. Sorting the character arrays: O(nlogn)
3. COmparing using equal method: O(n).
4. Since in Big O notation, O(n log n) is larger than O(n),therefore, time complexity is dominated by the sorting step.

- Space complexity:  O(n)
1. The space complexity is O(n) because we are using additional space (sCharArr and tCharArr) to store the character arrays, where n is the length of the strings. 
Sorting the character arrays in-place would reduce the space complexity to O(1), but the space complexity remains O(n) due to the nature of the problem.

# Code
```
class Solution {
    public boolean isAnagram(String s, String t) {
       char[] sCharArr = s.toCharArray();
       Arrays.sort(sCharArr);

       char[] tCharArr = t.toCharArray();
       Arrays.sort(tCharArr);

       return Arrays.equals(sCharArr, tCharArr);
    }
}
```
