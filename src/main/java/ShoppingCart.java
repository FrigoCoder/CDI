import static frigo.Whatever.doSomething;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SuppressWarnings("unused")
@SessionScoped
public class ShoppingCart implements Serializable {

    public void addItem (Item item) {
        doSomething();
    }

}
