/**
 * ExamQuestion is a class that creates an exam question 
 * with text and a maximal mark.
 * @author Ellen Sutton
 *
 */

public class ExamQuestion {
	
	private String questionText;
	private int maximalMark;
	
	/**
	 * ExamQuestion is a constructor for creating
	 * an exam question.
	 * @param questionText The question text
	 * @param maximalMark The maximal mark available for the question
	 */
	public ExamQuestion(String questionText, int maximalMark){
		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}

	/**
	 * getter for the question text
	 * @return The question text
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * setter for the question text
	 * @param questionText The question text
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	/**
	 * getter for the maximal mark
	 * @return The maximal mark
	 */
	public int getMaximalMark() {
		return maximalMark;
	}

	/**
	 * setter fort the maximal mark
	 * @param maximalMark The maximal mark
	 */
	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}

	/**
	 * toString method
	 * @return The question text with the maximal mark.
	 */
	@Override
	public String toString() {
		return "Question (Maximal mark: " + maximalMark + "): " + questionText;
	}	
	

}
