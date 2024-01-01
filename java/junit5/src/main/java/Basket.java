import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class Basket {

    @NonNull
    private UUID id;

    private Business business;

    @NonNull
    private List<Product> products;

    Basket() {
        id = UUID.randomUUID();
        products = new LinkedList<>();
    }


}
