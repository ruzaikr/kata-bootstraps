import java.util.List;

public class ShoppingCartTestData {

    private static LineItem getLineItem(String productId, int quantity, double unitPrice) {
        return new LineItem(productId, unitPrice, quantity);
    }

    static List<LineItem> getValidLineItems() {
        return List.of(
            getLineItem("222", 2, 100.0),
            getLineItem("111", 1, 200.0)

        );
    }

    static List<LineItem> getValidLineItemsLessThan25() {
        return List.of(
            getLineItem("222", 2, 1.0),
            getLineItem("111", 1, 20.0)

        );
    }

    static double getExpectedTotalPriceItemsLessThan25() {
        return 2*1.0 + 1*20.0;
    }

}
