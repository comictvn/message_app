package helpers.string;

import classes.Mention;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static helpers.constants.CommonConstants.*;

/**
 * this class contains all functions help us to work with "Mentions"
 */
public class MentionHelper {

    public static List<Mention> getMentionsFromString(String stringInput) {
        return parseMentions(stringInput);
    }

    private static List<Mention> parseMentions(String stringInput) {
        List<Mention> mentions = new ArrayList<Mention>();
        Pattern pattern = Pattern.compile(MENTION_PATTERN);
        Matcher matcher = pattern.matcher(stringInput);
        while (matcher.find()) {
            int matchStart = matcher.start(1);
            int matchEnd = matcher.end();
            mentions.add(new Mention(stringInput.substring(matchStart, matchEnd)));
        }
        return mentions;
    }
}
