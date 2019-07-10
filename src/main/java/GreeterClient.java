
import static frigo.Language.Languages.ENGLISH;
import static frigo.Whatever.sayHello;

import javax.inject.Inject;

import frigo.Language;

public class GreeterClient {

    @Inject
    @Language(ENGLISH)
    private HelloService hello;

    public void hello () {
        sayHello(hello.hello());
    }

}
