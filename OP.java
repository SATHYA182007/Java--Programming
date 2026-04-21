class Add{
    int a;
    int b;
    Add(int x, int y){
        a = x;
        b = y;
    }
    void sum(Add A1){
        int c = A1.a + A1.b;
        System.out.println("The sum is " + c);
    }
}
public class OP {
    public static void main(String[] args) {
        Add A = new Add(10, 20);
        A.sum(A);
    }
}