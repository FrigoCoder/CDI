
import static frigo.Whatever.display;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GreeterClient {

    @Inject
    private HelloService hello;

    @Log
    public void greet () {
        display(hello.hello());
    }

}
