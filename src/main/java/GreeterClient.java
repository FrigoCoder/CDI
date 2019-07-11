
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GreeterClient {

    @Inject
    private User user;

    public void greet () {
        // user.id is 0
        // user.name is null
    }

}
