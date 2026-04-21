class A{
    int a;
    int b;
    A(int i, int j)
    {
        a = i;
        b = j;
    }
    A inc()
    {
        A r1 = new A(a+2 , b+3);
        return r1;
    }
}
public class op1 {
    public static void main(String[] args){
        A a1 = new A(2,3);
        A a2 ;
        a2 = a1.inc();
        System.out.println(a1.a + a1.b);
        System.out.println(a2.a + a2.b);
    }
}