import static frigo.Language.Languages.ENGLISH;

import frigo.Language;

@Language(ENGLISH)
public class EnglishHelloService implements HelloService {

    @Override
    public String hello () {
        return "Hello World!";
    }

}
