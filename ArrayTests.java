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
    int[] input1 = { 10, 20, 25, 30, 40 };
    assertArrayEquals(new int[]{ 40, 30, 25, 20, 10 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void ReverseInPlace2() {
    int[] input1 = {10, 20, 25, 30, 40};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{40, 30, 25, 20, 10}, input1);
  }

  @Test
  public void testAverageWOLowest() {
    double[] input1 = {1.0, 2.0, 3.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWOLowest2() {
    double[] input1 = {2.0, 1.0, 3.0, 1.0, 1.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
