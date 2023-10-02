package pro.sky.vet.skypro.springvetglyva.servicecalc.calcservice;
import pro.sky.vet.skypro.springvetglyva.servicecalc.api.IService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements IService {

    public String plusCalc(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minusCalc(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
