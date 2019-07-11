import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Log
@Priority(Interceptor.Priority.APPLICATION)
public class LogInterceptor {

    @AroundInvoke
    public Object log (InvocationContext ic) throws Exception {
        System.out.println("Start " + ic.getMethod().getName());
        try{
            return ic.proceed();
        }catch( Exception e ){
            System.out.println("Exception " + e);
            throw e;
        }finally{
            System.out.println("End " + ic.getMethod().getName());
        }
    }

}
