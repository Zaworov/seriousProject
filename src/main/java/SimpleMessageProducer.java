import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;

@Default
@Any
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage()  {
        return "Example message " + System.currentTimeMillis();
    }
}