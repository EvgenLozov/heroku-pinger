/**
 * Created by user50 on 07.06.2015.
 */
public class PingURI {

    private String host;
    private String url;


    public PingURI(String host, String url) {
        this.host = host;
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PingURI pingURI = (PingURI) o;

        if (!host.equals(pingURI.host)) return false;
        if (!url.equals(pingURI.url)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = host.hashCode();
        result = 31 * result + url.hashCode();
        return result;
    }
}
