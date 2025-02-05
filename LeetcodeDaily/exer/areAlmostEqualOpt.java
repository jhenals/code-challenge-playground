package LeetcodeDaily.exer;

import java.util.ArrayList;
import java.util.List;

public class areAlmostEqualOpt {
  public boolean areAlmostEqual(String s1, String s2) {
    if (s1.equals(s2)) return true;

    List<Integer> mm = new ArrayList<>();

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        mm.add(i);
      }
      if (mm.size() > 2) return false;
    }

    return mm.size() == 2 && s1.charAt(mm.get(0)) == s2.charAt(mm.get(1)) &&
        s1.charAt(mm.get(1)) == s2.charAt(mm.get(0));


  }
}
