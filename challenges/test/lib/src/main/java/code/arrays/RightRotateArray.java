package code.arrays;

public class RightRotateArray {

  public static void turnRight(int[][] matrix) {
    int a;
    //Really we don't need this for loop, since we know the spots. but i'll just keep it here
    for (int i = 0; i < matrix.length - 1; i++) {
      if (i == 0) {
        a = matrix[i][0];
        matrix[i][0] = matrix[2][2];
        matrix[2][2] = a;
        a = matrix[i][1];
        matrix[i][1] = matrix[1][2];
        matrix[1][2] = a;
      } else if (i == 1) {
        a = matrix[i][0];
        matrix[i][0] = matrix[2][1];
        matrix[2][1] = a;
      }
    }

  }
}
