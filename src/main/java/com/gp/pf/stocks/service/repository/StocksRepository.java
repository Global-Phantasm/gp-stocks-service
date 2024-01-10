package com.gp.pf.stocks.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gp.pf.stocks.service.model.Stocks;

public interface StocksRepository extends MongoRepository<Stocks, String>{

}
