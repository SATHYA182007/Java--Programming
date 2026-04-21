class Studentdetails{
    String name;
    int roll;
    Studentdetails(String x, int y){
        name=x;
        roll=y;
    }
    void display(){
         System.out.println("Students name:" +name);
         System.out.println("Roll no:" +roll);
         System.out.println("x---------x---------x");
    }
    public static void main(String[] args) {
        Studentdetails a = new Studentdetails( "sathya" ,12);
        Studentdetails b = new Studentdetails("Shriram", 25);
        Studentdetails c = new Studentdetails("Vishva", 30);
        Studentdetails d = new Studentdetails("kai", 34);
        a.display();
        b.display();
        c.display();
        d.display();
    }
}
