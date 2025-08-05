public class NotificationMessage {
    void sendNotification(){
        System.out.println("Hi from genric notification method");
    }
}


class WhatsAppNotification extends NotificationMessage implements  sendAttachment{
    void sendNotification(){
        System.out.println("Hi from whatsapp");
    }
}


class TextNotification extends NotificationMessage{
    void sendNotification(){
        System.out.println("Hi from Text");
    }
}

/*
 * In this case, sending notifications is the core functionality,
 * while sending attachments is an optional or extended feature.
 *
 * According to the Liskov Substitution Principle (LSP),
 * a subclass should be substitutable for its parent class
 * without changing the expected behavior of the program.
 *
 * If a subclass adds methods (like sendAttachment) that are not
 * present in the base class, then using it via the base class
 * reference may cause runtime errors or limit functionality.
 *
 * Therefore, we should separate common functionality (like sendNotification)
 * into a base class or interface, and move optional features
 * (like sendAttachment) to a separate interface, such as AttachmentCapable.
 *
 * This ensures that all subclasses of NotificationMessage can be
 * used interchangeably, maintaining LSP compliance.
 */

interface sendAttachment{
   default void sendAttachment(){
        System.out.println("Attachment were sent");
    }
}