package by.kaz.cousres.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test

    public void testAdd() throws Exception {
        assertEquals(10, calculator.computed("+", 5, 5), DELTA);
    }

    @Test
    public void testSub() throws Exception {
        assertEquals(0, calculator.computed("-", 5, 5), DELTA);
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(1, calculator.computed("/", 5, 5), DELTA);
    }

    @Test
    public void testMul() throws Exception {
        assertEquals(25, calculator.computed("*", 5, 5), DELTA);
    }

    @Test
    public void testPow() throws Exception {
        assertEquals(25, calculator.computed("^", 5, 2), DELTA);
    }

    @Test
    public void testMod() throws Exception {
        assertEquals(1, calculator.computed("%", 11, 5), DELTA);
    }

    @Test
    public void testSqrt() throws Exception {
        assertEquals(4, calculator.computed("sqrt", 16), DELTA);
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(2.454017796754255, calculator.computed("log", 11.635), DELTA);
    }

    @Test
    public void testLog10() throws Exception {
        assertEquals(1.0657663876227488, calculator.computed("log10", 11.635), DELTA);
    }

    @Test
    public void testLog10Neg() throws Exception {
        assertEquals(Double.NaN, calculator.computed("log10", -11.635), DELTA);
    }

    @Test
    public void testLogNeg() throws Exception {
        assertEquals(Double.NaN, calculator.computed("log", -11.635), DELTA);
    }

    @Test
    public void testModDigitsWithFloatPoint() throws Exception {
        assertEquals(0.4999999999999991, calculator.computed("%", 11.5, 2.2), DELTA);
    }

    @Test
    public void testSubWithNegDigits() throws Exception {
        assertEquals(0, calculator.computed("-", -5, -5), DELTA);
    }

    @Test
    public void testAddDigitsWithFloatPoint() throws Exception {
        assertEquals(10.7, calculator.computed("+", 5.5, 5.2), DELTA);
    }

    @Test
    public void testSqrtNaN() throws Exception {
        assertEquals(Double.NaN, calculator.computed("sqrt", -3), DELTA);
    }

    @Test
    public void testSqrtN() throws Exception {
        assertEquals(2, calculator.computed("sqrtn", 16, 4), DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void testUnknownOperation() throws Exception {
        calculator.computed("!", 5, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() throws Exception {
        calculator.computed("/", 5, 0);
    }

}