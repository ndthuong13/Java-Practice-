package airplane;

import java.time.LocalTime;

public class Airplane {
	private String flightNumber;
	private String destination;
	private LocalTime departureTime;
	private int delay;
	
	public Airplane() {

	}

	public Airplane(String flightNumber, String destination, LocalTime departureTime, int delay) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departureTime = departureTime;
		this.delay = 0;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	
	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	public void delayTime(int minute) {
		this.delay = minute;
		this.departureTime = this.departureTime.plusMinutes(minute);
	}

	public void flightStatus() {
		if(this.delay == 0) {
			System.out.println("The flight " + this.getFlightNumber() + " to " + this.getDestination() + " is on Time" );
		}else {
			System.out.println("The flight " + this.getFlightNumber() + " to " + this.getDestination() + " is delayed " + this.delay + " minutes");
		}
	}

}
