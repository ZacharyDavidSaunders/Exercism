class Hamming {

	String leftStrand, rightStrand;

	Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException{

		if(leftStrand.length() != rightStrand.length()){
			IllegalArgumentException e = new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
			throw e;
		}

		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	int getHammingDistance(){

		int hammingDistance = 0;
		for(int i =0; i < leftStrand.length(); i++){
			if(!(leftStrand.charAt(i) == rightStrand.charAt(i))){
				hammingDistance++;
			}
		}
		return hammingDistance;
	}

}
