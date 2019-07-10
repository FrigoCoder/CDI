
import static frigo.Whatever.sayHello;

import javax.inject.Inject;

public class GreeterClient {

    @Inject
    @English
    @Console
    @Secured
    private HelloService hello;

    public void hello () {
        sayHello(hello.hello());
    }

}
