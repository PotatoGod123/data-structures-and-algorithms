package code.stringstest;

import code.strings.WordFilter;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordFilterTest {

  @Test
  public void testingWordFilter(){
    WordFilter wordFilter = new WordFilter(new String[]{"word","Epic","Sick"});

    System.out.println(wordFilter.f("E","c"));
    assertEquals(1,wordFilter.f("E","c"));
    assertEquals(0,wordFilter.f("w","d"));

  }


  @Test
  public void testTest(){
    String s = "Java";
    s.concat(" SE 6");
    System.out.println(s.concat("6 SE 6").replace('6','7'));
    s.replace('6','7');
    System.out.println(s);
  }
}
