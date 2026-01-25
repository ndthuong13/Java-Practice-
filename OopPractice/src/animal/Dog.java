package animal;

public class Dog {
	private String name;
	private String breed;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "\nDog " + "\nName: " + this.name + "\nBreed: " + this.breed;
	}
	
}
