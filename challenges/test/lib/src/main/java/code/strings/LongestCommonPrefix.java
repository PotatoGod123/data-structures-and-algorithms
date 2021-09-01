package code.strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
      String answer = "";
      String str = strs[0];

      for(int i=0; i< str.length(); i++){
        answer = str.substring(0,i+1);
        for(int j = 1; j < strs.length; j++){
          if(strs[j].startsWith(answer))
            continue;
          else
            return str.substring(0, i);
        }
      }
      return answer;
    }
  
}
