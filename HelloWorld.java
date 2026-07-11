public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, VS Code!");
        System.out.println("Java is working correctly.");

        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Operating System: " + System.getProperty("os.name"));

        int a = 15;
        int b = 25;

        System.out.println("15 + 25 = " + (a + b));
    }
}