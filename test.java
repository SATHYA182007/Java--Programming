import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = (a > b && a > c) ? "a is greater" : (b > a && b > c) ? "b is greater" : "c is greater";
        System.out.println(result);
    }
}