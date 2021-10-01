package code.stringstest;

import code.strings.ToolList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static code.strings.ToolList.belt;

public class ToolListTest {
  @Test
  public void testingTool(){
    List<String> tools = new ArrayList<>();
    tools.add("epic");
    tools.add("sun");
    tools.add("target");
    tools.add("start");
    tools.add("not cool");
    System.out.println(belt(tools,2,"sun"));
  }
}
