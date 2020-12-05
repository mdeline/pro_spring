package service;

import model.FoodProvider;

public class PizzeriaLuca implements FoodProvider {
    @Override
    public String getFood() {
        return "Pizza Margherita";
    }
}
