class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numberAsString = String.valueOf(numberToCheck);
		int numberOfDigits = numberAsString.length();
		int value = 0;

		for(int i = 0; i < numberOfDigits; i++){
				int currentNumber = Integer.parseInt(Character.toString(numberAsString.charAt(i)));
				value += Math.pow(currentNumber,numberOfDigits);
    }
    return (value == numberToCheck);
	}

}
