
import javax.inject.Inject;

public class GreeterClient {

    @Inject
    private Service<Hello> hello;

    @Inject
    private Service<Email> email;

}
