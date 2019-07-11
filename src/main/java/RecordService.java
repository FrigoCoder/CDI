import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class RecordService {

    @Inject
    private User user;

    public void printUser () {
        System.out.println(user.name);
    }

}
