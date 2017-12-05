import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class ExamQuestionTests {
	
	private ExamQuestion question1;
	private ExamQuestionNumeric question2;
	private ExamQuestionSimpleChoice question3;
	private ExamQuestionMultipleChoice question4;
	private ExamQuestionMultipleChoice question5;
	
	@Before
	public void setUp(){
		question1 = new ExamQuestion("What is 11 + 10?", 10);
		
		question2 = new ExamQuestionNumeric(
				"What is the square root of 81?", 5, 9);
		
		ArrayList<String> question3Answers = new ArrayList<String>
			(Arrays.asList("duck","pig","giraffe","cow"));
		question3 = new ExamQuestionSimpleChoice(
				"Which animal says moo?", 100, question3Answers, 4);
		
		ArrayList<String> q4PossibleAnswers = new ArrayList<String>
			(Arrays.asList("6", "19", "16", "32", "5", "4", "40"));
		ArrayList<Integer> q4CorrectAnswers = new ArrayList<Integer>
			(Arrays.asList(3, 4, 6, 7));
		question4 = new ExamQuestionMultipleChoice(
				"Which are multiples of 4?", 10, q4PossibleAnswers, q4CorrectAnswers);
		
		ArrayList<String> q5PossibleAnswers = new ArrayList<String>
			(Arrays.asList("4", "7", "13", "20", "31"));
		ArrayList<Integer> q5CorrectAnswers = new ArrayList<Integer>
			(Arrays.asList(2, 3, 5));
		question5 = new ExamQuestionMultipleChoice(
				"Which are prime numbers?", 10, q5PossibleAnswers, q5CorrectAnswers);
		
	}

	@Test
	public void test1() {
		int expected1 = 10;
		String expected2 = "Question (Maximal mark: 10): What is 11 + 10?";
		
		assertEquals(expected1, question1.getMaximalMark());
		assertEquals(expected2, question1.toString());

	}
	
	@Test
	public void test2() {
		question1.setMaximalMark(20);
		String expected1 = "What is 11 + 10?";
		int expected2 = 20;
		
		assertEquals(expected1, question1.getQuestionText());
		assertEquals(expected2, question1.getMaximalMark());
		
	}
	
	@Test
	public void test3() {
		int expected1 = 5;
		int expected2 = 0;
		
		assertEquals(expected1, question2.mark(9));
		assertEquals(expected2, question2.mark(11));
		
	}
	
	@Test
	public void test4() {

		String expected1 = "What is the square root of 81?";
		int expected2 = 5;
		
		assertEquals(expected1, question2.getQuestionText());
		assertEquals(expected2, question2.getMaximalMark());
	}
	
	@Test
	public void test5() {
		
		String expected1 = "Question (Maximal mark: 5): What is the square root of 81? Correct answer is: 9";
		
		assertEquals(expected1, question2.toString());
	}
	
	
	@Test
	public void test6() {
		
		String expected1 = "Which animal says moo?";
		int expected2 = 100;
		
		assertEquals(expected1, question3.getQuestionText());
		assertEquals(expected2, question3.getMaximalMark());
		
	}
	
	@Test
	public void test7() {
		question3.setMaximalMark(50);
		
		int expected1 = 50;
		int expected2 = 50;
		
		assertEquals(expected1, question3.getMaximalMark());
		assertEquals(expected2, question3.mark(4));
		
	}
	
	@Test
	public void test8() {
		int expected1 = 100;
		int expected2 = 0;
		
		assertEquals(expected1, question3.mark(4));
		assertEquals(expected2, question3.mark(2));
	}
	
	@Test
	public void test9() {
		
		String expected1 = "Question (Maximal mark: 100): Which animal says moo? "
				+ "Possible answers are: [duck, pig, giraffe, cow] Correct answer position is: 4";
		
		assertEquals(expected1, question3.toString());
		
	}
	
	@Test
	public void test10() {
		
		String expected1 = "Which are multiples of 4?";
		int expected2 = 10;
		
		assertEquals(expected1, question4.getQuestionText());
		assertEquals(expected2, question4.getMaximalMark());
		
	}
	
	@Test
	public void test11() {

		int expected1 = 0;
		int expected2 = 0;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5));
		ArrayList<Integer> given2 = new ArrayList<Integer>(Arrays.asList(1, 5));


		assertEquals(expected1, question4.mark(given1));
		assertEquals(expected2, question4.mark(given2));

	}
	
	@Test
	public void test12() {
		int expected1 = 10;
		int expected2 = 5;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList(3, 4, 6, 7));
		ArrayList<Integer> given2 = new ArrayList<Integer>(Arrays.asList(3, 6));
		
		assertEquals(expected1, question4.mark(given1));
		assertEquals(expected2, question4.mark(given2));
	}
	
	@Test
	public void test13() {
		question4.setMaximalMark(15);
		
		int expected1 = 15;
		int expected2 = 12;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList(3, 6, 4));
		
		assertEquals(expected1, question4.getMaximalMark());
		assertEquals(expected2, question4.mark(given1));
	}
	
	
	@Test
	public void test14() {
		String expected1 = "Question (Maximal mark: 10): Which are multiples of 4?";
		
		assertEquals(expected1, question4.toString());
	}
	
	
	@Test
	public void test15() {
		int expected1 = 7;
		int expected2 = 4;
		int expected3 = 4;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList(2, 3));
		ArrayList<Integer> given2 = new ArrayList<Integer>(Arrays.asList(2));
		ArrayList<Integer> given3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		assertEquals(expected1, question5.mark(given1));
		assertEquals(expected2, question5.mark(given2));
		assertEquals(expected3, question5.mark(given3));

	}
	
	@Test
	public void test16() {
		
		int expected1 = 0;
		int expected2 = 10;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList(1, 4));
		ArrayList<Integer> given2 = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
		
		assertEquals(expected1, question5.mark(given1));
		assertEquals(expected2, question5.mark(given2));
		
	}
	
	@Test
	public void test17() {
		question5.setMaximalMark(25);
		
		int expected1 = 9;
		int expected2 = 17;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList(3, 3));
		ArrayList<Integer> given2 = new ArrayList<Integer>(Arrays.asList(2, 3));
		
		assertEquals(expected1, question5.mark(given1));
		assertEquals(expected2, question5.mark(given2));
		
	}
	
	@Test
	public void test18() {
		
		int expected1 = 0;
		
		ArrayList<Integer> given1 = new ArrayList<Integer>(Arrays.asList());
		
		assertEquals(expected1, question5.mark(given1));
		
	}
	

	@Test
	public void test19() {
		
		String expected1 = "Question (Maximal mark: 10): Which are prime numbers?";
		
		assertEquals(expected1, question5.toString());
		
	}

}
