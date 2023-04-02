import javax.enterprise.inject.Specializes;

@Specializes
public class MockSmtpEmailService extends SmtpEmailService {

    @Override
    public void send(String hello) {
        System.out.println(hello);
    }

}
