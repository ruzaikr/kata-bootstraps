import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class FeedGenServiceStoreTest {

    private static void assertEqualsAppsList(final List<FeedGenService> apps1, final List<FeedGenService> apps2) {
        assertEquals(apps1.size(), apps2.size());
        assertTrue(apps1.containsAll(apps2));
        assertTrue(apps2.containsAll(apps1));
    }

    @Test
    void testGet2AppsWhenAvailable() throws Exception {
        final List<FeedGenService> baseFeedGenServices = AppStoreTestData.getBaseApps();
        final AppStore appstore = new AppStore(baseFeedGenServices);
        assertEqualsAppsList(
            AppStoreTestData.getExpected2Apps(),
            appstore.get2Apps(new User(3.0)));
    }

    @Test
    void testGet2AppsWhenCreditInsufficient() throws Exception {
        final List<FeedGenService> baseFeedGenServices = AppStoreTestData.getBaseApps();
        final AppStore appstore = new AppStore(baseFeedGenServices);
        assertThrowsExactly(Exception.class, () -> appstore.get2Apps(new User(1.0)));
    }

}
