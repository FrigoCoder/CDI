import javax.inject.Inject;

public class DatabaseReplicator {

    public static void main (String[] args) {
        Database source = null;
        Database target = null;
        new DatabaseReplicator().replicate(); // This will never work
    }

    @Inject
    @Source
    private Database source;
    @Inject
    @Source
    private Database target;

    @Log
    public void replicate () {
        replicate();
    }

}
