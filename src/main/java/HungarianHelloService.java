import static frigo.Language.Languages.HUNGARIAN;

import frigo.Language;

@Language(HUNGARIAN)
public class HungarianHelloService implements HelloService {

    @Override
    public String hello () {
        return "Helló Világ!";
    }

}
