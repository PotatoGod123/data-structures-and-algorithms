package code.utilitiestest;

import org.junit.Test;

import static code.utilities.Prime.isPrime;
import static org.junit.Assert.*;

public class PrimeTest {

  @Test
  public void primeTesting(){

    int a = 3;
    int b = 1;
    int c = 2;
    int d = 31341341;

    assertTrue(isPrime(a));
    assertFalse(isPrime(d));
    assertTrue(isPrime(c));
    assertFalse(isPrime(b));

  }
}
