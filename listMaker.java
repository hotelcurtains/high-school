import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main (String[] args){
		Scanner kbd = new Scanner(System.in);
		ArrayList<String> shoppingList = new ArrayList<String>();
		String item,option;

		do {
			System.out.println("Enter a command: \nadd, remove, show, quit:");
			option = kbd.nextLine();
			if (option.equals("add")) {
				System.out.println("Add what item?");
				item=kbd.nextLine();
				shoppingList.add(item); 
			}
			else if (option.equals("remove")) {
				System.out.println("Remove what item?");
				item=kbd.nextLine();
				shoppingList.remove(item); 
			}
			else if (option.equals("show")) {
				for(String listItem : shoppingList)
					System.out.println(listItem); 
			}
			else if (!option.equals("quit")) System.out.println("Not a valid command.");
		} while (!option.equals("quit"));
		System.out.println("Remember: show smart, shop S-Mart!");
	}
}