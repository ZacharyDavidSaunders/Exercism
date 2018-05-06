import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class ProteinTranslator {

	HashMap<String, String> map;
	String stopSequence = "STOP";

	List<String> translate(String rnaSequence) {
		List<String> translation = new ArrayList<String>();
		populateMap();

		for(int i=0; i < rnaSequence.length(); i+=3){
			if(rnaSequence.length() >= i+3){ //This accounts for cases where (rnaSequence.length() % 3 != 0);
				String substring = rnaSequence.substring(i,i+3);
				if(map.get(substring).equals(stopSequence)){
					break;
				}else{
					translation.add(map.get(substring));
				}
			}
		}
		return translation;
	}

	private void populateMap(){
		map = new HashMap<String, String>();
		map.put("AUG","Methionine");

		map.put("UUU","Phenylalanine");
		map.put("UUC","Phenylalanine");

		map.put("UUA","Leucine");
		map.put("UUG","Leucine");

		map.put("UCU","Serine");
		map.put("UCC","Serine");
		map.put("UCA","Serine");
		map.put("UCG","Serine");

		map.put("UAU","Tyrosine");
		map.put("UAC","Tyrosine");

		map.put("UGU","Cysteine");
		map.put("UGC","Cysteine");

		map.put("UGG","Tryptophan");

		map.put("UAA",stopSequence);
		map.put("UGA",stopSequence);
		map.put("UAG",stopSequence);
	}
}