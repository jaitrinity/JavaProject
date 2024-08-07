package src;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

//    public void show(){
//        System.out.println("show");
//    }

//    public static void main(String[] args) {
//        Singleton s = getInstance();
//        s.show();
//    }

}
