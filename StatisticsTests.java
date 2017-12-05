import static org.junit.Assert.assertEquals;
import java.util.function.Function;
import org.junit.Test;

public class StatisticsTests {
	
	private final static double EPSILON = 1e-6;

	@Test
	public void test1() {
		
		Function<Double, Double> f1 = x -> x * 0;
		double[] a = {7, 11, 45, 52, 17};

		double expectedMean = 0;
		double expectedStd = 0;
		
		assertEquals(expectedMean, Statistics.mean(f1, a), EPSILON);
		assertEquals(expectedStd, Statistics.standardDeviation(f1, a), EPSILON);
	
	}
	
	@Test
	public void test2() {
		
		Function<Double, Double> f1 = x -> x * x * x;
		double[] a = {42, 3, 14, 9, 32};

		double expectedMean = 22071.2;
		double expectedStd = 28758.115121823;
		
		assertEquals(expectedMean, Statistics.mean(f1, a), EPSILON);
		assertEquals(expectedStd, Statistics.standardDeviation(f1, a), EPSILON);
		
	}
	
	@Test
	public void test3() {
		
		Function<Double, Double> f1 = x -> 14 * x + 72;
		double[] a = {11, 6, 4, 4, 12};

		double expectedMean = 175.6;
		double expectedStd = 48.1730214954;
		
		assertEquals(expectedMean, Statistics.mean(f1, a), EPSILON);
		assertEquals(expectedStd, Statistics.standardDeviation(f1, a), EPSILON);
		
	}
	
	@Test
	public void test4() {
		
		Function<Double, Double> f1 = x -> Math.sin(Math.cos(Math.sin(x)));
		double[] a = {0.5, 0.67, -0.3, 1, 1, -1};

		double expectedMean = 0.69559579;
		double expectedStd = 0.081775464;
		
		assertEquals(expectedMean, Statistics.mean(f1, a), EPSILON);
		assertEquals(expectedStd, Statistics.standardDeviation(f1, a), EPSILON);
		
	}
	
	@Test
	public void test5() {
		
		Function<Double, Double> f1 = x -> 5*x;
		double[] a = {4, 4, 4, 4, 4, 4};

		double expectedMean = 20;
		double expectedStd = 0;
		
		assertEquals(expectedMean, Statistics.mean(f1, a), EPSILON);
		assertEquals(expectedStd, Statistics.standardDeviation(f1, a), EPSILON);
		
	}
	
	@Test
	public void test6() {
		
		Function<Double, Double> f1 = x -> Math.pow(x, 7);
		double[] a = {1, 2, 3, 4, 5, 6, 7};

		double expectedMean = 171472;
		double expectedStd = 282120.9112349;
		
		assertEquals(expectedMean, Statistics.mean(f1, a), EPSILON);
		assertEquals(expectedStd, Statistics.standardDeviation(f1, a), EPSILON);
		
	}

}
