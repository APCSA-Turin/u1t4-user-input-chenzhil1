import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a three digit integer: ");
        int number = scan.nextInt();
        scan.nextLine();
        int c = number / 100;
        int b = (number - (number / 100) * 100) / 10 * 10;
        int a = (number - ((number /100) * 100) - ((number - (number / 100) * 100) / 10 * 10)) * 100;
        System.out.println("The reverse of " + number + " is: " + (a + b + c));
    }
}
