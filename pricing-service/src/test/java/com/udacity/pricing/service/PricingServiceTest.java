package com.udacity.pricing.service;

import com.udacity.pricing.domain.price.Price;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {

    @Test
    void getPrice() throws PriceException {
        Price price = PricingService.getPrice(1L);
        assertEquals("USD", price.getCurrency());
        assertNotNull(price.getCurrency());
        assertNotNull(price.getVehicleId());
    }

}