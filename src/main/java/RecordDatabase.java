import java.lang.annotation.Annotation;

import javax.enterprise.event.Event;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

@SuppressWarnings("serial")
public class RecordDatabase {

    @Inject
    private Event<Record> recordAdded;

    public void addRecord (Record record) {
        Annotation annotation = new AnnotationLiteral<Added>() {
        };
        recordAdded.select(annotation).fire(record);
    }

}
