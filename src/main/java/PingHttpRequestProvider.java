import http.HttpRequestProvider;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * Created by user50 on 07.06.2015.
 */
public class PingHttpRequestProvider implements HttpRequestProvider {

    private String url;
    private String host;

    public PingHttpRequestProvider(String url, String host) {
        this.url = url;
        this.host = host;
    }

    @Override
    public HttpRequestBase getRequest() {
        return new HttpGet(url);
    }

    @Override
    public HttpHost getHost() {
        return new HttpHost(host);
    }
}
