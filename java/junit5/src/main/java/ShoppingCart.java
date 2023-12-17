import java.util.List;
import lombok.Data;

@Data
public class ShoppingCart {

    final private List<LineItem> lineItems;

    private double totalPrice;

    final private Member member;

    ShoppingCart(final List<LineItem> lineItems, final Member member) {
        this.lineItems = lineItems;
        this.member = member;

        lineItems.forEach(lineItem -> totalPrice += lineItem.getUnitPrice() * lineItem.getQuantity());

    }

    public boolean isEligibleForFreeShipping() {
        return member.isPrime() || totalPrice >= 25.0;
    }

}
