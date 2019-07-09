
import javax.inject.Inject;

public class GreeterClient {

    @Inject
    private HelloService hello;

    public void displayHello () {
        Whatever.display(hello.hello());
    }

}
