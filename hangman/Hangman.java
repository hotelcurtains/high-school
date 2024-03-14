class Hangman {
	private static final String WORD = "antidisestablishmentarianism";
	private static final char[] WORD_CHARS = WORD.toCharArray();
	
	private String disguisedWord = "????????????????????????????";
	private char[] disguisedWordChars = disguisedWord.toCharArray();
	
	private int guessCount = 0;
	private int fails = 0;

	/**
		precondition: letter is any char
		postcondition: increments guessCount, then:
			fills in disguisedWordChars with letters based on WORD
			or announces that the letter was already guessed if is already present in disguisedWord,
			or increments fails if letter is not in WORD.
	*/
	public void makeGuess(char letter){
		guessCount++;
		if (WORD.indexOf(letter) != -1 && disguisedWord.indexOf(letter) == -1){ //indexOf() will return -1 if the argument is not in the array
			int j = 0;	//slapdash solution to also have for loop functionality in a for-each loop
			for (char i : WORD_CHARS) {
				if (i == letter){
					disguisedWordChars[j] = letter;
					disguisedWord = String.valueOf(disguisedWordChars);	//ensures disguisedWord and disguisedWordChars have the same content
				}
				j++;	//part of for loop functionality
			}
		}
		else if (disguisedWord.indexOf(letter) != -1){
			System.out.println("You already guessed "+Character.toUpperCase(letter)+".");
		}
		else {
			System.out.println(letter+" is not in the word. "+(6-fails)+" fails left.");
			fails++;
		}
	}

	/**	postcondition: returns current state of the disguisedWord as a String */
	public String getDisguisedWord(){
		return disguisedWord;
	}
	/**	postcondition: returns String secretWord */
	public String getSecretWord(){
		return WORD;
	}
	/**	postcondition: returns int guessCount */
	public int getGuessCount(){
		return guessCount;
	}
	/**	postcondition: returns int fails */
	public int getFails(){
		return fails;
	}
	/**	postcondition: returns true if the disguisedWord == WORD, otherwise returns false */
	public boolean isFound(){
		if (disguisedWord.equals(WORD))
			return true;
		else
			return false;
	}
	
	
}