package model;
// Type your code

import java.time.LocalDate;

public class Train {
	
	//Private Data members
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	
	//Getters and setters
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	//Constructor definition
	public Train(int noOfPersons, String berth, int rates, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.berth = berth;
		this.rates = rates;
		this.date = date;
	}
	
}