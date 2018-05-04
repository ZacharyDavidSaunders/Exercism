import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Acronym {

	String phrase;

	Acronym(String phrase) {
		this.phrase = phrase;
	}

	String get() {
		String acronym = "";
		Pattern regex = Pattern.compile("\\b[a-zA-Z]"); //(M)atches (t)he (f)irst (l)etter (o)f (w)ords. (E)ven (h)yphenated-(w)ords.
		Matcher matcher = regex.matcher(phrase);
		while (matcher.find()){
			acronym+=matcher.group();
		}
		return acronym.toUpperCase();
	}

}
