import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class GreeterApplication {

    public static void main (String[] args) {

        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        initializer.disableDiscovery();
        initializer.addBeanClasses(GreeterClient.class);
        initializer.addBeanClasses(User.class);
        initializer.addBeanClasses(EnglishHelloService.class);
        initializer.enableDecorators(HelloDecorator.class);
        initializer.enableInterceptors(LogInterceptor.class);

        try( SeContainer container = initializer.initialize() ){
            Instance<GreeterClient> instance = container.select(GreeterClient.class);
            GreeterClient greeter = instance.get();
            greeter.greet();
        }

    }

}
