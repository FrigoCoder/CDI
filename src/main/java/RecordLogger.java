import javax.enterprise.event.Observes;

@SuppressWarnings("unused")
public class RecordLogger {

    public void recordString (@Observes Record<String> record) {}

    public void recordNumber (@Observes Record<Number> record) {}

}
