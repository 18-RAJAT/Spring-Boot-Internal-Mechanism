import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    private final MyRepository repository;

    @Autowired 
    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void performService() {
        repository.save();
    }
}
