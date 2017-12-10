package fibonachi;

import org.junit.Before;
import org.junit.Test;
import patterns.Fibonachi;

import static org.junit.Assert.assertEquals;


public class FibonachiTest {
  private Fibonachi fibonachiTester;
  private Fibonachi fibonachi(int lengthNumbers) {

    return new Fibonachi(lengthNumbers);
  }

  @Before
  public void setUp() throws Exception {
    this.fibonachiTester = fibonachi(9);
  }

  @Test
  public void testFirstAndSecondNumbers() throws Exception{
    int [] fibonachiList = this.fibonachiTester.generateList();
    int firstNumber = fibonachiList[0];
    int secondNumber = fibonachiList[1];
    assertEquals(firstNumber, 1);
    assertEquals(secondNumber, 1);
  }
  @Test
  public void checkLength() throws Exception{
    assertEquals(this.fibonachiTester.getLength(),9);
  }

  @Test
  public void checkGeneratedNewLength() throws Exception{
    int newLength = 4;
    this.fibonachiTester.setLength(newLength);
    int [] fibonachiList = this.fibonachiTester.generateList();
    assertEquals(fibonachiList.length,newLength);
  }

  @Test
  public void checkGeneratedLength() throws Exception{
    int checkedLength = this.fibonachiTester.getLength();
    int [] fibonachiList = this.fibonachiTester.generateList();
    assertEquals(fibonachiList.length,checkedLength);
  }

}
