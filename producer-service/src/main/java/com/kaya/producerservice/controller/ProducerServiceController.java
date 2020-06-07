package com.kaya.producerservice.controller;

import category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product.Product;
import product.producer.ProductProducerService;

import java.util.Arrays;

@RequestMapping
@RestController
public class ProducerServiceController {

  @Autowired ProductProducerService productProducerService;

  @GetMapping
  public String send() {
    Product product =
        new Product("Elma", 5, Arrays.asList(new Category("Yiyecek"), new Category("Meyve")));
    productProducerService.send(product);
    return "Product sent to Kafka Brokers";
  }
}
