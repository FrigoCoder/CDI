import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import frigo.Language;
import frigo.Language.Languages;

@ApplicationScoped
@Path("")

public class GreeterRest {

    public static void sayHello () {}

    @Inject
    @Language(Languages.ENGLISH)
    private HelloService hello;

    @GET
    @Path("hello")
    public String hello () {
        return hello.hello();
    }

}
