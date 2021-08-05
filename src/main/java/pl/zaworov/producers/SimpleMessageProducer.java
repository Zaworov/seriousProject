package pl.zaworov.producers;

import pl.zaworov.qualifiers.Message;

@Message
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}