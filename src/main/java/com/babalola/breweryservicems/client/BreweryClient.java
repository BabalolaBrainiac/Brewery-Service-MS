package com.babalola.breweryservicems.client;
import com.babalola.breweryservicems.models.BeerDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@ConfigurationProperties(prefix = "babalola.brewery", ignoreUnknownFields = false)
@Component
public class BreweryClient {
    public final String BEER_SERVICE_PATH = "/api/beer/";
    private String apiHost;
    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public BeerDTO getBeerById(UUID beerId) {
        return restTemplate.getForObject(apiHost + BEER_SERVICE_PATH + beerId, BeerDTO.class);
    }

    public URI saveNewBeer(BeerDTO newBeer) {
        return restTemplate.postForLocation(apiHost + BEER_SERVICE_PATH, newBeer);
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}
