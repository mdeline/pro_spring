import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Starting with Spring 3.0, XML configuration files are no longer necessary when developing a Spring
 * application. They can be replaced with annotations and configuration classes. Configuration classes are
 * Java classes annotated with @Configuration that contain bean definitions (methods annotated with @Bean)
 * **/
// List here all the classes that need to be instantiated and injected by Spring
@Configuration
public class ChocoCandyConfiguration {
    // equivalent to <bean id="renderer" class=".."/>
    @Bean
    public CandyProvider provider() {
        return new ChocoCandyProvider();
    }
    // equivalent to <bean id="renderer" class=".."/>
    @Bean
    public CandyRenderer renderer() {
        CandyRenderer renderer = new ChocoCandyRenderer();
        renderer.setCandyProvider(provider());
        return renderer;
    }
}