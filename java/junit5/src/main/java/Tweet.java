import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Tweet {

    private String body;

    private String timeStamp;

    private String author;

}
