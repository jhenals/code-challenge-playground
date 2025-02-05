# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To solve this problem, i thought of converting the string into array of words then create a new string using a for-loop but starting on the last element of the array.

# Approach
<!-- Describe your approach to solving the problem. -->
I decided to use the StringBuilder because it is easier to append the words.
The first thing to do is to make sure there are no white spaces in the beginning, at the end or even double spaces in the sentence. I used the trim method of Java to make sure there are no leading or trailing spaces. Then i apply the replaceAll method which replace multiple white spaces ("\\s+") in between the words with a single space (" ").
Lastly, i append the words into my sb object beginning from the last element. I make sure that after each word, there is a space except the last word of the sentence. 

# Complexity
- Time complexity:O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
s.trim(), s.replaceAll(...), s.split() takes O(n) because they need to scan all the elements. for loop iterates through the array of words and it takes O(n). Therefore, the time complexity is O(n).

- Space complexity: O(n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
sb object stores the reversed n words. strs is an array that stores the elements created by trim() method. Therefore, Space complexity is O(n).

# Code
```java []
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        s = s.trim().replaceAll("\\s+", " ");
        String[] strs= s.split(" ");
        for(int i=strs.length-1; i>=0; i--){
           sb.append(strs[i]);
           if(i != 0){
            sb.append(" ");
           }
        }
        return sb.toString();
    }
}
```
