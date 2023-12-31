import java.util.List;

public class AppStoreTestData {

    static List<FeedGenService> getBaseApps() {
        return List.of(
            new FeedGenService("app1", 1.0),
            new FeedGenService("app99", 4.0),
            new FeedGenService("app2", 2.0)
        );
    }

    static List<FeedGenService> getExpected2Apps() {
        return List.of(
            new FeedGenService("app1", 1.0),
            new FeedGenService("app2", 2.0)
        );
    }

}

/*

1 - Introduction
2 - What Are Design Fundamentals?
- Client—Server Model
- Network Protocols
- Storage
- Latency And Throughput
- Availability
- Caching
- Proxies
- Load Balancers
- Hashing
- Relational Databases
- Key-Value Stores
- Specialized Storage Paradigms
- Replication And Sharding
- Leader Election
- Peer-to-Peer Networks
- Polling And Streaming
- Configuration
- Rate Limiting
- Logging And Monitoring
- Publish/Subscribe Pattern
- MapReduce
- Security And HTTPS
- API Design

 */
