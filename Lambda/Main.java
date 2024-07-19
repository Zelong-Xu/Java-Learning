package Lambda;

public class Main {
    public static void main(String[] args) {
        sendMassage((name, title) -> {
            System.out.println("This is a message for " + title + "" + name);
            return "Message sent successfully";
        });
    }
    
    static void sendMassage(Message message) {
        message.send("Zelong", "Mr.");
    }
}
