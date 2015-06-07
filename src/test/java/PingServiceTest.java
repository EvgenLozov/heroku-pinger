import http.HttpService;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

/**
 * Created by user50 on 07.06.2015.
 */
public class PingServiceTest {

    @Test
    public void testStart() throws Exception {
        PingURIProvider pingURIProvider = new PingURIProvider();
        pingURIProvider.add(new PingURI("www.service-node.com", "/"));

        HttpService httpService = new HttpService(HttpClients.createDefault());

        PingService pingService = new PingService(httpService, pingURIProvider);
        pingService.start();
    }
}
