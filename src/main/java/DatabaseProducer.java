import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class DatabaseProducer {

    @Produces
    public Database openDatabase () {
        return new Database("http://database", "user", "pass");
    }

    public void closeDatabase (@Disposes Database database) {
        database.close();
    }

}
