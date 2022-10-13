import static org.junit.Assert.*;
import java.io.File;
import java.util.*;
import org.junit.*;




public class FileTests {

  @Test
  public void testGetFiles(){
    File start = new File("testFileFolder");
    List<File> output = null;
    try {
      output = FileExample.getFiles(start);
    } catch (Exception e) {
      fail("Threw an Exception");
    }
      
    assertEquals("testFileFolder,testFileFolder/testFile.txt", Arrays.toString(output.toArray()));



  }

}
