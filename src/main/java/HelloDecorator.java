import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class HelloDecorator implements HelloService {

    @Inject
    @Delegate
    private HelloService hello;

    @Override
    public String hello () {
        return "Decorated " + hello.hello();
    }

}
