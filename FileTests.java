import static org.junit.Assert.*;
import java.io.File;
import java.util.*;
import org.junit.*;

public class FileTests {

  @Test
  public void testGetFiles() {
    File start = new File("testFileFolder");
    List<File> output = null;
    try {
      output = FileExample.getFiles(start);
    } catch (Exception e) {
      fail("Threw an Exception");
    }
    String expected = "[testFileFolder, testFileFolder\\testFile.txt, testFileFolder\\testSubFolder\\testSubFile.txt]";
    System.out.println("Expected: " + expected);
    System.out.println("Result: " + ((ArrayList)output).toString());
    assertEquals(expected, ((ArrayList) output).toString());

  }

}
