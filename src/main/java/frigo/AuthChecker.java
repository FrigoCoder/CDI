
package frigo;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class AuthChecker {

    public void checkAuth (String user) {
        checkAuth(user);
    }

}
