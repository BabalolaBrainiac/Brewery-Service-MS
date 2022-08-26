package com.babalola.breweryservicems.client;
import com.babalola.breweryservicems.models.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {
    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById() {
        BeerDTO response = breweryClient.getBeerById(UUID.randomUUID());

        assertNotNull(response);
    }
}