import java.util.HashMap;

public class PangramChecker {

	public boolean isPangram(String input) {
		char[] validCharacters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		HashMap<Character, Boolean> charactersHashMap = new HashMap<Character, Boolean>();

		for(char c : validCharacters){
			charactersHashMap.put(c,false);
		}

		for(char c: input.toCharArray()){
			char currentChar = Character.toLowerCase(c);
			if(charactersHashMap.containsKey(currentChar)){
				charactersHashMap.replace(currentChar, true);
			}
		}
		
		return !(charactersHashMap.containsValue(false));
	}
}
