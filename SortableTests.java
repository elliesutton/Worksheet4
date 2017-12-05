import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortableTests {

	public static final double EPSILON = 1e-6;
	
	private Sortable s1, s2, s3, s4, s5, s6;
	
	
	@Test
	public void test1() {
		
		s1 = new Car(150.0, "WG55 ATG", "Citroen");
		s2 = new Customer("Ellie", 89.50, "45 Lottie road");
		
		double expected1 = 150.0;
		double expected2 = 89.50;
		
		assertEquals(expected1, s1.compareValue(), EPSILON);
		assertEquals(expected2, s2.compareValue(), EPSILON);
	}
	
	@Test
	public void test2() {
		s1 = new Car(150.0, "WG55 ATG", "Citroen");
		s2 = new Car(130.0, "FX21 YLK", "BMW");
		s3 = new Car(144.0, "KT43 PTW", "Peugeot");
		
		Sortable[] a = {s1, s2, s3};
		Sortable[] expected = {s2, s3, s1};
		
		assertArrayEquals(expected, Sorting.quickSort(a));
	}
	
	@Test
	public void test3() {
		s1 = new Car(150.0, "WG55 ATG", "Citroen");
		s2 = new Car(130.0, "FX21 YLK", "BMW");
		s3 = new Car(144.0, "KT43 PTW", "Peugeot");
		s4 = new Car(180.0, "RR43 FRZ", "Ferrari");
		s5 = new Car(112.0, "TL98 BLJ", "Ford");
		
		Sortable[] a = {s1, s2, s3, s4, s5};
		Sortable[] expected = {s5, s2, s3, s1, s4};
		
		assertArrayEquals(expected, Sorting.quickSort(a));
	}
	
	@Test
	public void test4() {
		s1 = new Customer("Ellie", 89.50, "45 Lottie road");
		s2 = new Customer("Arya", 50.0, "123 Road road");
		s3 = new Customer("Theo", 65.0, "76 Hello road");
		
		Sortable[] a = {s1, s2, s3};
		Sortable[] expected = {s2, s3, s1};
		
		assertArrayEquals(expected, Sorting.quickSort(a));
		
	}
	
	@Test
	public void test5() {
		s1 = new Customer("Ellie", 89.50, "45 Lottie road");
		s2 = new Customer("Arya", 50.0, "123 Road road");
		s3 = new Customer("Theo", 65.0, "76 Hello road");
		s4 = new Customer("Delilah", 5.20, "642 Rocky road");
		s5 = new Customer("Nathan", 99.99, "59 High road");
		s6 = new Customer("Mo", 2.30, "11 Low road");
		
		Sortable[] a = {s1, s2, s3, s4, s5, s6};
		Sortable[] expected = {s6, s4, s2, s3, s1, s5};
		
		assertArrayEquals(expected, Sorting.quickSort(a));
	}
	
	@Test
	public void test6() {
		s1 = new Car(150.0, "WG55 ATG", "Citroen");
		s2 = new Car(130.0, "FX21 YLK", "BMW");
		s3 = new Car(144.0, "KT43 PTW", "Peugeot");
		s4 = new Customer("Ellie", 89.50, "45 Lottie road");
		s5 = new Customer("Arya", 50.0, "123 Road road");
		s6 = new Customer("Theo", 65.0, "76 Hello road");
		
		Sortable[] a = {s1, s2, s3, s4, s5, s6};
		Sortable[] expected = {s5, s6, s4, s2, s3, s1};
		
		assertArrayEquals(expected, Sorting.quickSort(a));
	}


}
