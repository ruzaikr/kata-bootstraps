import lombok.Data;
import lombok.NonNull;

@Data
public class AuthenticatedCustomer {

//    @NonNull
//    private Session session;

    @NonNull
    private String customerId;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    private String phone;

    @NonNull
    private String address;

    @NonNull
    private Basket basket;

    AuthenticatedCustomer(String customerId, String name, String email, String phone, String address) {

        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;

        basket = new Basket();

    }

}
