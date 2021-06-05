package code.utilities;

public class Prime {

  public static boolean isPrime(int num){
    //so if its 1 or less then we know it is not a prime
    if(num<=1)return false;
    // if its 2 or 3, then we know those are prime
    else if(num<=3)return true;
    //and finally if  the num is divisible down to 0 by 2 or 3, we know its not a prime
    else if(num%2==0 || num%3==0)return false;

    //here we check all the numbers we miss with our logic above,ex:5,7,11,13 so on
    // start at 5 and keep incrementing by 6
    int i = 5;
    while(i*i <= num){
        if(num%i==0|| num%(i+2)==0)return false;
        i+=6;
    }
    return true;
  }
}
