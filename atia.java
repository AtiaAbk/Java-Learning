
class Net {
    void ping() {
        System.out.println("Extending the net...");
    }
}

public class atia extends Net {

    public static void main(String[] args) {
        atia app = new atia();
        app.ping();
    }
}
