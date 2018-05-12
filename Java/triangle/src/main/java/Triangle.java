class Triangle {

	double side1, side2, side3;

	Triangle(double side1, double side2, double side3) throws TriangleException {
		if(side1 <= 0 || side2 <= 0 || side3 <= 0 ||  //Are any of the sides < 0?
				(side1 + side2 < side3) || (side3 + side2 < side1) || (side3+side1 < side2)){ //Is it not a triangle due to the "Triangle Inequality"?
			throw new TriangleException();
		}else{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	}

	boolean isEquilateral() {
		return (side1 == side2 && side3 == side2);
		//We don't need to check for the 3rd side due to the mathematic "Transitive Property of Equality"
	}

	boolean isIsosceles() {
		if(side1 == side2 || side2 == side3 || side1 == side3){
			return true;
		}
		return false;
	}

	boolean isScalene() {
		return (side1 != side2 && side1 != side3 && side2 != side3);
	}

}
