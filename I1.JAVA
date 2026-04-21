import java.util.Scanner;
class I1{
    void emp1(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Emp name: " + name);
    }
}
class I2 extends I1{
    void emp2(){
        Scanner scan = new Scanner(System.in);
        String des = scan.nextLine();
        System.out.println("Emp designation: " + des);
    }
}
class I3 extends I2{
    void emp3(){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        System.out.println("Emp salary: " + salary);
    }
}
class out(){
    public static void main(String[] args) {
        I3 i = new I3();
        i.emp1();
        i.emp2();
        i.emp3();
    }
}