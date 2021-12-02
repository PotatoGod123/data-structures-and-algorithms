package code.strings;

public class MostPalindromes {
  public static int countPalindromes(String s){
    int count = 0;
    int length = s.length();
    //use a matrix of the given string
    boolean[][] matrix = new boolean[length][length];
    //use two pointers, j is double as fast as i, hence forth the slower pointer should not exceed j
    for(int j = 0; j<length;j++){
      for(int i = 0; i<=j;i++){
        if(s.charAt(i)==s.charAt(j)){
          if(j-i <2){
            matrix[i][j]=true;
          }else{
            matrix[i][j]=matrix[i+1][j-1];
          }
        }
        if(matrix[i][j]){
          count++;
        }
      }
    }

    return count;

  }
}
