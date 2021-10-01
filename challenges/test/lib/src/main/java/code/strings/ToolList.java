package code.strings;

import java.util.List;

public class ToolList {
  public static int belt(List<String> tools, int start,String target){
    int count=0;
    int secondCount=0;
    for(int i=start;i<tools.size();i++){

      if(tools.get(i).equals(target))break;
      count++;
      if(i==tools.size()-1)i=-1;
    }
    for(int i = start;i<tools.size();i--){

      if(tools.get(i).equals(target))break;
      secondCount++;
      if(i==0)i=tools.size()+1;
    }
    return Math.min(count,secondCount);
  }
}
