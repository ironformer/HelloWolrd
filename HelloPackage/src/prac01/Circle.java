package prac01;

public class Circle {
	private final double PI = 3.14;
	
	private int radius;
	private String name;
	
	/*public Circle() {
		
	}*/ //default constructor
	
	public Circle() {
		this(1, "random pizza");
	}//using this() method
	
	public Circle(int r, String n) {
		this.initialize(r, n);
	}// using this. reference
	
	public Circle(Circle c) {
		this.radius = c.radius;
		this.name = new String(c.name);
	}
	
	private void initialize(int r, String n) {
		this.radius = r; //setRadius(r)
		this.name = n;   //setName(n)
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public double getPI() {
		return this.PI;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public String toString() {
		return "name : " + getName() + " radius : " + getRadius();
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}//circlearray용

	public static void main(String[] args) {
		System.out.println("Class and Object Practice");
		
		//creating Circle object
		Circle pizza = new Circle();
		
		//initialization using reference variable
		pizza.radius = 10;
		pizza.name = "Cheese Pizza";
		
		//test
		System.out.println(pizza.toString());
		
		//code for initialization using method
		Circle pizza2 = new Circle();
		
		pizza2.initialize(8, "Chicago Pizza");
		
		//test
		System.out.println(pizza2.toString()); //initialize를 private화 해서 오류가난다. this 메소를 지우면 오류날 것
		
		//code for initialization using constructor
		Circle pizza3 = new Circle(15, "Hawaiian Pizza");
		System.out.println(pizza3.toString());
		
		Circle pizza4 = new Circle();
		System.out.println(pizza4.toString());
		
		Circle pizzaCopy = new Circle(pizza);
		System.out.println(pizzaCopy.toString());

	}

}
