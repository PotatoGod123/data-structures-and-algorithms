package code.utilitiestest;

import code.utilities.PalindromeInteger;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeIntegerTest {

  @Test
  public void isPalindromeTest(){
    PalindromeInteger palindromeInteger = new PalindromeInteger();
    assertTrue(palindromeInteger.isPalindrome(121));
    assertFalse(palindromeInteger.isPalindrome(-121));
    assertFalse(palindromeInteger.isPalindrome(3121));
  }
}
