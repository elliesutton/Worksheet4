
/**
 * Car is a class that stores a car's maximum speed, car number
 * and make.
 * @author exs404
 *
 */
public class Car implements Sortable{
	
	private double maxSpeed;
	private String carNumber;
	private String make;
	
	/**
	 * Car is a constructor that creates a car object
	 * @param maxSpeed The maximum speed
	 * @param carNumber The car number
	 * @param make The make of the car
	 */
	public Car(double maxSpeed, String carNumber, String make) {
		this.maxSpeed = maxSpeed;
		this.carNumber = carNumber;
		this.make = make;
	}
	
	/**
	 * 
	 */
	public double compareValue() {
		return maxSpeed;
	}
	
	/**
	 * toString method
	 * @return The maximum speed of the car, the car number and the car make
	 */
	public String toString() {
		return maxSpeed + carNumber + make;
	}
	
}