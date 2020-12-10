package model;

public interface FoodTransporter {
    void transport();
    void setFoodProvider(FoodProvider foodProvider);
    FoodProvider getFoodProvider();
}
