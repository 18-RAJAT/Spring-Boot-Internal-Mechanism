import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component 
public class LifecycleBean {
    @PostConstruct 
    public void init() {
        System.out.println("Bean is initialized.");
    }

    @PreDestroy 
    public void cleanup() {
        System.out.println("Bean is about to be destroyed.");
    }
}
