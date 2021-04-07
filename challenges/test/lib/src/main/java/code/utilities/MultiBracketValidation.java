package code.utilities;

import code.stacksandqueues.Stack;

public class MultiBracketValidation {

  public static boolean multiBracketValidation(String input){

    //so we make a new stack that will put our opening matching brackets in since order matters!!
    Stack<Character> stack = new Stack<>();
    //this for lop will go over the length of the string input so we can get each character in that string
    for(int i=0;i<input.length();i++){
      // make a char to holder the character at the index of i
      char a = input.charAt(i);
      //then check if its an opening bracket we will add it to the stack
      if(a =='('||a=='['||a=='{'){
        stack.push(a);

        //these rest if else check if the char is an closing one,then check is the stack is empty or if it does not match a pop from the match
      }else if(a==')'){
        if(stack.isEmpty()|| stack.pop()!='('){
          return false;
        }
      }else if(a==']'){
        if(stack.isEmpty()|| stack.pop()!='['){
          return false;
        }
      }else if(a=='}'){
        if(stack.isEmpty()|| stack.pop()!='{'){
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
