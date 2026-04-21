class test{
    void m1(int a, float b){
        int a1 = 5;
        int b1 = 10;
        int c = a1 + b1;
        System.out.println(c);
    }
    void m1(float a, int b){
        float a1 = 5.5f;
        float b1 = 10.5f;
        float c = a1 + b1;
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        test t = new test();
        t.m1(1, 1.5f);
        t.m1(1.5f, 1);
    }
}