
# Problem
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.


Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.

------------------------------------------------------------------------------------------------------------
# My Solution

## Approach
When we concatenate the 2 strings ( str1 first then followed by str2 ) and we do the same but we consider str2 first, we can say that the 2 strings has greatest common divisor when the two operations give the same exact string (example 1 and 2). However, if the two strings are equal, then there is no gcd therefore it will return null (example 3)
When the common divisor exist, we can calculate the GCD using the Euclidean algorithm which is the classic recursive implementation of for finding the greatest common divisor (GCD) of two integers a and b.
The base case is when b becomes zero, and in that case, the GCD is a. Otherwise, it recursively calls itself with the arguments b and a % b until the base case is reached.

## Complexity
### Time complexity: O(log(min(str1.length(), str2.length())))
The time complexity is mainly determined by the gcd method, which implements the Euclidean algorithm for finding the greatest common divisor.

The time complexity of the Euclidean algorithm is O(log(min(a, b))), where a and b are the input values. In this case, the inputs are the lengths of the two input strings, so the time complexity of the gcd method is O(log(min(str1.length(), str2.length()))).

### Space complexity:O(log(min(str1.length(), str2.length())))
The space complexity is determined by the space used in the recursive calls of the gcd method. The recursive calls use the call stack space, which is proportional to the depth of the recursion.

The maximum depth of the recursion is log(min(a, b)), where a and b are the input values. In this case, the inputs are the lengths of the two input strings, so the space complexity of the gcd method is O(log(min(str1.length(), str2.length()))).

The findGCDString method itself does not use any significant additional space that depends on the input size, so its space complexity is considered negligible.

## Code

```
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return (str1 + str2).equals(str2 + str1) ?
            str1.substring(0, gcd(str1.length(), str2.length())) : "";
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

}
```
