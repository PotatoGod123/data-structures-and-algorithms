package code.leftjointest;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static code.left_join.LeftJoin.leftJoin;
import static org.junit.Assert.*;

public class LeftJoinTest {

  @Test
  public void testingLeftJoin(){
    HashMap mapOne= new HashMap();
    HashMap mapTwo = new HashMap();
    mapOne.put("fond","enamored");
    mapOne.put("wrath","anger");
    mapOne.put("diligent","employed");
    mapOne.put("outfit","garb");
    mapOne.put("guide","usher");

    mapTwo.put("fond","averse");
    mapTwo.put("wrath","delight");
    mapTwo.put("diligent","idle");
    mapTwo.put("guide","follow");
    mapTwo.put("flow","jam");

    String[][] newArrArr = leftJoin(mapOne,mapTwo);


    for(String[] arrString:newArrArr){
      System.out.println(Arrays.toString(arrString));
    }
    assertEquals(mapOne.size(), newArrArr.length);

  }
}
