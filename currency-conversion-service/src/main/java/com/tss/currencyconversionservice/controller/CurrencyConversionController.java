package com.tss.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tss.currencyconversionservice.entity.CurrencyConversion;

@RestController 
public class CurrencyConversionController {
	
	// curl http://localhost:8100/currency-conversion/from/USD/to/BDT/quantity/10
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		return new CurrencyConversion(10001L, from, to, quantity, BigDecimal.ONE, BigDecimal.ONE, "");
	}
}
