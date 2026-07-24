class SingletonExa {
    private static SingletonExa instance;

    private SingletonExa() {
        System.out.println("Singleton object created");
    }

    public static SingletonExa getInstance() {
        if (instance == null) {
            instance = new SingletonExa();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonExa s1 = SingletonExa.getInstance();
        SingletonExa s2 = SingletonExa.getInstance();

        System.out.println(s1 == s2);
    }
}
