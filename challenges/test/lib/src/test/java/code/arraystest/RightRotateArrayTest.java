package code.arraystest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

import static code.arrays.RightRotateArray.turnRight;

public class RightRotateArrayTest {

  @Test
  public void testingTurnRight(){
    int[][] arr = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
    turnRight(arr);
    int[][] turnedArr = new int[][]{{3,2,1},{3,2,1},{3,2,1}};
    assertArrayEquals(turnedArr,arr);



  }
}
