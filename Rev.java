import java.util.Scanner;

public class Rev {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        int result = sum(a, b);
        System.out.println("Sum: " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}