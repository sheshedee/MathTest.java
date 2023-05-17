import java.util.Scanner;
public class MathTest {
//    public static void main(String[] args) {
//        System.out.println("Enter the Two numbers: ");
//        Scanner readInput = new Scanner(System.in);
//        int a = readInput.nextInt();
//        int b = readInput.nextInt();
//        readInput.close();
//        System.out.println("The sum of a and b is = " + sum(a, b));
//        System.out.println("The takeAway of a and b is = " + takeAway(a, b));
//        System.out.println("The divide of a and b is = " + divide(a, b));
//        System.out.println("The multiply of a and b is = " + multiply(a, b));
//        System.out.println("The modulus of a and b is = " + modulus(a, b));
//
    public MathTest() {
    }
    public int sum(int a, int b) {
        return a + b;
    }
    public int takeAway(int a, int b) {
        return a - b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
}