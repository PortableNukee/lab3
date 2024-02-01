import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 8, 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9,8,3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseFourItems(){
    int[] input1 = {4,424,2,7};
    assertArrayEquals(new int[]{7,2,424,4}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceFourItems(){
    int[] input1 = { 1,2,3,4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4,3,2,1}, input1);
  }

  @Test
  public void testAvgWithoutLowest(){
    double input1[] = {4,1,2,9,3};
    assertEquals(4.5,ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
  @Test
  public void testAvgWithoutLowestNegative(){
    double input1[] = {4,9,-3};
    assertEquals(6.5,ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
  @Test
  public void testAvgWithoutLowestHighValues(){
    double input1[] = {1,100,100,150};
    assertEquals(116.67,ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
  @Test
  public void testAvgWithoutLowestTwoItems(){
    double input1[] = {2,2};
    assertEquals(2,ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
  @Test
  public void testAvgWithoutLowestOneItem(){
    double input1[] = {3};
    assertEquals(0,ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

}
