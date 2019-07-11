import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.enterprise.inject.spi.WithAnnotations;

class MyExtension implements Extension {

    <T> void processAnnotatedType (@Observes @WithAnnotations({Ignore.class}) ProcessAnnotatedType<T> pat) {
        if( pat.getAnnotatedType().isAnnotationPresent(Ignore.class) ){
            pat.veto();
        }

    }

}
