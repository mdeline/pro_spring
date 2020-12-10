package service;

import model.FoodProvider;
import org.springframework.stereotype.Component;

@Component("pizzeriaLuca")
public class PizzeriaLuca implements FoodProvider {
    @Override
    public String getFood() {
        return "Pizza Margherita";
    }
}
