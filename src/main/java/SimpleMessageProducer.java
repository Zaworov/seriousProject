import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Default;

@Message
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}