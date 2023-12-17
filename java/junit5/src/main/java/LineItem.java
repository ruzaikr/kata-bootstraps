import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LineItem {

    private final String productId;

    private final double unitPrice;

    private final int quantity;

}
