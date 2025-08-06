public class Main {
    public static void main(String[] args) {
        NotificationSevice notificationSevice = new NotificationSevice(new WhatsappNotification());
        notificationSevice.sendNotification();
    }
}