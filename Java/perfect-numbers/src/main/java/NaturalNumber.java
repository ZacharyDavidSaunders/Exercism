class NaturalNumber {

	int number;
	Classification classification;

	public NaturalNumber(int number) throws IllegalArgumentException{
		if(number <= 0){
			throw new IllegalArgumentException("You must supply a natural number (positive integer)");
		}
		this.number = number;
	}

	public Classification getClassification(){
		int sum = 0;
		for(int i = 1; i < number; i++){ //starts at 1 because we know that 0 cannot be a factor (dividing by 0 is illegal)
			if(number % i == 0 && number != i){
				sum+=i;
			}
		}

		if(sum == number){
			classification = Classification.PERFECT;
		}else if(sum > number){
			classification = Classification.ABUNDANT;
		}else{
			classification = Classification.DEFICIENT;
		}
		return classification;
	}
}
