import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Default;

@Default
@Any
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}