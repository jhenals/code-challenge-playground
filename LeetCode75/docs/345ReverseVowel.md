Level: Easy
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The idea is to use two pointers: one starting fromt he beginning of the string and the other one from the end. These pointers iterate through the string while checking if the current character they are checking is a vowel. 
- If it is not a vowel, the pointer simply moves forward(or backward)
- If one pointer finds a vowel, it stops and wait till the second pointer also lands on a vowel.
- Once both pointers are at a vowel, we swap them and move both the pointers inward.
This process continues until the pointers overlap. At that point, all the vowels are surely swapped and the string is already transformed. 

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:O(n) because are iterating through all the elements of the string
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: O(n)- because we trnsformed the string into a character array that requires overall space proportional to the length of the string. 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            if(!isVowel(ch[i])){
                i++;
            }else if(!isVowel(ch[j])){
                j--;
            }else{
                char tmp=ch[i];
                ch[i]=ch[j];
                ch[j]=tmp;
                i++; 
                j--;
            }
        }
        return String.valueOf(ch);
    }

    private boolean isVowel(char c){
        return c=='a' || c=='e'|| c=='i' || c=='o'|| c=='u'|| c=='A' || c=='E'|| c=='I' || c=='O'|| c=='U';
    }
}
```
