import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataDrivenMobileAppController {
    private Map<String, String> userData;
    private List<String> appScreens;

    public DataDrivenMobileAppController(Map<String, String> userData) {
        this.userData = userData;
        this.appScreens = new ArrayList<>();
    }

    public void addAppScreen(String screenName) {
        appScreens.add(screenName);
    }

    public void navigateTo(String screenName) {
        if (appScreens.contains(screenName)) {
            System.out.println("Navigating to " + screenName);
            // implement screen navigation logic here
        } else {
            System.out.println("Screen not found");
        }
    }

    public void displayUserData(String screenName) {
        if (appScreens.contains(screenName)) {
            System.out.println("User data on " + screenName + ":");
            for (Map.Entry<String, String> entry : userData.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("Screen not found");
        }
    }

    public static void main(String[] args) {
        Map<String, String> userData = new java.util.HashMap<>();
        userData.put("name", "John Doe");
        userData.put("email", "johndoe@example.com");
        userData.put("phone", "1234567890");

        DataDrivenMobileAppController controller = new DataDrivenMobileAppController(userData);

        controller.addAppScreen("Home");
        controller.addAppScreen("Profile");
        controller.addAppScreen("Settings");

        controller.navigateTo("Home");
        controller.displayUserData("Profile");
    }
}