package code.utilities;

public class ReverseInteger {

  public int Reverse(int x ){
    int hold = x;

    while(x != 0){
      //this will remove, or pop the first number and store it
      int a = x % 10;
      // we divide the given number to modify it for next loop
      x/=10;
      //this checks if the hold is overflowing or if the pop number is bigger that 7, if so it's bigger than 32bit
      if(hold > Integer.MAX_VALUE/10|| (hold == Integer.MAX_VALUE / 10 && a > 7)) return 0;
      //same thing but instead checking for overflowing negative number
      if(hold < Integer.MIN_VALUE/10 || (hold == Integer.MIN_VALUE/ 10 && a < -8)) return 0;
      // this will push that popped number we got out from a into our holder number, and so loop continues
      hold = hold*10 + a ;

    }
    return hold;
  }
}
