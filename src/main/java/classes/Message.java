package classes;

import helpers.string.EmoticonHelper;
import helpers.string.LinkHelper;
import helpers.string.MentionHelper;
import helpers.string.TextHelper;

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

    }

    public Message(String stringInput, LinkHelperInterface linkHelperInterface) throws Exception{
        this.links = linkHelperInterface.getLinksFromString(stringInput);
        this.mentions = MentionHelper.getMentionsFromString(stringInput);
        this.emoticons = EmoticonHelper.getEmoticonsFromString(stringInput);
        this.texts = TextHelper.getTextsFromString(stringInput);
    }

    public List<Link> parseInput(String input, LinkHelperInterface linkHelperInterface) throws Exception {
        return linkHelperInterface.getLinksFromString(input);
    }

    public void testParseInput() {
        Message message = new Message();
        LinkHelperInterface mockObject = new LinkHelperMockWrapper();
        String input = "test data";
        assertEquals(checkParseInput, message.parseInput(input, mockObject));
    }
}
