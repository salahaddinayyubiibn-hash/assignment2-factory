interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Отправка SMS уведомления");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Отправка Email уведомления");
    }
}

class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "sms": return new SMSNotification();
            case "email": return new EmailNotification();
            default: throw new IllegalArgumentException("Неизвестный тип: " + type);
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification sms = factory.createNotification("sms");
        sms.notifyUser();

        Notification email = factory.createNotification("email");
        email.notifyUser();
    }
}
