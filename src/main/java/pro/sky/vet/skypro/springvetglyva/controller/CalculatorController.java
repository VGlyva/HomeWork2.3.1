package pro.sky.vet.skypro.springvetglyva.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.vet.skypro.springvetglyva.servicecalc.api.IService;
import pro.sky.vet.skypro.springvetglyva.servicecalc.calcservice.CalculatorService;



@RestController
public class CalculatorController {
    private final IService calculatorService;

    public CalculatorController(IService service) {
        this.calculatorService = service;
    }

        @GetMapping("/calculator")
        public String helloCalc() {
            return "Добро пожаловать в калькулятор";
        }

        @GetMapping("/calculator/plus")
        public String plusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            return calculatorService.plusCalc(num1, num2);
        }

        @GetMapping("/calculator/minus")
        public String minusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            return calculatorService.minusCalc(num1, num2);
        }

        @GetMapping("/calculator/multiply")
        public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            return calculatorService.multiply(num1, num2);
        }

        @GetMapping("/calculator/divide")
        public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
            return calculatorService.divide(num1, num2);
        }

        @ExceptionHandler(ArithmeticException.class)
        public String divideByZero() {
            return "На ноль делить нельзя";
        }
    }




