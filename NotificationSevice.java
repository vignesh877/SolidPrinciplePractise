interface NotificationInterface{
    void sendNotification();
}

class WhatsappNotification implements NotificationInterface{  // low level module
    public void sendNotification(){
        System.out.println("Message send through Whatsapp");
    }
}

class SmsNotification implements NotificationInterface{  // low level module
    public void sendNotification(){
        System.out.println("Message send throung SMS");
    }
}
/*
* In the Dependency Inversion Principle (DIP), the high-level module
* (which contains business logic) should not depend on low-level modules
* (which contain details like WhatsApp or SMS sending logic).
* Both should depend on an abstraction (like an interface), and the
*  abstraction should not depend on the details.
*  This helps keep the system loosely coupled and easier to extend or modify.
* */

public class NotificationSevice {  // high level module
    private final NotificationInterface notificationInterface;

    NotificationSevice(NotificationInterface notificationInterface){
        this.notificationInterface = notificationInterface;
    }

    public void sendNotification(){
        notificationInterface.sendNotification();
    }
}
