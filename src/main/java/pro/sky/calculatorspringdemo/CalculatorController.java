package pro.sky.calculatorspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String getPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getPlus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String getMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getMinus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String getMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String getDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num2 != 0 ? num1 + " / " + num2 + " = " + calculatorService.getPlus(num1, num2) : "Ошибка: делить на 0 нельзя! ";
    }
}
