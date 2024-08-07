package src;

class A{
    public void show(){
        System.out.println("Show");
    }
}


public class FinalDemo extends A {
    public void show(){
        System.out.println("Hide");
    }
    public static void main(String[] args) {
        A a = new FinalDemo();
        a.show();
    }
}
