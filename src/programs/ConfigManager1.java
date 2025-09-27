package programs;

public class ConfigManager1 {
	public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        config.loadConfig();
    }
}