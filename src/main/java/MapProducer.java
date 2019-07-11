import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class MapProducer {

    @Produces
    public <K, V> Map<K, V> produceMap (InjectionPoint ip) {
        if( valueIsNumber(ip.getType()) ){
            return new TreeMap<>();
        }
        return new HashMap<>();
    }

    private boolean valueIsNumber (Type type) {
        // TODO Auto-generated method stub
        return false;
    }
}
