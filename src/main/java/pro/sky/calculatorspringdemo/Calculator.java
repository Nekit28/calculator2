package pro.sky.calculatorspringdemo;

import org.springframework.stereotype.Service;

@Service
class Calculator implements CalculatorService {
    public String hello() {
        return " Добро пожаловать в калькулятор";
    }
    public int getPlus(int x, int y) {
        return x + y;
    }

    public int getMinus(int x, int y) {
        return x - y;
    }

    public int getMultiply(int x, int y) {
        return x * y;
    }

    public double getDivide(int x, int y) {
        return x * 1.0 / y;
    }
}
