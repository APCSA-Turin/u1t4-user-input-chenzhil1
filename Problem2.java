import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player 1, enter your name: ");
        String name = scan.nextLine();
        System.out.print("Player 1, enter your number: ");
        double a = scan.nextDouble();
        scan.nextLine();
        System.out.print("Player 2, enter your name: ");
        String name2 = scan.nextLine();
        System.out.print("Player 2, enter your number: ");
        double b = scan.nextDouble();
        scan.nextLine();
        if(a > b) {
            System.out.println(name + " is bigger!");
        }
        else if(a < b) {
            System.out.println(name2 + " is bigger!");
        }
        else {
            System.out.println("The numbers are equal.");
        }
    }
}
