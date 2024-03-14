class SubstitutionCipher implements MessageEncoder{
	private int shift;
	
	public SubstitutionCipher(int amount){
		shift = amount;
	}
	
	public String encode(String plainText){
		String output;
		char[] newArray = plainText.toCharArray();
		for(int i = 0 ; i <= plainText.length()-1 ; i++){
			char a = plainText.charAt(i);
			newArray[i] = shiftChar(a);
		}
		output = String.valueOf(newArray);
		return output;
	}
	private char shiftChar(char c){
		int outcome = (int)(Character.toUpperCase(c)+shift);
		//outcome is the ascii value of the capital version of the shifted char
		char returnMe;
		if (outcome>90) {
			outcome = (outcome-65)%26+65;
		}
		
		if ((int)Character.toUpperCase(c) == (int)c){
			returnMe = (char)(outcome);
		}
		else{
			returnMe = (char)(outcome+32);
		}
		
		return returnMe;
	}
}