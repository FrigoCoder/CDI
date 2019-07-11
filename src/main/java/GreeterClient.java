
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GreeterClient {

    @Inject
    private User user;

    @Inject
    private HelloService hello;

    public void greet () {
        user.getId();
        user.getName();
        hello.hello();
    }

}
