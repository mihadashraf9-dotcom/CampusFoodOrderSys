
public class CampusFoodOrderService {

    public void placeOrder(String studentName,
                           String foodName,
                           String notificationType) {

        AppConfig config = AppConfig.getInstance();

        System.out.println("--------------------------------");
        System.out.println("University: " + config.getUniversityName());
        System.out.println("Order created for: " + studentName);
        System.out.println("Food: " + foodName);
        System.out.println("Delivery fee: " +
                config.getDeliveryFee() + " TL");
        System.out.println("System version: " +
                config.getSystemVersion());

        Notification notification =
                NotificationFactory.createNotification(notificationType);

        if (notification != null) {
            notification.send(studentName, foodName);
        } else {
            System.out.println("Unknown notification type.");
        }
    }

    public static void main(String[] args) {

        CampusFoodOrderService service =
                new CampusFoodOrderService();

        service.placeOrder(
                "mihad",
                "Chicken Sandwich",
                "EMAIL"
        );

        service.placeOrder(
                "malayka",
                "Pizza",
                "SMS"
        );

        service.placeOrder(
                "bashira",
                "Coffee",
                "PUSH"
        );
    }
}