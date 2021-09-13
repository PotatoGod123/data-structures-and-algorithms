package code.stringstest;

import code.strings.LongestPalindromeString;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeStringTest {

  @Test
  public void testingLongestPalindromeString(){
    LongestPalindromeString palindromeString = new LongestPalindromeString();
    System.out.println(palindromeString.longestPalindrome("aaabcbcbaseawfd"));
    assertEquals("abcbcba",palindromeString.longestPalindrome("aaabcbcbaseawfd"));
    assertEquals("a",palindromeString.longestPalindrome("a"));
  }
}
