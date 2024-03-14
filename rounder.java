import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What number are you rounding? ");
		double input = keyboard.nextDouble();
		
		System.out.println("To what place? ");
		int places = keyboard.nextInt();

		System.out.println(rounder(input, places));

		
  }

	public static double rounder(double number, int places){
		double output = number;
		for (int i = 0; i < places; i++) {
			output *= 10.0;
		}
		output = (int)(output+0.5);
		for (int i = 0; i < places; i++) {
			output /= 10.0;
		}
		return output;
	}
}