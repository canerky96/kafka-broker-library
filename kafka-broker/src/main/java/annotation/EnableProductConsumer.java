package annotation;

import org.springframework.context.annotation.Import;
import product.consumer.ProductConsumerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ProductConsumerConfig.class)
public @interface EnableProductConsumer {}
