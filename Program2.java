class A{
    int a,b;
    A(int x, int y){
        a=x;
        b=y;
    }
    void display(){
         System.out.print(a+" "+b);
    }
    public static void main(String[] args) {
        A a = new A(10,12);
        a.display();
    }
}
