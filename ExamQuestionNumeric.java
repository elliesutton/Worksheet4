/**
 * ExamQuestionNumeric is a class that creates an exam question
 * and provides a maximal mark for correct answers and mark zero
 * for incorrect answers.
 * @author Ellen Sutton
 *
 */
public class ExamQuestionNumeric extends ExamQuestion{
	
	private int correctAnswer;
	
	/**
	 * ExamQuestionNumeric is a constructor that creates an
	 * exam question.
	 * @param questionText The question text
	 * @param maximalMark The maximal mark
	 * @param correctAnswer The correct answer
	 */
	public ExamQuestionNumeric(String questionText, int maximalMark, int correctAnswer){
		super(questionText, maximalMark);
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
	 * @return The question text, maximal mark and the correct answer
	 */
	@Override
	public String toString(){
		return super.toString() + " Correct answer is: " + correctAnswer;
	}

	
}
