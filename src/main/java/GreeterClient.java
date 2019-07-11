
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class GreeterClient {

    @Inject
    private Instance<String> user;

    @Inject
    private HelloService hello;

    @Inject
    private EmailService email;

    public void greet () {
        email.send(user.get() + " said " + hello.hello());
    }

}
