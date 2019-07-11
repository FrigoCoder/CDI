import javax.enterprise.context.RequestScoped;

@RequestScoped
public class User {

    protected int id;
    protected String name;

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

}
