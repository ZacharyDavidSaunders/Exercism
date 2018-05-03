import java.util.HashMap;

class Scrabble {

	String word;

	Scrabble(String word) {
		this.word = word;
	}

	int getScore() {

		int score = 0;
		HashMap<Character, Integer> letterValueHashMap = new HashMap<Character, Integer>();
		letterValueHashMap.put('a',1);
		letterValueHashMap.put('e',1);
		letterValueHashMap.put('i',1);
		letterValueHashMap.put('o',1);
		letterValueHashMap.put('u',1);
		letterValueHashMap.put('l',1);
		letterValueHashMap.put('n',1);
		letterValueHashMap.put('r',1);
		letterValueHashMap.put('s',1);
		letterValueHashMap.put('t',1);

		letterValueHashMap.put('d',2);
		letterValueHashMap.put('g',2);

		letterValueHashMap.put('b',3);
		letterValueHashMap.put('c',3);
		letterValueHashMap.put('m',3);
		letterValueHashMap.put('p',3);

		letterValueHashMap.put('f',4);
		letterValueHashMap.put('h',4);
		letterValueHashMap.put('v',4);
		letterValueHashMap.put('w',4);
		letterValueHashMap.put('y',4);

		letterValueHashMap.put('k',5);

		letterValueHashMap.put('j',8);
		letterValueHashMap.put('x',8);

		letterValueHashMap.put('q',10);
		letterValueHashMap.put('z',10);


		for(char c : word.toCharArray()){
			score += letterValueHashMap.get(Character.toLowerCase(c));
		}

		return score;
	}

}
