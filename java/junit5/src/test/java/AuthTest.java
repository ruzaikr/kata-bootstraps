import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class AuthTest {

    @Test
    void testIsAllowed() {

        Role devRole = new Role("dev");

        User jack = new User("jack", List.of(devRole));

        Resource resource = new Resource("resource1");

        // Create rules
        Rule rule1 = new Rule(devRole, resource, ActionType.READ);
        List<Rule> rules = List.of(
            rule1
        );

        Auth auth = new Auth(rules);

        boolean isAllowed = auth.isAllowed(jack, ActionType.READ, resource);

        assertTrue(isAllowed);

    }

    @Test
    void testIsAllowedMultipleRoles() {

        Role devRole = new Role("dev");
        Role adminRole = new Role("admin");

        User jack = new User("jack", List.of(devRole, adminRole));

        Resource resource = new Resource("resource1");

        // Create rules
        Rule rule1 = new Rule(adminRole, resource, ActionType.READ);
        List<Rule> rules = List.of(
            rule1
        );

        Auth auth = new Auth(rules);

        boolean isAllowed = auth.isAllowed(jack, ActionType.READ, resource);

        assertTrue(isAllowed);

    }


}
