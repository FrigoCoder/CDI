
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("")
public class GreeterClient {

    @Inject
    private HelloService hello;

    @GET
    @Path("hello")
    public String hello () {
        return hello.hello();
    }

}
