package category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryProducerServiceImpl implements CategoryProducerService {

  @Autowired private KafkaTemplate<String, String> kafkaTemplate;

  @Value("${kaya.kafka.category-topic}")
  private String categoryTopic;

  @Override
  public void send(Category product) {
    Map<String, Object> headers = new HashMap<>();
    headers.put(KafkaHeaders.TOPIC, categoryTopic);
    kafkaTemplate.send(new GenericMessage<>(product, headers));
  }
}
