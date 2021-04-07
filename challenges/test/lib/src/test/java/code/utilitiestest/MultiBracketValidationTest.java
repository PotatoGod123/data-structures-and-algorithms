package code.utilitiestest;

import code.utilities.MultiBracketValidation;
import org.junit.Test;
import static code.utilities.MultiBracketValidation.multiBracketValidation;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
  @Test public void testMulti(){

    System.out.println(multiBracketValidation("{}"));
    assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
    assertTrue(MultiBracketValidation.multiBracketValidation("{}(){}"));
    assertTrue(MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
    assertTrue(MultiBracketValidation.multiBracketValidation("(){}[[]]"));
  }

  @Test public void testFalse(){
    List<String> holder = Arrays.asList("[({}]","(](","{(})");

    //.stream() has a lot of powerful methods
    holder.stream().forEach(c ->
        assertFalse(MultiBracketValidation.multiBracketValidation(c))
      );
    //same thing as stream but in a code block sense
    for(String c: holder){
      assertFalse(MultiBracketValidation.multiBracketValidation(c));
    }
  }
}
