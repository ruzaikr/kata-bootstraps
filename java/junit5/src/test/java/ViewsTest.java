import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ViewsTest {

    Views views;

    Deal dealSpecial = new Deal("id1", "ps5", 500.0);

    @BeforeEach
    void setup() {
        views = new Views();
        views.mostRecent = new Stack<>();

        String id1 = "id1";
        String id2 = "id99";
        String id3 = "id3";

        Deal deal2 = new Deal(id2, "xxx", 400.0);
        Deal deal3 = new Deal(id3, "nlo", 200.0);
        views.mostRecent.push(dealSpecial);
        views.mostRecent.push(deal2);
        views.mostRecent.push(deal3);

        views.deals.put(id1, dealSpecial);
        views.deals.put(id2, deal2);
        views.deals.put(id3, deal3);

        // stack: top-> [deal1, deal2, deal3]

    }

    @Test
    void testGetDeal() throws Exception {
        final Deal deal = views.getDealIfExists("id99");
        final Deal expectedDeal = new Deal("id99", "xxx", 400.0);
        assertEqualsDeal(expectedDeal, deal);
    }

    @Test
    void testAddUpdateDeal() throws Exception {
        final String id888 = "id888";
        final Deal deal = new Deal(id888, "xbox", 600.0);
        views.addUpdateDeal(deal);

        final Deal dealFromViews = views.getDealIfExists(id888);
        final Deal expectedDealFromViews = new Deal(id888, "xbox", 600.0);
        assertEqualsDeal(expectedDealFromViews, dealFromViews);
    }

    private static void assertEqualsDeal(final Deal deal1, final Deal deal2) {
        assertEquals(deal1.id, deal2.id);
        assertEquals(deal1.productName, deal2.productName);
        assertEquals(deal1.price, deal2.price);
    }

    @Test
    void testGetMostRecentlyViewedDeal() {
        views.addUpdateDeal(dealSpecial);
        final Deal mostRecentlyViewedDeal = views.getMostRecentlyViewedDeal();

        assertEqualsDeal(dealSpecial, mostRecentlyViewedDeal);
    }

}
