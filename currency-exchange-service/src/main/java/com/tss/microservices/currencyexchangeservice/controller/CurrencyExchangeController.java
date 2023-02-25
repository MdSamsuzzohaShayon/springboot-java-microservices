package com.tss.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tss.microservices.currencyexchangeservice.currencyexchange.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
//	curl http://localhost:8000/currency-exchange/from/BDT/to/USD
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from ,@PathVariable String to) {
		return new CurrencyExchange(100L, from, to, BigDecimal.valueOf(50));
	}
}
