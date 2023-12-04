# Problem Description

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.


-------------------------------------------------------

# My Solution

## Approach
<!-- Describe your approach to solving the problem. -->
I used StringBuilder so i can easily use the append method to append the element in i-th position to my return variable. I used the length of the input with the smallest dimension(length) for my for loop so that i can easily apped the remaining substring of the input with the longest size. 
Ultimately, because i used StringBuilder, i need to transform res into a string using toString method.

## Complexity
- Time complexity:O(minLength + maxLength)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
The time complexity of your mergeAlternately method is O(minLength + maxLength), where minLength is the length of the shorter input string (word1 or word2), and maxLength is the length of the longer input string.

The loop runs for minLength iterations, and within each iteration, constant-time operations (character access, append) are performed.
The substring method takes O(maxLength - minLength) time, as it copies characters from the longer string.
Therefore, the overall time complexity is O(minLength + maxLength).

- Space complexity: O(minLength + maxLength)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
The space complexity is O(minLength + maxLength), which is dominated by the StringBuilder (res) and the longerString variable.

The res StringBuilder has a space complexity of O(minLength + maxLength), as it stores the merged characters.
The longerString variable has a space complexity of O(maxLength), as it holds the reference to the longer input string.
Therefore, the overall space complexity is O(minLength + maxLength).

## Code
```
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        String longerString = (word1.length() > word2.length()) ? word1 : word2;

        for (int i = 0; i < minLength; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }

        res.append(longerString.substring(minLength));

        return res.toString();
    }
}
```
