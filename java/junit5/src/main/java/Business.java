import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Business {

    private String id;

    private String name;

    private List<Product> products;

}
