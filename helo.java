import java.util.Scanner;

class helo{
    public static void main(String args[]){
       StringBuffer s1 = new StringBuffer("Hello");
       System.out.println(s1.capacity());
       s1.append(" World");
       System.out.println(s1);
       s1.delete(0,2);
       System.out.println(s1);
       s1.insert(0,'E');
       System.out.println(s1);
       System.out.println(s1.capacity());
       System.out.println(s1.isEmpty());

    }
}