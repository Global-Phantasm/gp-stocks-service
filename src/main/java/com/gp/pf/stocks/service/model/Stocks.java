package com.gp.pf.stocks.service.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("portfolio_stockss")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Stocks {
	@Id
	private String id;
	private String stocksname;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String address;

}
