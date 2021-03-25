package code;

public class BinarySearch {
  public boolean testBinarySearch(){
    System.out.println("its works!!!");
    return true;
  }

  public static int  binarySearch(int[] arr,int num){
    //self explanatory
    int middleSpot;
    int leftSPot = 0;
    int rightSpot = arr.length-1;
    //this  is the bulk of operations, while runs till the left side is less or equal to the right, suishing the array
    while (leftSPot<=rightSpot){
      //finding the middle spot by adding the left and right /2
      middleSpot= (leftSPot+rightSpot)/2;
      //this if will look if we need to go right
      if(arr[middleSpot]<num){
        leftSPot= middleSpot+1;
      // this will check if we need to left
      }else if(arr[middleSpot]>num){
        rightSpot=middleSpot-1;
      // if it matches, will return the middlespot which is the idc
      }else{
        return middleSpot;
      }

    }
  //if the while loops breaks it self's then we know we didn't find a match
    return -1;
  }
}
