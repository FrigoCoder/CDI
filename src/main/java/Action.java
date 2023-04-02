
public interface Action {

    boolean isApplicable(Record record);

    void apply(User record);

}
