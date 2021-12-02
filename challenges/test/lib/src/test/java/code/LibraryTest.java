/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code;

import code.arrays.ArrayShift;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testRandomMethodInArrayShift(){
      ArrayShift testingObject = new ArrayShift();
      assertTrue("testMethod should return true", testingObject.testMethod() );
    }

    @Test public void testDuckDuckGame(){
      List<String> list = new ArrayList<>();
      list.add("bob");
      list.add("james");
      list.add("cris");
      list.add("ed");
      list.add("amilia");

      System.out.println(list);
      System.out.println(Library.duckDuckGoose(list,3));
    }


    @Test
    public void testingCodec(){
      String encodedString = "IyEvdXNyL2Jpbi9lbnYgcHl0aG9uMwoKaW1wb3J0IGNvZGVjcwppbXBvcnQgc3RyaW5nCm ltcG9ydCBzeXMKaW1wb3J0IHRpbWUKCmZyb20gY3J5cHRvZ3JhcGh5Lmhhem1hdC5iYWNr ZW5kcyBpbXBvcnQgZGVmYXVsdF9iYWNrZW5kCmZyb20gY3J5cHRvZ3JhcGh5Lmhhem1hdC 5wcmltaXRpdmVzLmhhc2hlcyBpbXBvcnQgU0hBMQpmcm9tIGNyeXB0b2dyYXBoeS5oYXpt YXQucHJpbWl0aXZlcy50d29mYWN0b3IudG90cCBpbXBvcnQgVE9UUAoKCk9ORV9XRUVLX0 lOX1NFQ09ORFMgPSA2MDRfODAwCgoKZGVmIGdlbmVyYXRlX3NlY3JldCgpOgogICAgdG90 cCA9IFRPVFAoCiAgICAgICAga2V5PWNvZGVjcy5lbmNvZGUoc3RyaW5nLmFzY2lpX2xldH RlcnMsIGVuY29kaW5nPSJ1dGYtOCIpLAogICAgICAgIGxlbmd0aD04LAogICAgICAgIGFs Z29yaXRobT1TSEExKCksCiAgICAgICAgdGltZV9zdGVwPU9ORV9XRUVLX0lOX1NFQ09ORF MsCiAgICAgICAgYmFja2VuZD1kZWZhdWx0X2JhY2tlbmQoKSwKICAgICkKICAgIHNlZWQg PSBpbnQodGltZS50aW1lKCkpCiAgICB0b2tlbiA9IGNvZGVjcy5kZWNvZGUodG90cC5nZW 5lcmF0ZShzZWVkKSwgZW5jb2Rpbmc9InV0Zi04IikKICAgIHJldHVybiBmInt0b2tlbn0t e3NlZWR9IgoKCmlmIF9fbmFtZV9fID09ICJfX21haW5fXyI6CiAgICBzeXMuc3Rkb3V0Ln dyaXRlKAogICAgICAgIGYiUGxlYXNlIGhlYWQgdG8gaHR0cHM6Ly9yYW1wLmNvbS9jYXJl ZXJzIGFuZCB1c2UgdGhpcyBzZWNyZXQgd2hlbiAiCiAgICAgICAgZiJ5b3UgYXBwbHk6IH tnZW5lcmF0ZV9zZWNyZXQoKX1cbiIKICAgICkKCg==";
      byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
      String newString = new String(decodedBytes);
      System.out.println(newString);
    }
}
