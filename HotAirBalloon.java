/**
 * HotAirBalloon is a class that ----------
 * @author Ellen Sutton
 *
 */

public class HotAirBalloon extends Aircraft {

	private double gasTemperature;
	
	/**
	 * HotAirBalloon is a constructor that creates a hot air balloon object?????
	 * @param maxSpeed The maximum speed
	 * @param maxWeight The maximum weight
	 * @param maxPersons The maximum number of persons
	 * @param gasTemperature The gas temperature
	 */
	public HotAirBalloon(double maxSpeed, double maxWeight, int maxPersons, double gasTemperature){
		super(maxSpeed, maxWeight, maxPersons);
		this.gasTemperature = gasTemperature;
	}
	
	/**
	 * getter for the gas temperature
	 * @return The gas temperature
	 */
	public double getGasTemperature(){
		return gasTemperature;
	}
	
	/**
	 * setter for the gas temperature
	 * @param gasTemperature The gas temperature
	 */
	public void setGasTemperature(double gasTemperature){
		this.gasTemperature = gasTemperature;
	}
	
	/**
	 * toString method
	 * @return the hot air balloon's maximum speed, maximal weight, maximum number of persons and the gas temperature
	 */
	public String toString(){
		return super.toString() + " It has a gas temperature of maximally " + gasTemperature + "\u00b0C.";
	}

	
	
}
