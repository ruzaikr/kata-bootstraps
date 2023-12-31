import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AuthenticatedCustomer {

    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String address;

    private Basket basket;

}
