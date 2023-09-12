import factory.GUIFactory;
import factory.MacOSFactory;
import factory.WindowsFactory;

public class Main {
    private static Application configureApplication(){
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        return new Application(factory);
    }
    public static void main(String[] args) {
            Application app = configureApplication();
            app.paint();
    }
}