package classes;

import helpers.string.TitleExtractor;

import java.net.URL;

public class Link {

    private URL url;
    private String title;

    public Link(URL url) throws Exception{
        this.url = url;
        this.title = TitleExtractor.getPageTitle(url.toString());
    }

}
