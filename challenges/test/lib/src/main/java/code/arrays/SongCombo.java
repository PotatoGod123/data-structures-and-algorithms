package code.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SongCombo {
  public static List<Integer> songsCombo(int duration, List<Integer> songDuration){
    //edge case
    if(duration <=30)return new ArrayList<Integer>(){{add(-1);add(-1);}};

    int time = duration-30;
    HashMap<Integer,Integer> record = new HashMap<>();
    //I only though of this at the last second, I could have just use math and figured whatever was the difference from remaining time and whatever time in
    // list would be the second song for the combo
    for(int i =0;i<songDuration.size();i++){
      if(record.containsKey(songDuration.get(i))){
        List<Integer> temp = new ArrayList<>();
        temp.add(0,record.get(songDuration.get(i)));
        temp.add(1,i);
        return temp;

      }else {
        record.put(time-songDuration.get(i),i);
      }

    }
    return new ArrayList<Integer>(){{add(-1);add(-1);}};
  }
}
