class A{
    void m(){
        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println(c);
    }

    void m(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}
class M extends A {
    void m(){
        int a = 60;
        int b = 30;
        int c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        A a = new A();
        a.m();
        a.m(20, 30);

        A a1 = new M();
        a1.m();
    }
}