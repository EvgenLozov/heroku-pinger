import java.util.HashSet;
import java.util.Set;

/**
 * Created by user50 on 07.06.2015.
 */
public class PingURIProvider {
    private Set<PingURI> uris = new HashSet<>();

    public Set<PingURI> getUris() {
        return uris;
    }

    public void add(PingURI uri)
    {
        uris.add(uri);
    }

    public void remove(PingURI uri)
    {
        uris.remove(uri);
    }
}
