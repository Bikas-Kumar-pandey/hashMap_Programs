package designPattern;
//we will create only one object for particular class LIKE @Autowired

// here we create private static object
//initie private for constructor
//create static class which returns object of singleton class
//create method to use whithout creating object



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
