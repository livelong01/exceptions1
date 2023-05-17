package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}


	public long duration() {
		Duration duration = Duration.between(checkIn.atTime(0 , 0), checkOut.atTime(0 , 0));
		 return duration.toDays();
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString () {
		return "Room " 
	+ roomNumber 
	+", check-in: "
	+ fmt.format(checkIn)
	+ ", check-out: " 
	+ fmt.format(checkOut)
	+", "
	+duration()
	+" nights.";
	}
	
	
	
	
}
