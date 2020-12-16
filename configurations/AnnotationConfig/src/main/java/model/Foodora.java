package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("foodora")
public class Foodora implements FoodTransporter {
    private FoodProvider foodProvider;

    @Override
    public void transport() {
        if (foodProvider == null) {
            throw new RuntimeException(
                    "You must set the property foodProvider of class:" + FoodTransporter.class.getName());
        }
        System.out.println(foodProvider.getFood());
    }

    @Override
    @Autowired
    public void setFoodProvider(FoodProvider foodProvider) {
        this.foodProvider = foodProvider;
    }

    @Override
    public FoodProvider getFoodProvider() {
        return this.foodProvider;
    }
}