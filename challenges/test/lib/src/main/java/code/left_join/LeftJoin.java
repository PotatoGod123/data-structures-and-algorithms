package code.left_join;

import java.util.HashMap;

public class LeftJoin {

  public static String[][] leftJoin(HashMap<String,String> mapOne , HashMap<String,String> mapTwo){
    String[][] holder = new String[mapOne.size()][];
    int[] i = {0};

    mapOne.forEach((k,v)->{
      String[] arr = new String[3];
      arr[0]=k;
      arr[1]=v;
      arr[2]=mapTwo.get(k);
      holder[i[0]]=arr;
      i[0]=i[0]+1;
    });

    return holder;
  }
}
