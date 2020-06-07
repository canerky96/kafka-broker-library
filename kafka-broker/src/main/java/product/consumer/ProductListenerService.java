package product.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import product.Product;

@Service
public class ProductListenerService {

  @Autowired(required = false)
  private ProductListener productListener;

  @KafkaListener(
      topics = {"${kaya.kafka.product-topic}"},
      groupId = "${kaya.kafka.group-id}")
  public void listen(Product product) {
    productListener.listen(product);
  }
}
