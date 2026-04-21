import java.util.Scanner;
public class count {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                System.out.println(ch);
            }
        }
    }
}
