import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;


class ShoppingCartTest {

    @Test
    void testCartGreaterThan25EligibleForFreeShipping() {

        final List<LineItem> lineItems = ShoppingCartTestData.getValidLineItems();

        final Member member = new Member("memberId1", false);

        final ShoppingCart shoppingCart = new ShoppingCart(lineItems, member);

        final double totalPrice = shoppingCart.getTotalPrice();
        final double expectedTotalPrice = 2*100.0 + 1*200.0;

        assertEquals(expectedTotalPrice, totalPrice);

        final boolean isEligibleForFreeShipping = shoppingCart.isEligibleForFreeShipping();

        assertTrue(isEligibleForFreeShipping);

    }

    @Test
    void testCartLessThan25NotEligibleForFreeShipping() {

        final List<LineItem> lineItems = ShoppingCartTestData.getValidLineItemsLessThan25();

        final Member member = new Member("memberId1", false);

        final ShoppingCart shoppingCart = new ShoppingCart(lineItems, member);

        final double totalPrice = shoppingCart.getTotalPrice();
        final double expectedTotalPrice = ShoppingCartTestData.getExpectedTotalPriceItemsLessThan25();

        assertEquals(expectedTotalPrice, totalPrice);

        final boolean isEligibleForFreeShipping = shoppingCart.isEligibleForFreeShipping();

        assertFalse(isEligibleForFreeShipping);

    }

    @Test
    void testCartLessThan25PrimeMemberNotEligibleForFreeShipping() {

        final List<LineItem> lineItems = ShoppingCartTestData.getValidLineItemsLessThan25();

        final Member member = new Member("memberId1", true);

        final ShoppingCart shoppingCart = new ShoppingCart(lineItems, member);

        final double totalPrice = shoppingCart.getTotalPrice();
        final double expectedTotalPrice = ShoppingCartTestData.getExpectedTotalPriceItemsLessThan25();

        assertEquals(expectedTotalPrice, totalPrice);

        final boolean isEligibleForFreeShipping = shoppingCart.isEligibleForFreeShipping();

        assertTrue(isEligibleForFreeShipping);

    }

    @Test
    void testCartEmptyLineItems() {

        final Member member = new Member("memberId1", false);

        final ShoppingCart shoppingCart = new ShoppingCart(List.of(), member);

        final double totalPrice = shoppingCart.getTotalPrice();
        final double expectedTotalPrice = 0.0;

        assertEquals(expectedTotalPrice, totalPrice);

        final boolean isEligibleForFreeShipping = shoppingCart.isEligibleForFreeShipping();

        assertFalse(isEligibleForFreeShipping);

    }
}
