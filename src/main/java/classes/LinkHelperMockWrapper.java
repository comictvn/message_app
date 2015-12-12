package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lazhcm10185 on 12/12/15.
 */
public class LinkHelperMockWrapper implements LinkHelperInterface {
    public List<Link> getLinksFromString(String stringInput) throws Exception {
        return new ArrayList<Link>();
    }
}
