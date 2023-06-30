package pro.sky.calculatorspringdemo;

public interface CalculatorService {
    String hello();

    int getPlus(int x, int y);
    int getMinus(int x, int y);
    int getMultiply(int x, int y);
    double  getDivide(int x, int y);
}
