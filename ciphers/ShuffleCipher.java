class ShuffleCipher implements MessageEncoder{
	private int n = 0;
	public ShuffleCipher(int amount){
		n = amount;
	}
	public String encode(String plainText){
		for (int i = 0 ; i < n ; i++){
			plainText = shuffle(plainText);
		}
		return plainText;
	}
	private String shuffle(String input){
		int inputHalf = input.length()/2;
		String first = input.substring(0,inputHalf);
		String second = input.substring(inputHalf);
		String output = "";
		for (int i = 0; i < first.length() || i < second.length(); i++) {
	    if (i < first.length()) {
	    	output += first.charAt(i);
	    }
			if (i < second.length()) {
					output += second.charAt(i);
			}
    }
    if (input.length() % 2 == 1) {
        output += input.charAt(input.length() - 1);
    }
		return output;
	}
}