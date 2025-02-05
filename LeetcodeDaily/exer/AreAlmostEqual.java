package LeetcodeDaily.exer;

import java.util.Arrays;

public class AreAlmostEqual {
  public boolean areAlmostEqual(String s1, String s2) {
    int c = 0;
    char[] s1ChArr = s1.toCharArray();
    char[] s2ChArr = s2.toCharArray();

    Arrays.sort(s1ChArr);
    Arrays.sort(s2ChArr);
    if (!Arrays.equals(s1ChArr, s2ChArr)) {
      return false;
    } else {
      for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i))
          c++;
      }
      return c == 2 || c == 0;
    }
  }
}
