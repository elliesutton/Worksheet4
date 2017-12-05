import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AircraftTests {
	
	private Aircraft aircraft1, aircraft2, aircraft3;
	private Aeroplane aeroplane1;
	private HotAirBalloon hotAirBalloon1;
	private final static double EPSILON = 1e-6;
	
	@Before
	public void setUp(){
		aircraft1 = new Aircraft(200.0, 1439.5, 1);
		aircraft2 = new Aeroplane(799.0, 5000.0, 300, 1500);
		aircraft3 = new HotAirBalloon(600.0, 999.9, 4, 100);
		
		aeroplane1 = new Aeroplane(799.0, 5000.0, 300, 1500);
		hotAirBalloon1 = new HotAirBalloon(600.0, 999.9, 4, 100);
	}

	@Test
	public void test1() {

		String expected1 = "The aircraft has a maximal speed of 200.0 km/h and a maximal weight of 1439.5 kg."
				+ " It can carry 1 person.";
		
		String expected2 = "The aircraft has a maximal speed of 799.0 km/h and a maximal weight of 5000.0 kg."
				+ " It can carry 300 persons. It has a range of 1500.0 km.";

		
		String expected3 = "The aircraft has a maximal speed of 600.0 km/h and a maximal weight of 999.9 kg. "
				+ "It can carry 4 persons. It has a gas temperature of maximally 100.0\u00B0C.";


		assertEquals(expected1, aircraft1.toString());
		assertEquals(expected2, aircraft2.toString());
		assertEquals(expected3, aircraft3.toString());

	}
	
	
	@Test
	public void test2() {
		
		String expected1 = "The aircraft has a maximal speed of 799.0 km/h and a maximal weight of 5000.0 kg."
				+ " It can carry 300 persons. It has a range of 1500.0 km.";

		
		String expected2 = "The aircraft has a maximal speed of 600.0 km/h and a maximal weight of 999.9 kg. "
				+ "It can carry 4 persons. It has a gas temperature of maximally 100.0\u00B0C.";
		
		assertEquals(expected1, aeroplane1.toString());
		assertEquals(expected2, hotAirBalloon1.toString());

	}
	
	@Test
	public void test3() {

		aircraft1.setMaxSpeed(439.4);
		aircraft2.setMaxWeight(2000.0);
		aircraft3.setMaxPersons(7);
		
		double expected1 = 439.4;
		double expected2 = 2000.0;
		int expected3 = 7;

		assertEquals(expected1, aircraft1.getMaxSpeed(), EPSILON);
		assertEquals(expected2, aircraft2.getMaxWeight(), EPSILON);
		assertEquals(expected3, aircraft3.getMaxPersons(), EPSILON);

	}
	
	@Test
	public void test4() {
		
		aeroplane1.setRange(3500.3);
		hotAirBalloon1.setGasTemperature(103.9);
		
		double expected1 = 3500.3;
		double expected2 = 103.9;
		
		assertEquals(expected1, aeroplane1.getRange(), EPSILON);
		assertEquals(expected2, hotAirBalloon1.getGasTemperature(), EPSILON);
		
	}
	
	@Test
	public void test5() {
		aeroplane1.setMaxSpeed(749.9);
		aeroplane1.setRange(3500.3);
		hotAirBalloon1.setMaxPersons(2);
		hotAirBalloon1.setGasTemperature(103.9);
		
		String expected1 = "The aircraft has a maximal speed of 749.9 km/h and a maximal weight of 5000.0 kg."
				+ " It can carry 300 persons. It has a range of 3500.3 km.";

		
		String expected2 = "The aircraft has a maximal speed of 600.0 km/h and a maximal weight of 999.9 kg. "
				+ "It can carry 2 persons. It has a gas temperature of maximally 103.9\u00B0C.";
		
		
		assertEquals(expected1, aeroplane1.toString());
		assertEquals(expected2, hotAirBalloon1.toString());
		
	}
	
	@Test
	public void test6() {
		aircraft2.setMaxPersons(1);
		hotAirBalloon1.setMaxPersons(1);
		
		String expected1 = "The aircraft has a maximal speed of 799.0 km/h and a maximal weight of 5000.0 kg."
				+ " It can carry 1 person. It has a range of 1500.0 km.";
		
		String expected2 = "The aircraft has a maximal speed of 600.0 km/h and a maximal weight of 999.9 kg. "
				+ "It can carry 1 person. It has a gas temperature of maximally 100.0\u00B0C.";
		
		assertEquals(expected1, aircraft2.toString());
		assertEquals(expected2, hotAirBalloon1.toString());
		
		
	}

}
