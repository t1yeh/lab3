import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3,2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2 ,3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 1,3,4};
    assertArrayEquals(new int[]{ 4,3,1}, ArrayExamples.reversed(input1));
    
  }
  @Test
  public void testAveragebutLowest(){
    assertEquals(0.0 , ArrayExamples.averageWithoutLowest(new double[]{ 4}), 0);
    assertEquals(4, ArrayExamples.averageWithoutLowest(new double[]{ 4,3}), 0);
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(new double[] {3,4,5}), 0);
    assertEquals(1.5, ArrayExamples.averageWithoutLowest(new double[] {3,3,3}), 0);
    
  }
}
