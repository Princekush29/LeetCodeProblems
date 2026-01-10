package programs.Basics;

public class ConfigManager {

    // 1️ Static member to hold the single instance
    private static ConfigManager instance;

    // 2️ Private constructor to prevent external instantiation
    private ConfigManager() {
        // Initialize configuration settings here
        System.out.println("ConfigManager initialized");
    }

    // 3️ Static factory method to return the singleton instance
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager(); // Lazy initialization
        }
        return instance;
    }

    // Example method to demonstrate usage
    public void loadConfig() {
        System.out.println("Loading configuration...");
    }
}
