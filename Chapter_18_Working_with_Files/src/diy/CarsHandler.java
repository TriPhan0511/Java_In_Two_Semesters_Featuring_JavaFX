package diy;

import java.util.List;

import readingandwritingtobinaryfiles.Car;

/**
 * Some utility methods which are handle a list of cars:
 * 1. Adds a new car.
 * 2. Removes a specified car.
 * 3. Lists all of cars in the list.
 * 
 * @version 1.0 2021-11-29
 * @author Tri Phan
 *
 */
public class CarsHandler 
{
	/**
	 * Adds a new Car object to a list.
	 * @param carList A list of cars.
	 */
	public void addCar(List<Car> carList)
	{
		String tempRegistration;
		String tempMake;
		double tempPrice;
		
		System.out.print("\nEnter the registration: ");
		tempRegistration = EasyScanner.nextString();
		System.out.print("Enter the make: ");
		tempMake = EasyScanner.nextString();
		System.out.print("Enter the price: ");
		tempPrice = EasyScanner.nextDouble();
		
		carList.add(new Car(tempRegistration, tempMake, tempPrice));
	}
	
	/**
	 * Remove a specified car in a list of cars.
	 * @param carList A list of cars.
	 */
	public void removeCar(List<Car> carList)
	{
		if (carList.size() == 0)
		{
			System.out.println("\nThere is no car in the list.");
		}
		else
		{
			int pos;
			do
			{
				System.out.print("\nEnter position of the car which be removed: ");
				pos = EasyScanner.nextInt();
				if (pos <= 0)
				{
					System.out.println("The position should be greater than zero.");
				}
			} while (pos <= 0);
			
			carList.remove(pos - 1);
		}
	}
	
	/**
	 * Prints out all of cars in a list.
	 * @param carList A list of cars.
	 */
	public void listAll(List<Car> carList)
	{
		if (carList.size() == 0)
		{
			System.out.println("\nThere is no car in the list.");
		}
		else
		{
			System.out.println("\nCars in the list");
			for (Car item :  carList) 
			{
				System.out.printf("%s %s %.2f\n",
						item.getRegistration(),
						item.getMake(),
						item.getPrice());
			}
		}
	}
}






















