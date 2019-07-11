import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("")
public class GreeterRest {

    @Inject
    private User user;

    @GET
    @Path("hello")
    public String hello () {
        return user.getClass().toString();
    }

}
