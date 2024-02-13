package threads;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Initialization code, if any
    }

    // Public static method to get the instance of the singleton class
    public static Singleton getInstance() {
        // Check if the instance is null, create a new instance if it is
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and variables can be added here
}
