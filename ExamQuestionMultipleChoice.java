import java.util.ArrayList;

/**
 * ExamQuestionMultipleChoice is a class that creates a multiple choice exam
 * question, where the user is provided with an array list of possible answers
 * and they must indicate the positions of the correct answers (starts at
 * position 1).
 * @author Ellen Sutton
 *
 */
public class ExamQuestionMultipleChoice extends ExamQuestion {
	
	private ArrayList<Integer> correctAnswers;
	
	/**
	 * ExamQuestionMultipleChoice is a constructor that creates an exam question
	 * @param questionText The question text
	 * @param maximalMark The maximal mark
	 * @param possibleAnswers The possible answers
	 * @param correctAnswers The positions of the correct answers
	 */
	public ExamQuestionMultipleChoice(String questionText, int maximalMark, 
			ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers){
		super(questionText, maximalMark);
		this.correctAnswers = correctAnswers;
	}
	

	/**
	 * mark is a method that gives scales the difference between the number of 
	 * correct answers and the number of incorrect answers to the maximal marks 
	 * and rounds to the next integer mark. 
	 * @param answersProvided The answers provided
	 * @return The relevant mark for the provided answers
	 */
	public int mark(ArrayList<Integer> answersProvided){
		
		ArrayList<Integer> correctAnswersProvided = new ArrayList<Integer>();
		int incorrectCount = 0;
		for (int i=0; i< answersProvided.size(); i++){
			int answer = answersProvided.get(i);
			if (correctAnswers.contains(answer) &! correctAnswersProvided.contains(answer)){
				correctAnswersProvided.add(answer);
			} else if (!correctAnswers.contains(answer)){
				incorrectCount++;
			}
		}
		

		double scaling = 0;
		int mark = 0;
		int sum = correctAnswersProvided.size() - incorrectCount;
		if (sum == correctAnswers.size())
			mark = getMaximalMark();
		if (sum < 1)
			mark = 0;
		if (sum > 0 && sum < correctAnswers.size()){
			scaling = ((double) sum/correctAnswers.size())*getMaximalMark();
			mark = (int) Math.ceil(scaling);
		}
		
		return mark; 
		
	}
	
	/**
	 * toString method
	 * return The question text with the maximal mark
	 */
	@Override
	public String toString(){
		return super.toString();
	}
	

	
}
	

