package code.arraystest;

import code.arrays.ArrayShift;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {
  @Test public void testingArrayShift(){
    ArrayShift testArrayShiftFile = new ArrayShift();
    assertTrue("This should be true",testArrayShiftFile.testMethod());
  }

  @Test public void testActualArrayShift(){
    ArrayShift shiftArray = new ArrayShift();
    int[] arrayHolder = {2,4,6,8};
    int[] expectedOutput={2,4,5,6,8};
    int[] actualOutput = ArrayShift.arrayShift(arrayHolder,5);
    assertArrayEquals("Expected array should be [2,4,5,6,8]",expectedOutput,actualOutput);

    int[] arrayHolderTwo={4,8,15,23,42,54,76};
    int[] expectedOutputTwo={4,8,15,23,16,42,54,76};
    int[] actualOutputTwo=ArrayShift.arrayShift(arrayHolderTwo,16);

    assertArrayEquals("Expected array should be [4,8,15,16,23,42]",expectedOutputTwo,actualOutputTwo);

  }
}
