import java.util.ArrayList;

/**
 * ExamQuestionSimpleChoice is a class that creates an exam question where
 * the user is provided with an array list of possible answers and they must
 * indicate the position of the correct answer (starts at position 1).
 * @author Ellen Sutton
 *
 */
public class ExamQuestionSimpleChoice extends ExamQuestion {
	
	private ArrayList<String> possibleAnswers;
	private int correctAnswer;
	
	/**
	 * ExamQuestionSimpleChoice is a constructor that creates an exam question
	 * @param questionText The question text
	 * @param maximalMark The maximal mark for the question
	 * @param possibleAnswers The possible answers to the question
	 * @param correctAnswer The correct answer position
	 */
	public ExamQuestionSimpleChoice(String questionText, int maximalMark, 
			ArrayList<String> possibleAnswers, int correctAnswer){
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswer = correctAnswer;
	}
	
	/**
	 * mark is a method that gives maximal marks for the correct answer
	 * and mark zero for an incorrect answer.
	 * @param value The answer provided
	 * @return The relevant mark for the provided answer
	 */
	public int mark(int value){
		if (value == correctAnswer){
			return getMaximalMark();
		} else {
			return 0;
		}
	}
	
	/**
	 * toString method
	 * @return The question text, the maximal mark, the possible answers and the 
	 * position of the correct answer.
	 */
	@Override
	public String toString(){
		return super.toString() + " Possible answers are: " + possibleAnswers 
				+ " Correct answer position is: " + correctAnswer;
	}

}
