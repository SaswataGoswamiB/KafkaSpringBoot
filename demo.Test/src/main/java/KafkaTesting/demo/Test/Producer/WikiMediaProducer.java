package KafkaTesting.demo.Test.Producer;

import KafkaTesting.demo.Test.Model.WikimediaEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WikiMediaProducer {

    private KafkaTemplate<String, List<WikimediaEvent>> kafkaTemplate;

    public WikiMediaProducer(KafkaTemplate<String, List<WikimediaEvent>> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void Sendmessagee(){

        String topic = "topic_2";
        final Message<String> build = MessageBuilder.withPayload(message).
                setHeader(KafkaHeaders.TOPIC, topic).build();

        kafkaTemplate.send(build);

    }
}
