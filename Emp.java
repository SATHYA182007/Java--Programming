public class Emp {
    String name;
    String des;
    int salary;
    Emp(String x, String y, int z){
        name=x;
        des=y;
        salary=z;
    }
    void display(){
        System.out.println("Employee name:" +name);
        System.out.println("Employee designation:" +des);
        System.out.println("Employee salary:" +salary);
        System.out.println("***********************");
    }
    public static void main(String[] args) {
        Emp e1 = new Emp("Sathya", "CEO", 500000);
        Emp e2 = new Emp("Devil", "Developer", 400000);
        e1.display();
        e2.display();
    }
}