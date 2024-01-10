package com.gp.pf.stocks.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StocksResponse {
	private String id;
	private String stocksname;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String address;
}
