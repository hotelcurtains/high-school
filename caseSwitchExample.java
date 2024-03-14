import java.util.Scanner;
class Main {
public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter a number.");
    int g=keyboard.nextInt();
    switch (g) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Too low.");
            break;
        case 6:
        case 8:
            System.out.println("Close!");
            break;
        case 9:
        case 10:
            System.out.println("Too high.");
            break;
        case 7:
            System.out.println("Lucky seven, you got it!");
            break;
        default:
            System.out.println("Number out of range!");
            break;
    }
 }
}
