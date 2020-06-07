package product.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;
import product.Product;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductProducerServiceImpl implements ProductProducerService {

  @Autowired private KafkaTemplate<String, String> kafkaTemplate;

  @Value("${kaya.kafka.product-topic}")
  private String productTopic;

  @Override
  public void send(Product product) {
    Map<String, Object> headers = new HashMap<>();
    headers.put(KafkaHeaders.TOPIC, productTopic);
    kafkaTemplate.send(new GenericMessage<>(product, headers));
  }
}
