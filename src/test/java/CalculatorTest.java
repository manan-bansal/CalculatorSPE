import Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

//     @Test
//     public void addingTruePositive(){
//         assertEquals("Adding two integer numbers for True Positive", 4, calculator.add(2, 2), DELTA);
//         assertEquals("Adding two double numbers for True Positive", 5.3, calculator.add(2.1, 3.2), DELTA);
//     }

//     @Test
//     public void addingFalsePositive(){
//         assertNotEquals("Adding two integer numbers for False Positive", 6, calculator.add(2, 2), DELTA);
//         assertNotEquals("Adding two double numbers for False Positive", 7.3, calculator.add(2.1, 3.2), DELTA);
//     }

//     @Test
//     public void subtractingTruePositive(){
//         assertEquals("Subtracting two integer numbers for True Positive", 0, calculator.subtract(2, 2), DELTA);
//         assertEquals("Subtracting two double numbers for True Positive", -1.1, calculator.subtract(2.1, 3.2), DELTA);
//     }

//     @Test
//     public void subtractingFalsePositive(){
//         assertNotEquals("Subtracting two integer numbers for False Positive", 6, calculator.subtract(2, 2), DELTA);
//         assertNotEquals("Subtracting two double numbers for False Positive", -7.3, calculator.subtract(2.1, 3.2), DELTA);
//     }

//     @Test
//     public void multiplyingTruePositive(){
//         assertEquals("Multiplying two integer numbers for True Positive", 4, calculator.multiply(2, 2), DELTA);
//         assertEquals("Multiplying two double numbers for True Positive", 6.72, calculator.multiply(2.1, 3.2), DELTA);
//     }

//     @Test
//     public void multiplyingFalsePositive(){
//         assertNotEquals("Multiplying two integer numbers for False Positive", 6, calculator.multiply(2, 2), DELTA);
//         assertNotEquals("Multiplying two double numbers for False Positive", 7.3, calculator.multiply(2.1, 3.2), DELTA);
//     }

//     @Test
//     public void dividingTruePositive(){
//         assertEquals("Dividing two integer numbers for True Positive", 1, calculator.divide(2, 2), DELTA);
//         assertEquals("Dividing two double numbers for True Positive", Double.NaN, calculator.divide(0, 0), DELTA);
//         assertEquals("Dividing two double numbers for True Positive", Double.POSITIVE_INFINITY, calculator.divide(1, 0), DELTA);
//         assertEquals("Dividing two double numbers for True Positive", Double.NEGATIVE_INFINITY, calculator.divide(-1, 0), DELTA);
//     }

//     @Test
//     public void dividingFalsePositive(){
//         assertNotEquals("Dividing two integer numbers for True Positive", 1, calculator.divide(2.3, 1.3), DELTA);
//         assertNotEquals("Dividing two double numbers for True Positive", 0, calculator.divide(0, 0), DELTA);
//         assertNotEquals("Dividing two double numbers for True Positive", 1, calculator.divide(1, 0), DELTA);
//         assertNotEquals("Dividing two double numbers for True Positive", -1, calculator.divide(-1, 0), DELTA);
//     }
    
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
        assertEquals("Taking log of a double for True Positive", 2.302, calculator.log(10.0), DELTA);
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

