import http.HttpResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;

/**
 * Created by user50 on 07.06.2015.
 */
public class PingHttpRequestHandler implements HttpResponseHandler<Void> {
    @Override
    public Void handle(CloseableHttpResponse httpResponse) {
        return null;
    }
}
