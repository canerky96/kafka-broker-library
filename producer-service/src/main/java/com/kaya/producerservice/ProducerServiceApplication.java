package com.kaya.producerservice;

import annotation.EnableBrokerLibrary;
import annotation.EnableProductProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBrokerLibrary
@EnableProductProducer
public class ProducerServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProducerServiceApplication.class, args);
  }
}
