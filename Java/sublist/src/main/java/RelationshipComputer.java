import java.util.List;

public class RelationshipComputer<A> {

	public RelationshipComputer() { }

	public Relationship computeRelationship(List<A> listOne, List<A> listTwo){
		if(listOne.toString().equals(listTwo.toString())){
			return Relationship.EQUAL;
		}else{

			/*
			 * By default, list.toString() results in something like "[0, 1, 2, 3]".
			 * Once I remove the '[' and ']', I can compare the lists using the String.contains method.
			 */

			String listOneAsString = listOne.toString().replace("[", "").replace("]", "");
			String listTwoAsString = listTwo.toString().replace("[", "").replace("]", "");

			if (listOneAsString.contains(listTwoAsString)) {
				return Relationship.SUPERLIST;
			}else if (listTwoAsString.contains(listOneAsString)) {
				return Relationship.SUBLIST;
			}else{
				return Relationship.UNEQUAL;
			}
		}
	}
}
