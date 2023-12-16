public class Rule {

    Role role;

    Resource resource;

    ActionType actionType;

    Rule(Role role, Resource resource, ActionType actionType) {
        this.role = role;
        this.resource = resource;
        this.actionType = actionType;
    }

}
