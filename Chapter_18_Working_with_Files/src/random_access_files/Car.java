package random_access_files;

public class Car 
{
	private String registration;
	private String make;
	private double price;
	
	public Car(String registration, String make, double price) 
	{
		this.registration = registration;
		this.make = make;
		this.price = price;
	}
	
	public String getRegistration()
	{
		return this.registration;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
