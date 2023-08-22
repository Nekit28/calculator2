package pro.sky.calculatorspringdemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParametrizedTest {

    private final CalculatorService calculatorService = new CalculatorService();
    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(1, 1,"1 + 1 = 2"),
                Arguments.of(54, 3,"54 + 3 = 57"),
                Arguments.of(121, 20,"121 + 20 = 141")
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.plus(num1, num2));

    }
    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(1, 1,"1 - 1 = 0"),
                Arguments.of(54, 3,"54 - 3 = 51"),
                Arguments.of(121, 20,"121 - 20 = 101")
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.minus(num1, num2));

    }
    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(1, 1,"1 * 1 = 1"),
                Arguments.of(54, 3,"54 * 3 = 162"),
                Arguments.of(121, 20,"121 * 20 = 2420")
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorService.multiply(num1, num2));

    }
    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(1, 1,"1 / 1 = 1.0"),
                Arguments.of(54, 3,"54 / 3 = 18.0"),
                Arguments.of(122, 2,"122 / 2 = 61.0")
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorService.divide(num1, num2));

    }

}