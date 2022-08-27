package com.babalola.breweryservicems.client;
import com.babalola.breweryservicems.models.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
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
        System.out.println("Get beer by ID integration test running well");
    }
    @Test
    void saveNewBeer() {
        BeerDTO newBeer = BeerDTO.builder().name("Guiness Extra Smooth").build();

        URI newUri = breweryClient.saveNewBeer(newBeer);
        System.out.println("Save new beer integration test works");
    }
}