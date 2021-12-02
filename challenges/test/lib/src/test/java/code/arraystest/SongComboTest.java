package code.arraystest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static code.arrays.SongCombo.songsCombo;
import static org.junit.Assert.*;

public class SongComboTest {

  @Test
  public void testComboSong(){
    List<Integer> test = new ArrayList<Integer>(){{
      add(1);
      add(10);
      add(25);
      add(35);
      add(60);
    }};

    List<Integer> ans = new ArrayList<Integer>(){{add(2);add(3);}};
    //works with test case
    assertArrayEquals(ans.toArray(),songsCombo(90, test).toArray());
  }

}
