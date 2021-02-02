import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.*;

@RunWith(Parameterized.class)
public class CustomMathTest {

  @Parameters
  public static Collection sumValues() {
    return Arrays.asList(
      new Object[][] { { 1, 1, 2 }, { -1, 1, 0 }, { 10, 15, 25 } }
    );
  }

  int x;
  int y;
  int sumResult;

  public CustomMathTest(int x, int y, int sumResult) {
    this.x = x;
    this.y = y;
    this.sumResult = sumResult;
  }

  @BeforeClass
  public static void setUpClass() {}

  @AfterClass
  public static void tearDownClass() {}

  @Test
  public void testSum() {
    System.out.println("sum");
    int x = 0;
    int y = 0;
    int expResult = 0;
    int result = CustomMath.sum(x, y);
    assertEquals(expResult, result);
  }

  @Test
  public void testSum2() {
    int expResult = sumResult;
    int result = CustomMath.sum(x, y);
    assertEquals(expResult, result);
    // fail("The test case is a prototype.");
  }

  @Test
  public void testDivisionByZero() {
    int x = 0;
    int y = 0;
    int expResult = 0;
    try {
      int result = CustomMath.division(x, y);
      assertEquals(expResult, result);
      if (y == 0) fail("Dividing by zero doesn't create unexpected situations");
    } catch (IllegalArgumentException e) {
      if (y != 0) fail("throwing exceptions when dividing by 0");
    }
  }

  @Test
  public void testDivisionByOne() {
    int x = 0;
    int y = 1;
    int expResult = 0;
    try {
      int result = CustomMath.division(x, y);
      assertEquals(expResult, result);
      if (y == 0) fail("Dividing by zero doesn't create unexpected situations");
    } catch (IllegalArgumentException e) {
      if (y != 0) fail("throwing exceptions when dividing by 0");
    }
  }

  @Test
  public void testIsOdd() {
    assertFalse(CustomMath.isOdd(0));
    assertTrue(CustomMath.isOdd(1));
    assertFalse(CustomMath.isOdd(2));
  }
}
