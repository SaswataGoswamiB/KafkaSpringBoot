package KafkaTesting.demo.Test.Service;

import org.springframework.kafka.core.KafkaTemplate;

public class WikiMediaProducer {

    private KafkaTemplate<String,String> kafkaTemplate;

    public WikiMediaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void Sendmessagee(){

        String topic = "topic_2";


    }
}
