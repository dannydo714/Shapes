
public class ClassesAndObjects {
	
	//instance variable
	String name;
	String breed;
	int age;
	String color;
	
	//Constructor for class
	public ClassesAndObjects(String name, String breed, int age, String color){
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		
		String hello = ("Hi, my name is "+ this.getName() + ". My breed is " + this.getBreed() +" and my age is " + this.getAge()+ ". My color is "+ this.getColor()+ "."); 
		return hello;
	}

	public static void main(String []args) {
		ClassesAndObjects dog1 =  new ClassesAndObjects("Cooper", "corgi", 18, "red");
		System.out.println(dog1.toString());
		
	}
}
