import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AppStore {

    private final List<FeedGenService> purchasableFeedGenServices;

    public List<FeedGenService> get2Apps(final User user) throws Exception {
//        for (App app : purchasableApps) {
//            for (App app2 : purchasableApps) {
//                if (!app2.getId().equals(app.getId())
//                    && app.getPrice() + app2.getPrice() == user.getCredit()) {
//                    return List.of(app, app2);
//                }
//
//            }
//        }

        int leftPtr = 0;
        int rightPtr = 1;

        // credit : 2
        // [4, 1, 6, 1]

        while (leftPtr < rightPtr) {
            FeedGenService left = purchasableFeedGenServices.get(leftPtr);
            FeedGenService right = purchasableFeedGenServices.get(rightPtr);
            double sum = left.getPrice() + right.getPrice();
            if (sum == user.getCredit()) {
                return List.of(left, right);
            }

        }

        throw new Exception("can not find 2 apps that are within credit");

    }

}
