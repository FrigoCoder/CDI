import java.util.List;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class ActionCollector {

    @Inject
    private Instance<Action> actions;

    public List<Action> possibleActions(Record record) {
        return actions.stream().filter(action -> action.isApplicable(record)).toList();
    }

}
