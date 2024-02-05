# Problem
Given an integer x, return true if x is a palindrome, and false otherwise.

## Examples
**Example 1:**
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

**Example 2:**
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

**Example 3:**
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

_Constraints:_
-231 <= x <= 231 - 1

_____________________________________________________________________________________________________________________________________

# My Solution

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Instead of transforming inyo a string, we can use the module operation to extract each digit from the ones values up to the largest values. While we are extractingthe digits, we can save it to a variable and at the end, ask if the input number and the variable of the reversed number are equal.

# Approach
<!-- Describe your approach to solving the problem. -->
Reverse the number x using a while loop, and then compare the reversed number with the original number. If they are equal, the input integer is a palindrome.

# Complexity
- Time complexity: O(log10(x))
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
The time complexity of your solution is O(log10(x)), where x is the input integer. In the while loop, you repeatedly divide tempNum by 10 until it becomes 0. The number of iterations is proportional to the number of digits in x, which is log10(x).

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
The space complexity is O(1), constant space. Regardless of the size of the input integer x, you are using a constant amount of extra space (reverseNum, tempNum, and digit), and the space required does not grow with the size of the input.

# Code
```
class Solution {
    public boolean isPalindrome(int x) {
        int reverseNum=0;
        int tempNum=x; //
        if (x == 0) {
            return true;
        }else if(x < 0){
            return false;
        }
        while (tempNum != 0) {
            int digit = tempNum % 10;
            reverseNum = reverseNum * 10 + digit;
            tempNum = tempNum / 10;
        }

        return x == reverseNum;
    }
}
```
