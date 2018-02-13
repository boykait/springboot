package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 2018/02/13
 *
 * @author boyka
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootExampleApplication.class);
        application.run(args);
    }
}
