
public class SmsNotification implements Notification {

    @Override
    public void send(String studentName, String foodName) {

        System.out.println("Sending SMS notification...");
        System.out.println("Heyy"  + studentName +
                ", your campus food order is confirmed.");
    }
}
