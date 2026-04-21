import java.util.Scanner;
public class hello1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter character:");
        char ch = scan.nextLine().charAt(0);
        
        if(ch>='a' && ch<='z'){
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                System.out.println(ch +" is a vowel");
            }
            else{
                System.out.println(ch +" is a consonant");
            }
        }
    }
}