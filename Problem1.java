import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome, " + name);
        System.out.print("Please enter the first integer: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("Please enter the second integer: ");
        int b = scan.nextInt();
        scan.nextLine();
        System.out.print("Please enter the third integer: ");
        int c = scan.nextInt();
        scan.nextLine();
        double intAverage = Math.round(((a * 1.00 + b + c) / 3) * 100) / 100.0;
        System.out.println("The average of " + a + ", " + b + ", and " + c + " is " + intAverage);
        }
}