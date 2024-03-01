import java.util.*;

/*

Session Log Analysis:

An operation can be a "start session", or an "end session", or another type of
operation. Each line of the log contains the timestamp, the session ID and the
operation, in order.
<timestamp>,<session_id>,<operation>

Definitions:

- Complete session: A session that starts and ends is a complete session. The
length of a session is for how long it was open.

- Open session: A session that starts but doesn't end is an open session.

- Out of session operation: An operation that cannot be associated with a
previous "start session", is an out of session operation. An "end session" can
also be out of session.

Tasks:

1. Count number of open sessions, complete sessions, and out of session
operations.

2. Given number N, return the IDs of the longest completed N sessions, in order.

3. Find the maximum number of simultaneously open sessions.

Note: The main input is a multi-line string containing the log. The input is
always valid, meaning the same session cannot be started twice, timestamps are
in chronological order, and there are no blank lines.

Example Log:

In the log below, there are three sessions, 5, 7, and 10. In session 7, we have
4 operations including 2 operations to start and end the session. Session 7 is
a *complete session*, the operation at time 1221 is an
*out of session operation* and session 10 is an *open session* at the end of the
log. Also, session 7 was *open* for 5 seconds from 1234 to 1239. So, the length
of a session is its end time minus its start time.

1221,5,read a file
1234,7,start session
1235,7,read a file
1236,7,write a record
1239,10,start session
1239,7,end session
1242,10,edit a record

 */

class Solution {

    /*
    *
    *
    * */

    private static List<Integer> longestCompletedSessions(List<List<String>> triplets, int n) {

        Map<Integer, Integer> sessionIdToOpenSessionTime = new HashMap<>();

        PriorityQueue<int[]> completedSessions = new PriorityQueue<>(Comparator.comparingInt(ints -> ints[1]));

        for (List<String> triplet : triplets) {
            int sessionId = getSessionId(triplet);
            if (isOpenOperation(triplet)) {
                sessionIdToOpenSessionTime.put(sessionId, getTimeStamp(triplet));
            }

            if (isEndOperation(triplet) && sessionIdToOpenSessionTime.containsKey(sessionId)) {
                int sessionLength = sessionIdToOpenSessionTime.get(sessionId) - getTimeStamp(triplet);
                completedSessions.add(new int[]{sessionLength, sessionId});
            }
        }

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            result.add(completedSessions.remove()[1]);
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "1221,5,read a file\n" +
                "1234,7,start session\n" +
                "1235,7,read a file\n" +
                "1236,7,write a record\n" +
                "1239,10,start session\n" +
                "1239,7,end session\n" +
                "1242,10,edit a record";

        List<String> operations = List.of(input.split("\n"));

        List<List<String>> listOfOperationTriplets = operations.stream().map(operation -> List.of(operation.split(","))).toList();

        Set<Integer> openSessionIds = new HashSet<>();

        int outOfSessionOperations = 0;
        int completeSessions = 0;
        for (List<String> triplet : listOfOperationTriplets) {
            int sessionId = getSessionId(triplet);
            if (isOpenOperation(triplet)) {
                openSessionIds.add(sessionId);
                continue;
            }
            if (isEndOperation(triplet)) {
                if (openSessionIds.contains(sessionId)) {
                    openSessionIds.remove(sessionId);
                    completeSessions++;
                }
            }
            if(isNotOpenNorEndOperation(triplet) && !openSessionIds.contains(sessionId)) {
                outOfSessionOperations++;
            }

        }
        int openSession = openSessionIds.size();

        System.out.println(openSession);
        System.out.println(completeSessions);
        System.out.println(outOfSessionOperations);

        System.out.println(longestCompletedSessions(listOfOperationTriplets, 2));

    }

    private static Integer getSessionId(List<String> triplet) {
        return Integer.parseInt(triplet.get(1));
    }

    private static Integer getTimeStamp(List<String> triplet) {
        return Integer.parseInt(triplet.get(0));
    }

    private static boolean isOpenOperation(List<String> triplet) {
        return triplet.get(2).equals("start session");
    }

    private static boolean isEndOperation(List<String> triplet) {
        return triplet.get(2).equals("end session");
    }

    private static boolean isNotOpenNorEndOperation(List<String> triplet) {
        return !isEndOperation(triplet) && !isOpenOperation(triplet);
    }



}