import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(CdiRunner.class)
public class GreeterClientTest {

    @Produces
    private String user = "Frigo";
    @Produces
    @Mock
    private HelloService hello;
    @Produces
    @Mock
    private EmailService email;
    @Inject
    private GreeterClient greeter;

    @Test
    public void greet_test () {
        Mockito.doReturn("Bonjour").when(hello).hello();
        greeter.greet();
        Mockito.verify(email).send("Frigo said Bonjour");
    }

}
