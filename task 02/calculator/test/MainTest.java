import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void calculatePlus() throws Exception {
        int a = 5;
        int b = 5;
        String operation = "+";
        int expResult = 10;
        int result = Main.calculate(operation, a, b);
        assertEquals(expResult,result);
    }

    @Test
    public void calculateMinus() throws Exception {
        int a = 5;
        int b = 5;
        String operation = "-";
        int expResult = 0;
        int result = Main.calculate(operation, a, b);
        assertEquals(expResult,result);
    }

    @Test
    public void calculateMultiply() throws Exception {
        int a = 5;
        int b = 5;
        String operation = "*";
        int expResult = 25;
        int result = Main.calculate(operation, a, b);
        assertEquals(expResult,result);
    }

    @Test
    public void calculateDivide() throws Exception {
        int a = 5;
        int b = 5;
        String operation = "/";
        int expResult = 1;
        int result = Main.calculate(operation, a, b);
        assertEquals(expResult,result);
    }

    @Test
    public void calculateDividedByZero() throws Exception {
        int a = 5;
        int b = 0;
        String operation = "/";
        int expResult = 0;
        int result = Main.calculate(operation, a, b);
        assertEquals(expResult,result);
    }
}