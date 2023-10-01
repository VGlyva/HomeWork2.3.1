package pro.sky.vet.skypro.springvetglyva.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.vet.skypro.springvetglyva.servicecalc.calcservice.CalculatorService;


@RestController
public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping(path = "/calculator")
    public String HelloCalc() {
        return calculatorService.HelloCalc();
    }

    @GetMapping(path = "/calculator/plus")
    public String PlusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.PlusCalc(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String MinusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.MinusCalc(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String Multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String Divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Divide(num1, num2);
    }

    @ExceptionHandler(ArithmeticException.class)
    public String DivideByZero() {
        return "На ноль делить нельзя";
    }
}
