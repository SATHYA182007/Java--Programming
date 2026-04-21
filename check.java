import java.util.Scanner;
class check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a%2){
            case 0 :
                System.out.println("Even");
                break;
            case 1 :
                System.out.println("Odd");
                break;
        }
    }
}