package designPattern;

public class A {
    public static void main(String[] args) {

        Singleton singleton = Singleton.showInstance();

        String message = singleton.message();
        System.out.println(message);
    }
}
