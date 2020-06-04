package com.kaya.producerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product.Product;
import product.ProductProducerService;

@RequestMapping
@RestController
public class ProducerController {

  @Autowired ProductProducerService productProducerService;

  @PostMapping
  public String send(@RequestBody Product product) {
    productProducerService.send(product);
    return "Message sent";
  }
}
