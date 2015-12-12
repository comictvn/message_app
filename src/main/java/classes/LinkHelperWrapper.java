package classes;

import helpers.string.LinkHelper;

import java.util.List;

/**
 * Created by lazhcm10185 on 12/12/15.
 */
public class LinkHelperWrapper implements LinkHelperInterface {
    public List<Link> getLinksFromString(String stringInput) throws Exception {
        return LinkHelper.getLinksFromString(stringInput);
    }
}
