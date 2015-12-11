package helpers.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import classes.Emoticon;
import helpers.constants.CommonConstants;

/**
 * this class contains all functions help us to work with "Emoticons"
 */
public class EmoticonHelper {

	public static List<Emoticon> getEmoticonsFromString(String stringInput) {
		List<Emoticon> emoticons = new ArrayList<Emoticon>();
		Matcher matcher = CommonConstants.EMOTICON_PATTERN.matcher(stringInput);
		while (matcher.find()) {
			int matchStart = matcher.start(1);
			int matchEnd = matcher.end() - 1;
			emoticons.add(new Emoticon(stringInput.substring(matchStart, matchEnd)));
		}
		return emoticons;
	}
}
