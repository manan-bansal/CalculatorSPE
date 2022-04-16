package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2 = 0;
        do {
            System.out.println("Scientific Calculator : Press the number corresponding to the operation that you need to perform");
            System.out.print("1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Inverse\n6) Factorial\n7) Power\n8) Square Root\n9) Log\n" +
                    "Press any other key to exit");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            if((choice==5) || (choice==6) || (choice==8) || (choice==9)) {
                try{// do subtraction
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                } catch (InputMismatchException error) {
                    return;
                }
            }
            else {
                try {
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                } catch (InputMismatchException error) {
                    logger.error("Invalid input");
                    return;
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Addition : " + calculator.add(number1, number2));
                    break;
                case 2:
                    System.out.println("Subtraction : " + calculator.subtract(number1, number2));
                    break;
                case 3:
                    System.out.println("Multiplication : " + calculator.multiply(number1, number2));
                    break;
                case 4:
                    System.out.println("Division result : " + calculator.divide(number1, number2));
                    break;
                case 5:
                    System.out.println("Inverse result : " + calculator.inverse(number1));
                    break;
                case 6:
                    System.out.println("Factorial result : " + calculator.factorial(number1));
                    break;
                case 7:
                    System.out.println("X power Y : " + calculator.powered(number1, number2));
                    break;
                case 8:
                    System.out.println("Square root : " + calculator.root(number1));
                    break;
                case 9:
                    System.out.println("Log : " + calculator.log(number1));
                    break;
                default:
                    System.out.println("Terminated");
                    return;
            }
        } while (true);
    }


    public double add(double number1, double number2) {
        logger.info("ADDITION - " + number1 + ", " + number2);
        double result = number1 + number2;
        logger.info("RESULT - " + result);
        return result;
    }

    public double subtract(double number1, double number2) {
        logger.info("SUBTRACTION - " + number1 + ", " + number2);
        double result = number1 - number2;
        logger.info("RESULT - " + result);
        return result;
    }


    public double multiply(double number1, double number2) {
        logger.info("MULTIPLICATION - " + number1 + ", " + number2);
        double result = number1 * number2;
        logger.info("RESULT - " + result);
        return result;
    }

    public double divide(double number1, double number2) {
        double result = 0;
        try {
            logger.info("DIVISION - " + number1 + ", " + number2);
            if (number1 == 0 && number2 == 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of 0.0/0.0");
            } else if (number1 > 0 && number2 == 0) {
                result = Double.POSITIVE_INFINITY;
                throw new ArithmeticException("Case of 1.0/0.0");
            } else if (number1 <= -1 && number2 == 0) {
                result = Double.NEGATIVE_INFINITY;
                throw new ArithmeticException("Case of -1.0/0.0");
            } else {
                result = number1 / number2;
            }
        } catch (ArithmeticException error) {
            logger.error("EXCEPTION - Cannot be divided by ZERO " + error.getLocalizedMessage());
        } finally {
            logger.info("RESULT - " + result);
        }
        return result;
    }

    public double root(double number1) {
        double result = 0;
        double number = 0.5;
        result = powered(number1,number);
        return result;
    }

    public double inverse(double number1) {
        double result = 0;
        double number = 1;
        result = divide(number,number1);
        return result;
    }

    public double log(double number1) {
        double result = 0;
        result = Math.log(number1);
        return result;
    }

    public double powered(double number1, double number2) {
        double result = 0;
        result = Math.pow(number1, number2);
        try {
            if(result == Double.NaN) {
                throw new ArithmeticException("Case of NaN");
            }
            else {
                result=result;
            }
        } catch (ArithmeticException error) {
            logger.error("EXCEPTION - Cannot be found " + error.getLocalizedMessage());
        } finally {
            logger.info("RESULT - " + result);
        }
        return result;
    }

    public double factorial(double number1) {
        double result = 1;
        int i = 1;
        int x = (int) number1;
        try {
            logger.info("FACTORIAL - " + number1);
            if(number1!=x) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN");
            }
            else if(number1<0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN");
            } else if(number1>=0) {
                for(i=2;i<=number1;i++) {
                    result=result*i;
                }
            }
        } catch (ArithmeticException error) {
            logger.error("EXCEPTION - Cannot be found " + error.getLocalizedMessage());
        } finally {
            logger.info("RESULT - " + result);
        }
        return result;
    }
}

