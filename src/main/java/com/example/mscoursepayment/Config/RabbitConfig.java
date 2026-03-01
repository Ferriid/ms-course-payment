package com.example.mscoursepayment.Config;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;

public class RabbitConfig {
    public static final String QUEUE_NAME = "course-payment.queue";
    public static final String EXCHANGE_NAME = "course-payment.exchange";
    public static final String ROUTING_KEY = "course-payment.routing";

    @Bean
    public Queue coursePaymentQueue() {
        return new Queue(QUEUE_NAME, true);
    }

    @Bean
    public DirectExchange coursePaymentExchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding coursePaymentBinding() {
        return BindingBuilder
                .bind(coursePaymentQueue())
                .to(coursePaymentExchange())
                .with(ROUTING_KEY);
    }
}
