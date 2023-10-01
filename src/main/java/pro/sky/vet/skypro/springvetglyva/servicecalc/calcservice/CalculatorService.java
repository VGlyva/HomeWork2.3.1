package pro.sky.vet.skypro.springvetglyva.servicecalc.calcservice;


import pro.sky.vet.skypro.springvetglyva.servicecalc.api.Service;

public class CalculatorService implements Service {

    public String HelloCalc() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String PlusCalc(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String MinusCalc(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String Multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String Divide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
