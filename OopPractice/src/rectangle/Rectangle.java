package rectangle;

public class Rectangle {

	private Double width;
	private Double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.width = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double area(Double width, Double height) {
		return width * height;
	}
	
	public Double perimeter(Double width, Double height) {
		return (width + height) * 2;
	}
	
	
	
}
