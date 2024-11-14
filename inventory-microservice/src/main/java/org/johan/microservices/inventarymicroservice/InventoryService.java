package org.johan.microservices.inventarymicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private static final Logger log = LoggerFactory.getLogger(InventoryService.class);

    public void processOrderMessage(String message) {
        log.info("Processing order message: {}", message);
        log.info("Order processed successfully!");
    }
}