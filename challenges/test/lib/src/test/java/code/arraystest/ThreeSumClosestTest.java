package code.arraystest;

import org.junit.Test;

import static code.arrays.ThreeSumClosest.threeSumClosest;
import static org.junit.Assert.*;

public class ThreeSumClosestTest {

  @Test
  public void testingThreeSum(){
    int[] test1 = new int[]{0,0,0};
    int[] test2 = new int[]{1,1,1,0};

    System.out.println(threeSumClosest(test1,1));


  }

}
