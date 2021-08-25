package code.arraystest;

import code.arrays.MedianTwoArrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedianTwoArraysTest {

  @Test
  public void testingMedianArrays(){
    int[] testArr1 = new int[]{1,2,3};
    int[] testArr2 = new int[]{2,3,4,5};

    MedianTwoArrays medianTwoArrays = new MedianTwoArrays();
    System.out.println(medianTwoArrays.findMedianSortedArrays(testArr1,testArr2));
    //don't forget to use delta on bloody doubles/floats !!!!
    assertEquals(3.0,medianTwoArrays.findMedianSortedArrays(testArr1,testArr2),0);
  }

}
