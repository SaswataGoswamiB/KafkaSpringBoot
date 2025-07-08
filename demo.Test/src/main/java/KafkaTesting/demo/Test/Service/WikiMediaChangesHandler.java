package KafkaTesting.demo.Test.Service;


import KafkaTesting.demo.Test.Producer.WikiMediaProducer;
import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class WikiMediaChangesHandler implements EventHandler {

    @Autowired
    WikiMediaProducer wikiMediaProducer;

    @Override
    public void onOpen() throws Exception {

    }

    @Override
    public void onClosed() throws Exception {

    }

    @Override
    public void onMessage(String s, MessageEvent messageEvent) throws Exception {
        wikiMediaProducer.Sendmessagee(messageEvent.getData());
    }

    @Override
    public void onComment(String s) throws Exception {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
