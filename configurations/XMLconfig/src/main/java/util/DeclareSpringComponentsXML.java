package util;

import org.springframework.context.support.GenericXmlApplicationContext;
import model.*;

public class DeclareSpringComponentsXML {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();

        FoodTransporter foodoraFoodTransporter = ctx.getBean("foodora", FoodTransporter.class);
        foodoraFoodTransporter.transport();
        ctx.close();
    }
}
