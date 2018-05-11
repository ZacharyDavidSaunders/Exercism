class CollatzCalculator {

	int computeStepCount(int start) throws IllegalArgumentException {
		if(start <= 0){
			throw new IllegalArgumentException("Only natural numbers are allowed");
		}else{
			int steps = 0;
			while (start != 1) {
				if (start % 2 != 0) { // is odd
					steps++;
					start = (start * 3) + 1;
				}
				steps++;
				start = start / 2;
			}
			return steps;
		}
	}
}
