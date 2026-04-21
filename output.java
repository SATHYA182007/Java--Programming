import java.util.Scanner;
public class output {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 1;
        for (int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            char next = str.charAt(i+1);
            if(ch == next){
                count++;
            }
        }
        System.out.println(str.charAt(str.length()-1));
    }    
}