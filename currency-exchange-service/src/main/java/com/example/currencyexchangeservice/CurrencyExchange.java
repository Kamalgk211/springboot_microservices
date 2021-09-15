package com.example.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {

	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal exchangeMultiple;
	private String environment;
	
	
	public CurrencyExchange() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CurrencyExchange(Long id, String from, String to, BigDecimal exchangeMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeMultiple = exchangeMultiple;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public String getTo() {
		return to;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public BigDecimal getExchangeMultiple() {
		return exchangeMultiple;
	}



	public void setExchangeMultiple(BigDecimal exchangeMultiple) {
		this.exchangeMultiple = exchangeMultiple;
	}



	public String getEnvironment() {
		return environment;
	}



	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	
}
