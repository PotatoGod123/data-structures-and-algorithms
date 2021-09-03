package code.stringstest;

import code.strings.LongestCommonPrefix;
import org.junit.Test;

import java.util.Arrays;


public class LongestCommonPrefixTest {

  @Test
  public void testingLongPre(){
    String[] strs = new String[]{"epic","epic2","episode"};
    System.out.println(Arrays.toString(strs));
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    System.out.println(longestCommonPrefix.longestCommonPrefix(strs)+"<helo work??");

  }
}
