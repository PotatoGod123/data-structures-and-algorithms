import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arrayOne = {1,2,3,4,5,6}; 
        int[] arrayTwo= {89, 2354, 3546, 23, 10, -923, 823, -12};
        int[] arrayThree={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        //this will print out the reversed arrays testing so if it's working as intended
        System.out.println(Arrays.toString(reverseArray(arrayOne)));
        System.out.println(Arrays.toString(reverseArray(arrayTwo)));
        System.out.println(Arrays.toString(reverseArray(arrayThree)));
    }

    public static int[] reverseArray(int[] array){
       //Starting count variable

       int fowardCount = 0;
       int[] reversedArray = new int[array.length]; 
       //  System.out.println(array.length);
       for(int i=array.length-1;i>=0;i--){
        reversedArray[fowardCount]= array[i];
        // System.out.println(reversedArray[fowardCount]+" this is the reversed array");
        fowardCount++;
       }
       
       return reversedArray;
    }
}