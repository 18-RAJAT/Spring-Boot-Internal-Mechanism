// Beans like DataSource and JpaRepository are auto-configured
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
