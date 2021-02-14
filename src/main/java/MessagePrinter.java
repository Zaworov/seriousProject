import javax.enterprise.inject.Any;
import javax.inject.Inject;

public class MessagePrinter {

    @Inject
    private MessageProducer messageProducer;

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}