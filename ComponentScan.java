import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.springapp-1") // Scans for @Component, @Service, @Repository, etc.
public class AppConfig {
}
