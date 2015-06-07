import http.HttpService;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by user50 on 07.06.2015.
 */
public class PingService {
    private static Logger logger = Logger.getLogger(PingService.class.getSimpleName());

    private HttpService httpService;
    private PingURIProvider pingURIProvider;

    public PingService(HttpService httpService, PingURIProvider pingURIProvider) {
        this.httpService = httpService;
        this.pingURIProvider = pingURIProvider;
    }

    public void start() throws InterruptedException {
        while (true)
        {
            for (PingURI uri : pingURIProvider.getUris()) {
                try {
                    httpService.execute(new PingHttpRequestProvider(uri.getUrl(), uri.getHost()),
                                       new PingHttpRequestHandler());
                    logger.info("Url has been pinged: " + uri.getHost());

                } catch (IOException e) {
                    logger.info("Unable to ping url : " + uri.getHost() +
                                ". Cause : " + e.getClass().getSimpleName() + "; " +e.getMessage());
                }
            }

            Thread.sleep(10_000);

        }
    }
}
