
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class GreeterClient {

    @Inject
    private HelloService hello;

    public GreeterClient () {
        System.out.println("Constructor " + hello);
    }

    @PostConstruct
    public void init () {
        System.out.println("@PostConstruct " + hello);
    }

    @PreDestroy
    public void teardown () {
        System.out.println("@PreDestroy " + hello);
    }

}
