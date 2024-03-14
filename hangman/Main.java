import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char input;
		Hangman game = new Hangman();
		
		//gameplay loop
		do {
			System.out.println(game.getDisguisedWord());					//display diguised word
			System.out.print("Guess a letter: ");									//print prompt
			input = keyboard.next().toLowerCase().charAt(0);			//set input to user input
			game.makeGuess(input);																//makes guess with input
			System.out.println();																	//prints blank line for readability
		} while (!game.isFound() && game.getFails()<=6);

		//postgame interview with George Boole
		if (game.isFound()){																		//checking for win
			System.out.println(game.getDisguisedWord());
			System.out.println("Congratulation! You're winner with "+game.getGuessCount()+" tries and "+game.getFails()+" fail(s).");
		}
		else if (game.getFails()>=6){														//checking for loss
			System.out.println("Sorry! You're loser.");
		}
  }
}