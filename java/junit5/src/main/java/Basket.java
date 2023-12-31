import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Basket {

    private String id;

    private Business business;

    private List<Product> products;


}
