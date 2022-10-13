import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;




public class LinkedListTests {


  @Test
  public void testAppend(){
    LinkedList l = new LinkedList();
    l.append(1);
    l.append(0);
    l.append(-1);
    assertEquals("1 0 -1 ", l.toString());

  }

}
