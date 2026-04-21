class A{
    final int a = 10;
    String s;
    float fee;
    A(String s, float fee){
        this.s = s;
        this.fee = fee;
    }
    void display(){
        System.out.println(a+" "+s+" "+fee);
    }
}
class test{
    public static void main(String[] args) {
        A a = new A("java", 5000.0f);
        a.display();
    }
}