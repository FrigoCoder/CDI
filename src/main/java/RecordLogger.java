import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

@SuppressWarnings("unused")
public class RecordLogger {

    public void recordString (@Observes Record<String> record) {}

    public void recordNumber (@Observes Record<Number> record) {}

    public void beginRequest (@Observes @Initialized(RequestScoped.class) ServletRequest req) {}

    public void endRequest (@Observes @Destroyed(RequestScoped.class) HttpSession req) {}

    public void beginSession (@Observes @Initialized(SessionScoped.class) ServletRequest req) {}

    public void endSession (@Observes @Destroyed(SessionScoped.class) HttpSession req) {}

}
