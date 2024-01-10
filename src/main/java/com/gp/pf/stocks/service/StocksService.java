package com.gp.pf.stocks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gp.pf.stocks.service.dto.StocksRequest;
import com.gp.pf.stocks.service.dto.StocksResponse;
import com.gp.pf.stocks.service.model.Stocks;
import com.gp.pf.stocks.service.repository.StocksRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class StocksService {
	final private StocksRepository stocksRepository;

	public void createStocks(StocksRequest stocksRequest) {		
		Stocks stocks = Stocks.builder().stocksname(stocksRequest.getFirstName())
				.firstName(stocksRequest.getFirstName())
				.lastName(stocksRequest.getLastName())
				.address(stocksRequest.getAddress())
				.email(stocksRequest.getEmail())
				.mobile(stocksRequest.getMobile())
				.build();
		stocksRepository.save(stocks);
		log.info("Stocks {} is created",stocks.getId());
	}
	
	public List<StocksResponse> getAllStocks() {		
		List<Stocks> stockss = stocksRepository.findAll();
		return stockss.stream().map(this::mapToStocksResponse).toList();
	}

	private StocksResponse mapToStocksResponse(Stocks stocks) {
		return StocksResponse.builder()
				.id(stocks.getId())
				.stocksname(stocks.getStocksname())
				.firstName(stocks.getStocksname())
				.lastName(stocks.getLastName())
				.email(stocks.getEmail())
				.mobile(stocks.getMobile())
				.address(stocks.getAddress())
				.build();
	}
}
