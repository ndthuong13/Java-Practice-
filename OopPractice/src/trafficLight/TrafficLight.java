package trafficLight;

public class TrafficLight {
	private String color;
	private float duration;
	
	
	public TrafficLight() {
		
	}
	
	public TrafficLight(String color, float duration) {
		this.color = color;
		this.duration = duration;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public boolean isRed() {
		return color.equalsIgnoreCase("red");
	}
	public boolean isYellow() {
		return color.equalsIgnoreCase("yellow");
	}
	
	public boolean isGreen() {
		return color.equalsIgnoreCase("green");
	}
	
	public void changeColor(String color, float duration) {
		this.color = color;
		this.duration = duration;
	}
	
	public void display() {
		System.out.println("Color: " + this.color);
		System.out.println("Duration: " + this.duration + " seconds");
	}
	
	
}
