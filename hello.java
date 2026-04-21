import java.util.Scanner;
public class hello {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = scan.nextInt();
        if ((year%4==0 || year%400==0) && (year%100!=0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
