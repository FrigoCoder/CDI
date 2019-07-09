


import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("")
public class HelloWorld {
	
    @GET
    @Path("hello") 
    public String hello () {
        return "Hello World!";
    }

}
