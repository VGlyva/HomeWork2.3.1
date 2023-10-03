package pro.sky.vet.skypro.springvetglyva.servicecalc.calcservice;
import pro.sky.vet.skypro.springvetglyva.servicecalc.api.IService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements IService {

    public int plusCalc(int num1, int num2) {
        return num1 + num2;
    }

    public int minusCalc(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
