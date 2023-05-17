import java.util.Scanner;
public class Maths {

    public static void main(String[] args) {
        MathTest maths = new MathTest();
        System.out.println("Enter the Two numbers to add: ");
        Scanner readInput = new Scanner(System.in);
        int a = readInput.nextInt();
        int b = readInput.nextInt();
        System.out.println("The sum of a and b is = " + maths.sum(a, b));
        System.out.println("Enter the Two numbers to subtract: ");
        a = readInput.nextInt();
        b = readInput.nextInt();
        System.out.println("The takeAway of a and b is = " + maths.takeAway(a, b));
        System.out.println("Enter the Two numbers to divide: ");
        a = readInput.nextInt();
        b = readInput.nextInt();
        System.out.println("The divide of a and b is = " + maths.divide(a, b));
        System.out.println("Enter the Two numbers to multiply: ");
        a = readInput.nextInt();
        b = readInput.nextInt();
        System.out.println("The multiply of a and b is = " + maths.multiply(a, b));
        System.out.println("Enter the Two numbers to get modulus: ");
        a = readInput.nextInt();
        b = readInput.nextInt();
        System.out.println("The modulus of a and b is = " + maths.modulus(a, b));
        readInput.close();
    }
}
