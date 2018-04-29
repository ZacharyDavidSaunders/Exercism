class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] chars = dnaStrand.toCharArray();
        String rna = "";
        for(int i = 0; i < chars.length; i++){
        	char nucleotide;
        	switch (chars[i]){
		        case 'G' :
			        nucleotide = 'C';
		        	break;
		        case 'C' :
			        nucleotide = 'G';
		        	break;
		        case 'T' :
			        nucleotide = 'A';
		        	break;
		        case 'A' :
			        nucleotide = 'U';
		        	break;
		        default:
		        	nucleotide = '!';
		        	break;
	        }
	        rna = rna.concat(String.valueOf(nucleotide));
        }
        return rna;
    }

}
