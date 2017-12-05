/**
 * Aeroplane is a class that creates ---
 * @author Ellen Sutton
 *
 */
public class Aeroplane extends Aircraft{
	
	private double range;
	
	/**
	 * Aeroplane is a constructor that creates an aeroplane object
	 * @param maxSpeed The maximum speed
	 * @param maxWeight The maximum weight
	 * @param maxPersons The maximum number of persons
	 * @param range The range
	 */
	public Aeroplane(double maxSpeed, double maxWeight, int maxPersons, double range){
		super(maxSpeed, maxWeight, maxPersons);
		this.range = range;
	}
	
	/**
	 * getter for the range
	 * @return The range
	 */
	public double getRange(){
		return range;
	}
	
	/**
	 * setter for the range
	 * @param range The range
	 */
	public void setRange(double range){
		this.range = range;
	}
	
	/**
	 * toString method
	 * @return the aeroplanes's maximum speed, maximal weight, maximum number of persons and the range
	 */
	@Override
	public String toString(){
		return super.toString() + " It has a range of " + range + " km.";
	}


}
