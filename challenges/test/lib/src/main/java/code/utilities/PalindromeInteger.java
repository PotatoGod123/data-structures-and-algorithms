package code.utilities;

import java.util.LinkedList;

public class PalindromeInteger {
  public boolean isPalindrome(int x) {
    if(x<0)return false;
    LinkedList<Integer> stack = new LinkedList<>();
    int num = x;
    //so the way we retrieve a digit from a number is by doing a divisible of 10, this will return the last digit, so we use a stack to maintain original order,after which we divide by 10 to decrease the number we already got. tbh this could be a helper function but lazy
    while(num>0){
      stack.push( num % 10 );
      num = num / 10;
    }
    num=x;
    //same logic as top, but we don't need to record the number anymore
    while(!stack.isEmpty()){
      System.out.println(num%10);
      if((num%10)!=stack.pop())return false;
      num = num / 10;
    }
    return true;
  }
}
