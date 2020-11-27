import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        /**
         * 1. The Vanilla Way
        **/
        CandyRenderer chocoCandyRenderer = new ChocoCandyRenderer();
        CandyProvider chocoCandyProvider = new ChocoCandyProvider();

        chocoCandyRenderer.setCandyProvider(chocoCandyProvider);
        chocoCandyRenderer.render();

        /**
         * 2. The Spring Way
         *
         * The interface ApplicationContext is used by Spring for storing all the environmental
         * information with regard to an application being managed by Spring.
         *
         * After configuring the ApplicationContext you no longer need to instantiate or inject the classes yourself.
         * **/
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ChocoCandyConfiguration.class);
        CandyRenderer candyRenderer = ctx.getBean("renderer", CandyRenderer.class);
        candyRenderer.render();
    }
}
