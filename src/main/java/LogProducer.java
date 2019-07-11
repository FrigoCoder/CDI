import java.lang.reflect.Member;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LogProducer {

    @Produces
    public Logger produceLog (InjectionPoint injectionPoint) {
        Member member = injectionPoint.getMember();
        Class<?> clazz = member.getDeclaringClass();
        return Logger.getLogger(clazz.getName());
    }

}
