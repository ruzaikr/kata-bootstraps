import java.util.List;

public class Auth {

    List<Rule> rules;

    Auth(List<Rule> rules) {
        this.rules = rules;
    }

    public boolean isAllowed(User user, ActionType actionType, Resource resource) {
        for (Role userRole : user.roles) {
            for (Rule rule : rules) {
                if (userRole == rule.role && actionType == rule.actionType && resource == rule.resource) {
                    return true;
                }
            }
        }
        return false;
    }

}
