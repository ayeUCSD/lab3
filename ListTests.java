import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;




public class ListTests {

  @Test
  public void testFilter(){
    List<String> input = new ArrayList<String>(List.of("aa","b","aa","ccc","aa"));
    StringChecker sc = new lenTwoStringChecker();
    List<String> output = ListExamples.filter(input, sc);
    assertArrayEquals(new ArrayList<String>(List.of("aa", "aa", "aa")).toArray(), output.toArray());

  }

  
  @Test
  public void testFilter2(){
    List<String> input = new ArrayList<String>(List.of("aa","b","cc","ddd","ee"));
    StringChecker sc = new lenTwoStringChecker();
    List<String> output = ListExamples.filter(input, sc);
    assertArrayEquals(new ArrayList<String>(List.of("aa", "cc", "ee")).toArray(), output.toArray());

  }




  @Test
  public void testMerge(){
    List<String> input = new ArrayList<String>(List.of("a","b","c","d","e"));
    List<String> input2 = new ArrayList<String>(List.of("aa","bb","cc","dd","ee"));
    List<String> output = ListExamples.merge(input,input2);
    assertArrayEquals(new ArrayList<String>(List.of("a","aa","b","bb","c", "cc","d","dd","e", "ee")).toArray(), output.toArray());
    

  }

}
