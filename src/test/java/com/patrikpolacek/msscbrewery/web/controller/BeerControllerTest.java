package com.patrikpolacek.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.patrikpolacek.msscbrewery.web.model.BeerDto;
import com.patrikpolacek.msscbrewery.web.services.v2.BeerServiceV2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BeerController.class)
class BeerControllerTest {
    @MockBean
    BeerServiceV2 beerService;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MockMvc mockMvc;

    BeerDto validBeer;

    @BeforeEach
    void setUp() {
        validBeer = BeerDto.builder().id(UUID.randomUUID())
                .bearName("testName")
                .bearStyle("testStyle")
                .upc(31312312983798L)
                .build();
    }

    @Test
    void getBeer() throws Exception {
//
//        mockMvc.perform(get("api/v1/beer" + validBeer.getId().toString()).accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(jsonPath("$.id", is(validBeer.getId().toString())))
//                .andExpect("$.beerName", is("Beer1"));
    }

    @Test
    void handlePost() {
    }

    @Test
    void handleUpdate() {
    }
}
