public class Test implements A,B {
    
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Test test= new Test();
        test.sum(12,22);
        A a = new Test();
        System.out.println(a.x);
        a.sum(23,43);
        B b = new Test();
        System.out.println(b.x);
        b.sum(44,44);
    }
}

interface A{
    int x=12;
    void sum(int a , int b);
}
interface B{
    int x= 12;
    void sum(int a , int b);
}