import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@RequestScoped
public class LoginName {

    @Inject
    private HttpServletRequest request;

    public String get () {
        return request.getUserPrincipal().getName().toLowerCase();
    }

}
