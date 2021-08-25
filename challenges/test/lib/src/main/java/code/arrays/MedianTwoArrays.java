package code.arrays;

public class MedianTwoArrays {
  public double findMedianSortedArrays(int[] numsOne, int[] numsTwo) {
    int idx= 0;
    int idxTwo = 0;
    int med = 0;
    int medTwo = 0;
    // Starting counters, used below

    for (int i=0; i<=(numsOne.length+numsTwo.length)/2; i++) {
      //this for loop will go through both arrays at once taking account both array lengths
      //this way we do not make a whole new array
      med = medTwo;
      //assign med to medTwo to update it
      if (idx == numsOne.length) {
        medTwo = numsTwo[idxTwo];
        idxTwo++;
      } else if (idxTwo == numsTwo.length) {
        medTwo = numsOne[idx];
        idx++;
      } else if (numsOne[idx] < numsTwo[idxTwo] ) {
        medTwo = numsOne[idx];
        idx++;
      }  else {
        medTwo = numsTwo[idxTwo];
        idxTwo++;
      }
    }


    if ((numsOne.length+numsTwo.length)%2 == 0) {
      return (float)(med+medTwo)/2;
      //if this if counter triggers than we know the length is even and has to be added and divided to find the median
    }

    return medTwo;
  }
}
