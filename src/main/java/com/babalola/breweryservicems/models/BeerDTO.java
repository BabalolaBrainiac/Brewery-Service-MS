package com.babalola.breweryservicems.models;
import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

    private UUID id;
    private String name;
    private String beerType;
    private Long upc;
}
