import java.lang.annotation.Annotation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("")
@SuppressWarnings("serial")
public class GreeterRest {

    public static void display () {}

    @Any
    @Inject
    private Instance<HelloService> services;

    @GET
    @Path("hello")
    public String hello () {
        Annotation qualifier = new AnnotationLiteral<English>() {
        };
        HelloService service = services.select(qualifier).get();
        return service.hello();
    }

}
