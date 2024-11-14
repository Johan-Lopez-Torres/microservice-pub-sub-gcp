package org.johan.microservices.ordermicroservice;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    private final PubSubTemplate pubSubTemplate;

    @Autowired
    public OrderService(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    public void sendOrderMessage(String message) {
        log.info("Sending order message: {}", message);
        pubSubTemplate.publish("Johan-topic", message);
    }
}