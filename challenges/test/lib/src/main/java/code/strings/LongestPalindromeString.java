package code.strings;

public class LongestPalindromeString {
  public String longestPalindrome(String s) {
    //checking if the string exist in the first place or if there is only 1 letter
    if (s == null || s.length() < 1) return "";
    else if (s.length() == 1) return s;

    //counters
    int start = 0;
    int end = 0;

    //Here we go through the actual string
    for (int i = 0; i < s.length(); i++) {
      //Here we use the helper function below to find the appropriate pointers(index)
      int oddLength = getCurrentMaximumSubstring(s, i, i);
      int evenLength = getCurrentMaximumSubstring(s, i, i + 1);
      int maxLength = Math.max(oddLength, evenLength);
      //here we check if the length is greater, if it is we just assign our counters to the appropriate pointers
      if (maxLength > end - start) {
        //sub 1 because i starts at 0
        start = i - ((maxLength - 1) / 2);
        end = i + (maxLength / 2);
      }

    }
    //we use the counters to return a substring of the starting and end point, we add 1 to the end point because substring only goes up to the previous letter of the actual end point
    return s.substring(start, end + 1);
  }

  //this helps to find the longest point or index of the string that is the same as before, so abcb, if we start at c then move the pointers back and forward to check if they are the same!
  static int getCurrentMaximumSubstring(String s, int left, int right) {

    while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }

    return (right - left - 1);
  }
}
