package util;

import config.FoodConfiguration;
import model.FoodTransporter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FoodConfiguration.class);
        FoodTransporter foodora = ctx.getBean("foodora", FoodTransporter.class);
        foodora.transport();
    }
}
