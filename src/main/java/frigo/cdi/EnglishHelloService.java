package frigo.cdi;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnglishHelloService implements HelloService {

    @Override
    public String hello() {
        return "Hello ddd!";
    }

}
