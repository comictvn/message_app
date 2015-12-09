package classes;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private List<Mention> mentions;
    private List<Link> links;
    private List<Emoticon> emoticons;
    private List<String> texts;

    public List<String> getTexts() {
        return texts;
    }

    public List<Link> getLinks() {
        return links;
    }

    public List<Mention> getMentions() {
        return mentions;
    }

    public List<Emoticon> getEmoticons() {
        return emoticons;
    }

    public void appendEmoticon(Emoticon emoticonToAppend){
        this.emoticons.add(emoticonToAppend);

    }

    public void appendLink(Link linkToAppend){
        this.links.add(linkToAppend);
    }

    public void appendMention(Mention mentionToAppend){
        this.mentions.add(mentionToAppend);
    }

    public void appendText(String textToAppend){
        this.texts.add(textToAppend);
    }

    public Message() {
        this.links = new ArrayList<Link>();
        this.mentions = new ArrayList<Mention>();
        this.emoticons = new ArrayList<Emoticon>();
        this.texts = new ArrayList<String>();
    }
}
