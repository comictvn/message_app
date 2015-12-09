package classes;

import java.net.URL;

public class Link {

    private URL url;
    private String title;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Link() {
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Link(URL url, String title) {
        this.url = url;
        this.title = title;
    }
}
