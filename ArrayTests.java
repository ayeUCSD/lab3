import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReverseInPlaceLen5(){
    int[] input = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5,4,3,2,1}, input);
  }


  @Test
  public void testReversedLen5(){
    int[] input = {1,2,3,4,5};
    int[] output = ArrayExamples.reversed(input);
    assertArrayEquals(new int[]{5,4,3,2,1}, output);
  }






  @Test
  public void testAverage(){
    double[] input = {2,5,5,5,5,5};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(5, output, 0.00000001);
  }

@Test
  public void testAverage2(){
    double[] input = {5,5,5,5,5,5};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(5, output, 0.00000001);
  }
}
