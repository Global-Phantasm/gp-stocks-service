package com.gp.pf.stocks.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gp.pf.stocks.service.StocksService;
import com.gp.pf.stocks.service.dto.StocksRequest;
import com.gp.pf.stocks.service.dto.StocksResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/stocks")
@RequiredArgsConstructor
public class StocksController {
	final private StocksService stocksService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createStocks(@RequestBody StocksRequest stocksRequest) {
		stocksService.createStocks(stocksRequest);
	}
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<StocksResponse> getAllStocks() {
		return stocksService.getAllStocks();
	}

}
