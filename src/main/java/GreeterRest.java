import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("")
public class GreeterRest {

    @Inject
    private HelloDecorator hello;

    public GreeterRest () {
        System.out.println("Constructor " + hello);
    }

    @PostConstruct
    public void init () {
        System.out.println("@PostConstruct " + hello);
    }

    @PreDestroy
    public void teardown () {
        System.out.println("@PreDestroy " + hello);
    }

    @GET
    @Path("hello")
    public String hello () {
        return hello.hello();
    }

}
