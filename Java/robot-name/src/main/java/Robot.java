package src.main.java;
import java.util.Random;

import java.util.ArrayList;

public class Robot {

	String name;
	Random randomGenerator;
	int numberOfLettersInName = 2;
	int numberOfNumbersInName = 3;

	public Robot() {
		randomGenerator = new Random();
		createNewName();
	}

	public String getName(){
		return name;
	}

	public void reset(){
		Data.removeRobotName(name);
		createNewName();
	}

	private void createNewName() {
		ArrayList<String> usedNames = Data.getRobotNames();
		StringBuilder stringBuilder = new StringBuilder("");

		for (int i = 0; i < numberOfLettersInName; i++){
			char newLetter = getRandomCapitalizedLetter(randomGenerator);
			stringBuilder.append(newLetter);
		}
		for (int i = 0; i < numberOfNumbersInName; i++){
			int newNumber = getRandomNumber(randomGenerator);
			stringBuilder.append(newNumber);
		}
		if(usedNames.contains(stringBuilder.toString())){
			createNewName();
		}else{
			this.name = stringBuilder.toString();
			Data.addRobotName(stringBuilder.toString());
		}
	}

	private char getRandomCapitalizedLetter(Random r){
		/*
		 *  The capital ASCII letters start at the decimal value 65 and go to 90. (See https://en.wikipedia.org/wiki/ASCII)
		 *  Therefore, here I am getting a random int from 0 -> 25 (inclusive) and adding 65 to it to move the int into the capital letter region of ASCII.
		 */
		return (char) ((r.nextInt(25))+65);
	}

	private int getRandomNumber(Random r){
		return (r.nextInt(9)); //random int between 0 -> 9 (inclusive)
	}
}
