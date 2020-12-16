package config;

import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfiguration {
    @Bean
    public FoodProvider pizzeriaLuca() {
        return new PizzeriaLuca();
    }
    @Bean
    public FoodTransporter foodora(){
        FoodTransporter transporter = new Foodora();
        transporter.setFoodProvider(pizzeriaLuca());
        return transporter;
    }
}
