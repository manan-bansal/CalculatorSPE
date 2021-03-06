import Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();



    @Test
    public void rootTruePositive(){
        assertEquals("Taking root of a double for True Positive", 2.0, calculator.root(4.0), DELTA);
    }
    @Test
    public void rootFalsePositive(){
        assertNotEquals("Taking root of a double for False Positive", 3.0, calculator.root(25.0), DELTA);
    }
    @Test
    public void logTruePositive(){
        assertEquals("Taking log of a double for True Positive", 0, calculator.log(1), DELTA);
    }
    @Test
    public void logFalsePositive(){
        assertNotEquals("Taking log of a double for False Positive", 2.302, calculator.log(40.0), DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Taking factorial of a double for True Positive", 720.0, calculator.factorial(6.0), DELTA);
    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Taking factorial of a double for False Positive", 720.0, calculator.factorial(5.0), DELTA);
    }
    @Test
    public void poweredTruePositive(){
        assertEquals("Calculating x to the power y for True Positive", 4.0, calculator.powered(2.0,2.0), DELTA);
    }
    @Test
    public void poweredFalsePositive(){
        assertNotEquals("Calculating x to the power y for False Positive", 4.0, calculator.powered(3.0,3.0), DELTA);
    }





}