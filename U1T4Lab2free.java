import java.util.Scanner;
public class U1T4Lab2free {
    public static void main(String args[] ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hello, this is a rectangle parameter and are calculator");
        System.out.print("Please enter the length: ");
        double length = scan.nextDouble();
        scan.nextLine();
        System.out.print("Please enter the width: ");
        double width = scan.nextDouble();
        scan.nextLine();
        double parameter = (length + width) * 2;
        double area = length * width; 
        System.out.println("The parameter of the rectangle is: " + parameter);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("How do you wan to modify the rectangle?");
        System.out.println("1. Increase length");
        System.out.println("2. Decrease length");
        System.out.println("3. Increase width");
        System.out.println("4. Decrease width");
        System.out.println("5. Scale the rectangle");
        System.out.println("6. Cut your the rectangle in half");
        System.out.println("7. Gradually increase width and length");
        System.out.println("8. Gradually decrease width and length");
        int choice = scan.nextInt();
        scan.nextLine();
        if (choice == 1) {
            System.out.print("Enter the amount of length you want to increase by: ");
            length += scan.nextDouble();
            scan.nextLine();
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new length is: " + length);
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if (choice == 2) {
            System.out.print("Enter the amount of length you want to decrease by: ");
            length -= scan.nextDouble();
            scan.nextLine();
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new length is: " + length);
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if (choice == 3){ 
            System.out.print("Enter the amount of width you want to increase by: ");
            width += scan.nextDouble();
            scan.nextLine();
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new width is: " + length);
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if (choice == 4) {
            System.out.print("Enter the amount of width you want to decrease by: ");
            width -= scan.nextDouble();
            scan.nextLine();
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new width is: " + length);
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if(choice ==5) {
            System.out.print("Enter the scale of the new rectangle: ");
            double scale = scan.nextDouble();
            if ((scale % 0.5) > 0){
                double newscale = scale;
                newscale %= 0.5;
                scale = scale - newscale;
                System.out.println("We've adjusted to provide a better scaling experience, the new scale is: " + scale); 
            }
            length *= scale;
            width *= scale;
            scan.nextLine();
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new width is: " + length);
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if (choice ==6) {
            parameter /= 2;
            area /= 2;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if (choice ==7) {
            length ++;
            width ++;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
            length ++;
            width ++;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
            length ++;
            width ++;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
            length ++;
            width ++;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
        else if (choice == 8) {
            length --; 
            width --;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
            length --; 
            width --;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
            length --; 
            width --;
            parameter = (length + width) * 2;
            area = length * width;
            System.out.println("Your new parameter is: " + parameter);
            System.out.println("Your new area is: " + area);
        }
                



    }
}
