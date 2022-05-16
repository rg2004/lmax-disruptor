
import com.lmax.disruptor.EventHandler;
public interface EventConsumer {

    /**
     * One or more event handler to handle event from ring buffer.
     */
    public EventHandler<ValueEvent>[] getEventHandler();
}
