import java.util.ArrayList;
import java.util.Arrays;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		ArrayList <Character> previouslyFoundChars = new ArrayList<Character>();
		ArrayList <Character> charsToBeIgnored = new ArrayList<Character>(Arrays.asList(' ','-'));
		for(char c : phrase.toCharArray()){
			if(!(charsToBeIgnored.contains(c))){
				if(previouslyFoundChars.contains(c)){
					return false;
				}else{
					previouslyFoundChars.add(Character.toLowerCase(c));
				}
			}
		}
		return true;
	}
}