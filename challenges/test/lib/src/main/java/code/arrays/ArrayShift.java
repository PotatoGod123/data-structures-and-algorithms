package code.arrays;

public class ArrayShift {
      public boolean testMethod(){
          System.out.println("It works!");
          return  true;
      }
      public static int[] arrayShift(int[] iniArray,int num){
        //finding the middle spot to insert and move traverse from
        int middleSpot = iniArray.length/2;
        //checks if the length is odd, if it is gotta add 1 for it to be in the middle
        if(iniArray.length%2!=0){
          middleSpot= iniArray.length/2+1;
        }

        int[] arrUpdated = new int[iniArray.length+1];

        for(int i=0;i<arrUpdated.length;i++){
          // these if will look for the right and left side of the array starting for the middle
          if(i==middleSpot) {
            arrUpdated[i]=num;
          }
          if(i<middleSpot){
            arrUpdated[i]=iniArray[i];
          }
          if(i>middleSpot) {
            int holder = i-1;
            arrUpdated[i]=iniArray[holder];
          }
          System.out.println(arrUpdated[i]);
        }
        System.out.println("hello this is working " +iniArray.length + "<length  middle>"+ middleSpot );
        return arrUpdated;
      }
}
