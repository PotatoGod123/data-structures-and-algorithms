package code.stringstest;

import org.junit.Test;
import static org.junit.Assert.*;
import static code.strings.RepeatingSubstring.lengthOfLongestSubstring;

public class RepeatingSubstring {

  @Test
  public void testingRepeatingSubstring(){
    String a = "abcadbcabc";
    String b = "abcabcbb";
    String c = "pwwkew";
    String d =" ";
    String e = "dvdf";

    assertEquals(4, lengthOfLongestSubstring(a));
    assertEquals(3, lengthOfLongestSubstring(b));
    assertEquals(3, lengthOfLongestSubstring(c));
    assertEquals(1, lengthOfLongestSubstring(d));
    assertEquals(3, lengthOfLongestSubstring(e));
  }
}
