package code.repeatedword;

import java.util.HashMap;
import java.util.Locale;

public class RepeatedWord {

  public static String repeatedWord(String text){
    String[] arr= text.toLowerCase(Locale.ROOT).split("[^a-zA-Z']+");
    HashMap hashMap = new HashMap<>();
    for(String word:arr){
      if(hashMap.containsKey(word))return word;
      hashMap.put(word,null);
    }
    return null;
  }

}
