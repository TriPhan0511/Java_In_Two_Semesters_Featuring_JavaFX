package exercises;

import java.util.List;

public class SerializableCarListHandler 
{
	/**
	 * A a new Car object to the list.
	 * @param carList A list of Car objects.
	 */
	public void addCar(List<SerializableCar> carList)
	{
		String tempReg;
		String tempMake;
		double tempPrice;
		
		tempReg = EasyScanner.nextString("\nEnter the registration number of the car: ");
		tempMake = EasyScanner.nextString("Enter the make of the car: ");
		tempPrice = EasyScanner.nextDouble("Enter the price of the car: ");
		
		carList.add(new SerializableCar(tempReg, tempMake, tempPrice));
	}
	
	/**
	 * Prints out all Car objects' information to the console.
	 * @param carList A list of Car objects.
	 */
	public void listAll(List<SerializableCar> carList)
	{
		for (SerializableCar car : carList)
		{
			if (car != null)
			{
				System.out.printf("%s %s %.1f\n",
						car.getRegistration(),
						car.getMake(),
						car.getPrice());
			}
		}
	}
	
	/**
	 * Removes a Car object at a specified position in the list.
	 * @param carList A list of Car objects.
	 */
	public void removeCar(List<SerializableCar> carList)
	{
		int pos;
		while (true)
		{
			pos = EasyScanner.nextInt("\nEnter the position of the car which be removed: ");
			if (pos <= 0 || pos > carList.size())
			{
				System.out.println("Invalid postion");
			}
			else
			{
				carList.remove(pos - 1);
				break;
			}
		}
	}
}
