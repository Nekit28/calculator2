package pro.sky.calculatorspringdemo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void greetings_success() {

        String expectedResult = "Добро пожаловать в калькулятор";


        String actualResult = calculatorService.greetings();
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void plus_success() {
        int num1 = 4;
        int num2 = 2;

        String expectedResult = TestUtils.formatResult(num1, num2,"+", "6");


        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void minus_success() {
        int num1 = 4;
        int num2 = 2;

        String expectedResult = TestUtils.formatResult(num1, num2,"-", "2");


        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void multiply_success() {
        int num1 = 4;
        int num2 = 2;

        String expectedResult = TestUtils.formatResult(num1, num2,"*", "8");


        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void divide_success() {
        int num1 = 4;
        int num2 = 2;

        String expectedResult = TestUtils.formatResult(num1, num2,"/", "2.0");


        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void divide_withNum2IsZero() {
        int num1 = 4;
        int num2 = 0;

        String expectedErrorMassage = "На ноль делить нельзя!";

        Exception exception = assertThrows(ZeroDivideException.class, () -> calculatorService.divide(num1, num2));
        assertEquals(expectedErrorMassage, exception.getMessage());


    }


}