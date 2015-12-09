package helpers.string;

import classes.Link;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import static helpers.constants.CommonConstants.*;

/**
 * this class contains all functions help us to work with "Links"
 */
public class LinkHelper {

    public static List<Link> getLinksFromString(String stringInput) throws Exception{
        List<Link> links = new ArrayList<Link>();
        List<URL> urls = parseURLsFromString(stringInput);
        for(URL url : urls){
            links.add(new Link(url));
        }
        return links;
    }

    private static List<URL> parseURLsFromString (String stringInput) throws Exception{
        List<URL> urls = new ArrayList<URL>();
        Matcher matcher = URL_PATTERN.matcher(stringInput);
        while (matcher.find()) {
            int matchStart = matcher.start(1);
            int matchEnd = matcher.end();
            urls.add(new URL(stringInput.substring(matchStart, matchEnd)));
        }
        return urls;
    }
}
