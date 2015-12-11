package helpers.constants;

import java.util.regex.Pattern;

public class CommonConstants {

    public static final Pattern URL_PATTERN = Pattern.compile(
            "(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)"
                    + "(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*"
                    + "[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)",
            Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);

    public static final String MENTION_PATTERN = "@(\\S+)";

    public static final Pattern EMOTICON_PATTERN = Pattern.compile(
		"\\((" + 
		String.join("|", new String[] {
			"allthethings", "android", "areyoukiddingme", "arrington", 
			"arya", "ashton", "atlassian", "awesome", "awthanks", "aww", 
			"awwyiss", "awyeah", "badass", "badjokeeel", "badpokerface", 
			"badtime", "bamboo", "basket", "beer", "bicepleft", "bicepright", 
			"bitbucket", "boom", "borat", "branch", "bumble", "bunny", "cadbury", 
			"cake", "candycorn", "carl", "caruso", "catchemall", "ceilingcat", 
			"celeryman", "cereal", "cerealspit", "challengeaccepted", "chef", 
			"chewie", "chocobunny", "chompy", "chucknorris", "clarence", "coffee", 
			"confluence", "content", "continue", "cookie", "cornelius", "corpsethumb", 
			"crucible", "daenerys", "dance", "dealwithit", "derp", "disappear", 
			"disapproval", "doge", "doh", "donotwant", "dosequis", "downvote", 
			"drevil", "drool", "ducreux", "dumb", "dwaboutit", "evilburns", "excellent", 
			"facepalm", "failed", "feelsbadman", "feelsgoodman", "finn", "fireworks", 
			"fisheye", "fonzie", "foreveralone", "forscale", "freddie", "fry", "ftfy", 
			"fu", "fuckyeah", "fwp", "gangnamstyle", "gates", "ghost", "giggity", 
			"goldstar", "goodnews", "greenbeer", "grumpycat", "gtfo", "haha", "haveaseat", 
			"heart", "heygirl", "hipchat", "hipster", "hodor", "huehue", "hugefan", "huh", 
			"ilied", "indeed", "iseewhatyoudidthere", "itsatrap", "jackie", "jaime", "jake", 
			"jira", "jobs", "joffrey", "jonsnow", "kennypowers", "krang", "kwanzaa", "lincoln", 
			"lol", "lolwut", "megusta", "meh", "menorah", "mindblown", "motherofgod", "ned", 
			"nextgendev", "nice", "ninja", "noidea", "notbad", "nothingtodohere", "notit", 
			"notsureif", "notsureifgusta", "obama", "ohcrap", "ohgodwhy", "ohmy", "okay", 
			"omg", "orly", "paddlin", "pbr", "philosoraptor", "pingpong", "pirate", "pokerface", 
			"poo", "present", "pride", "pumpkin", "rageguy", "rainicorn", "rebeccablack", 
			"reddit", "rockon", "romney", "rudolph", "sadpanda", "sadtroll", "salute", "samuel", 
			"santa", "sap", "scumbag", "seomoz", "shamrock", "shrug", "skyrim", "sourcetree", 
			"standup", "stare", "stash", "success", "successful", "sweetjesus", "tableflip", 
			"taco", "taft", "tea", "thatthing", "theyregreat", "toodamnhigh", "tree", "troll", 
			"truestory", "trump", "turkey", "twss", "tyrion", "tywin", "unacceptable", "unknown", 
			"upvote", "vote", "waiting", "washington", "wat", "whoa", "whynotboth", "wtf", "yey", 
			"yodawg", "youdontsay", "yougotitdude", "yuno", "zoidberg" 
		}) +
		")\\)");
}
