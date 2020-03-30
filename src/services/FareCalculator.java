package services;

import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;


// Type your code
class FareCalculator extends Booking {
	
	public double book(Hotel hotel) {
		
		//checking if 
		double rate;
		long days = ChronoUnit.DAYS.between(hotel.getFromdate(), hotel.getTodate());
		if(days > 0) {
			int noOfPersons = hotel.getNoOfPersons();
			String roomType = hotel.getRoomType();
			int rates = hotel.getRates();
			rate = super.booking(noOfPersons, rates);
			int month = hotel.getFromdate().getMonthValue(); 
		}
		else {
			return 0;
		}
		return rate;
	}
	public double book(Flight flight) {
		
		double rate = super.booking(flight.getNoOfPersons(), flight.getRates());
		return rate;
	}
	public double book(Train train) {
		
		double rate = super.booking(train.getNoOfPersons(), train.getRates());
		return rate;
	}
	public double book(Bus bus) {
		
		double rate = super.booking(bus.getNoOfPersons(), bus.getRates());
		return rate;
	}
	
}