import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FeedGenService {

    /*

    - Function to generate the feed for a given user.
    - Input:

     */


    public List<Tweet> generateFeed(final String userId) {

        final List<String> idsOfFriends = GetFriendsService.getIdsOfFriends(userId);

        final List<Tweet> allTweets = new ArrayList();

        for (String idOfFriend : idsOfFriends) {
            final List<Tweet> tweetsOfFriend = GetTweetsService.getTweets(idOfFriend);
            allTweets.add(tweetsOfFriend);
        }

        allTweets.sort(tweet -> tweet.getTimeStamp());

        // allTweets which is sorted by timeStamp

        return allTweets;
    }

}
