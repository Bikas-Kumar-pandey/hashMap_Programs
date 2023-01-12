package designPattern;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }
    public  String message(){
        return "hello world";
    }
public static Singleton showInstance(){
    return singleton;
}
}
