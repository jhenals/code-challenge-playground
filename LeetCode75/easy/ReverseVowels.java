package LeetCode75.easy;

/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 */
public class ReverseVowels {
  public static String reverseVowels(String s) {
    char chArr[] = s.toCharArray();
    int i = 0, j = s.length() - 1;
    while (i < j) {
      if (!isVowel(chArr[i]))
        i++;
      else if (!isVowel(chArr[j]))
        j--;
      else {
        char tmp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = tmp;
        i++;
        j--;
      }
    }
    return String.valueOf(chArr);
  }

  private static boolean isVowel(char c) {
    return c == 'a' ||
        c == 'e' ||
        c == 'i' ||
        c == 'o' ||
        c == 'u' ||
        c == 'A' ||
        c == 'E' ||
        c == 'I' ||
        c == 'O' ||
        c == 'U';
  }//ReverseVowels

  public static void main(String[] args) {

    String s1 = "IceCreAm";
    String s2 = "HEllo";
    System.out.println(ReverseVowels.reverseVowels(s1));
    System.out.println(ReverseVowels.reverseVowels(s2));
  }//main
}
