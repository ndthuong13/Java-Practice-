package circle;

public class Circle {
	private Double r;
	private final Double pi = 3.14;
	
	public Circle() {
		
	}
	
	public Circle(Double r) {
		this.r = r;
	}
	
	public Double getR() {
		return r;
	}
	
	public void setR(Double r) {
		this.r = r;
	}
	
	public Double Area(Double r) {
		return pi * r * r;
	}
	
	public Double Circumference(Double r) {
		return 2 * pi * r;
	}
}
