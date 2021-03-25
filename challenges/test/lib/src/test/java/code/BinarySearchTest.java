package code;

import org.junit.Test;
import static org.junit.Assert.*;
public class BinarySearchTest {
  @Test public void testBinarySearchFile(){
    BinarySearch testMethod = new BinarySearch();
    assertTrue(testMethod.testBinarySearch());
  }

  @Test public void testBinarySearch(){
    int[] arrHolder = {4,8,15,16,23,42};
    int intHolder = 15;

    int expectedOutput= 2;

    int actualOutput = BinarySearch.binarySearch(arrHolder,intHolder);

    assertSame("output for this array should index 2",expectedOutput,actualOutput);

    int[] arrHolderTwo= {11,22,33,44,55,66,77};
    intHolder=90;
    expectedOutput=-1;
    actualOutput= BinarySearch.binarySearch(arrHolderTwo,intHolder);

    assertSame("output for this array should be -1 since no match is found",expectedOutput,actualOutput);


    int[] bigAssArray = new int[100000];

    for(int i=0;i<bigAssArray.length-1;i++){
      bigAssArray[i]=i;
    }

    intHolder=75000;
    expectedOutput=75000;
    actualOutput= BinarySearch.binarySearch(bigAssArray,intHolder);
    System.out.println(actualOutput);
    assertEquals("output for this array should be 75000 since that's the index",expectedOutput,actualOutput);
  }
}
