package code.sorttest;

import org.junit.Test;

import static code.sort.Sort.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class SortTest {


  @Test
  public void testingInsertionSort(){
    int[] arr1 ={8,4,23,42,16,15};
    System.out.println(Arrays.toString(arr1));
    insertionSort(arr1);
    System.out.println(Arrays.toString(arr1));
    int[] sortedArr = {4,8,15,16,23,42};
    int[] arr2={20,18,12,8,5,-2};

    int[] sortedArr2={-2,5,8,12,18,20};
    int[] arr3={5,12,7,5,5,7};
    int[] sortedArr3={5,5,5,7,7,12};
    assertArrayEquals(sortedArr,arr1);
    insertionSort(arr2);
    assertArrayEquals(sortedArr2,arr2);
    insertionSort(arr3);
    assertArrayEquals(sortedArr3,arr3);

  }

  @Test
  public void testingMergeSort(){
    int[] arr1 ={8,4,23,42,16,15};
    System.out.println(Arrays.toString(arr1));
    mergeSort(arr1);
    System.out.println(Arrays.toString(arr1));
    int[] sortedArr = {4,8,15,16,23,42};
    int[] arr2={20,18,12,8,5,-2};

    int[] sortedArr2={-2,5,8,12,18,20};
    int[] arr3={5,12,7,5,5,7};
    int[] sortedArr3={5,5,5,7,7,12};
    assertArrayEquals(sortedArr,arr1);
    mergeSort(arr2);
    assertArrayEquals(sortedArr2,arr2);
    mergeSort(arr3);
    assertArrayEquals(sortedArr3,arr3);
  }

  @Test
  public void testingQuickSort(){
    int[] arr1 ={8,4,23,42,14,15};
    System.out.println(Arrays.toString(arr1));
    quickSort(arr1,0,arr1.length-1);
    System.out.println(Arrays.toString(arr1));

  }
}
