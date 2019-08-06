package com.patrikpolacek.msscbrewery.web.services;

import com.patrikpolacek.msscbrewery.web.model.BeerDto;
import com.patrikpolacek.msscbrewery.web.services.v2.BeerServiceV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerServiceV2 {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .bearName("Kingswoodesr")
                .bearStyle("Cider")
                .upc(1L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
//        todo add real imp to add update beer
    }

    @Override
    public void deteteById(UUID beerId) {
      log.debug("Deleting a beer...");
    }
}
