public class First_Java{

    public static void main(String[] args) {
        greet("Chris", 39, "Panama City Beach");
        name("Chris");
        age(39);
        home("Panama City Beach");
    }

    public static void greet(String name, int age, String home) {
        System.out.printf("Hello, My name is %s I am %s years old. I am from %s!", name, age, home);
    }
    public static void name(String name) {
        System.out.println("Hello, my name is " + name);
    }
    public static void age(int age) {
        System.out.println("I am " + age + "years old");
    }
    public static void home(String home) {
        System.out.println("I am from " + home);
    }
}