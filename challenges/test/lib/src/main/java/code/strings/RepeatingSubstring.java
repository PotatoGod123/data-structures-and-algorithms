package code.strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class RepeatingSubstring {

  public static int lengthOfLongestSubstring(String s) {
    //for longest repeater character
//    if (s.isEmpty()) return 0;
//    int count = 0;
//    int track = 0;
//    Collection<Character> set = new HashSet<>();
//
//    for (int i = 0; i < s.length(); i++) {
//      char c = s.charAt(i);
//      if (set.contains(c)) {
//        set.clear();
//
//        count = 1;
//        set.add(c);
//      } else {
//        set.add(c);
//        count++;
//        if (count >= track) {
//          track = count;
//        }
//      }
//
//    }
//    return track;

    //so the reason above didnt work is because we need two pointers to keep track of all potential
    // substrings!!!
      if(s.isEmpty())return 0;
      //the length
      int count = 0;
      //the pointer to move forward as
      int track=0;
      HashMap<Character, Integer> set = new HashMap<>();

      for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        //if c is inside we move the pointer forward and we set it either to the length of the current substring is bigger or
        // if the pointer steps is bigger
        if(set.containsKey(c)) track= Math.max(set.get(c), track);
        //we now set count to be either it self if its bigger or the current length of the two pointers
        count= Math.max(count,i - track + 1);
        //we replace the current character inside the hashmap with a new value or add it;
        set.put(c, i+1);
      }

      return count;

  }

}
