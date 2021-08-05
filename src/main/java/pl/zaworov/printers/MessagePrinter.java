package pl.zaworov.printers;

import jakarta.inject.Inject;
import pl.zaworov.producers.MessageProducer;
import pl.zaworov.qualifiers.Message;

public class MessagePrinter {

    private MessageProducer messageProducer;

    @Inject
    public MessagePrinter(@Message(type= Message.MessageType.FILE) MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}