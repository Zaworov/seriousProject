package pl.zaworov.model;

import jakarta.inject.Inject;
import pl.zaworov.qualifiers.Message;
import pl.zaworov.qualifiers.Message.MessageType;

public class MessagePrinter {

    @Inject @Message(type = MessageType.FILE)
    private MessageProducer messageProducer;

//    @Inject
//    public MessagePrinter(@Message(type= MessageType.FILE) MessageProducer messageProducer) {
//        this.messageProducer = messageProducer;
//    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}