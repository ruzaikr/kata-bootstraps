import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Views {

    Stack<Deal> mostRecent;

    Map<String, Deal> deals;

    Views() {
        mostRecent = new Stack<>();
        deals = new HashMap<>();
    }

    public Deal getDealIfExists(final String id) throws Exception {
        final Deal deal = deals.get(id);
        if (deal == null) {
            throw new Exception("deal not found");
        }
        return deal;
    }

    public void addUpdateDeal(final Deal deal) {
        deals.put(deal.id, deal);

        mostRecent.push(deal);
    }

    public Deal getMostRecentlyViewedDeal() {
        return mostRecent.peek();
    }

}
