package code.strings;

public class WordFilter {
  String[] words;

  public WordFilter(String[] words){
    this.words=words;
  }
  public int f(String prefix, String suffix) {
    int holder = -1;
    if(words.length==0)return holder;
    String str = "";
    for(int i=0;i<words.length;i++){
      String w = words[i];
      System.out.println("this is sub "+w.substring(0, prefix.length() ));
      if(w.startsWith(prefix) && w.endsWith(suffix) ){
        if(str.length()<w.length()){
          str=w;
          holder=i;
        }
      }
    }
    return holder;
  }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
