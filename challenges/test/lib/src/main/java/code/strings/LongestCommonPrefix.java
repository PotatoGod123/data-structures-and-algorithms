package code.strings;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    //keep track
    String answer = "";
    String str = strs[0];


    //go through each word
    for(int i=0; i< str.length(); i++){
      //change the first prefix and keep going for each loop
      answer = str.substring(0,i+1);
      for(int j = 1; j < strs.length; j++){
        //checking to see if the prefix starts with each word
        if (!strs[j].startsWith(answer)) {
          return str.substring(0, i);
        }

      }
    }
    //will return the prefix or empty string
    return answer;
  }

}
