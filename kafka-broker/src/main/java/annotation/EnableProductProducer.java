package annotation;

import org.springframework.context.annotation.Import;
import product.producer.ProductProducerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ProductProducerConfig.class)
public @interface EnableProductProducer {}
