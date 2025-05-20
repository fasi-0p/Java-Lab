//LAB 10
class A{
    int a=10;
    public int b=20;
    private int d=40;
    protected int c=30;
}
class B extends A{
    public void display(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    //System.out.println(d);
}}
class C{
    public void display(){
    //System.out.println(a);
    System.out.println(b);
    //System.out.println(c);
    //System.out.println(d);
}}
class Main {
    public static void main(String[] args) {
        //A obj1= new A;
        B obj2=new B();
        C obj3=new C();
        obj2.display();
        obj3.display();
    }
}
