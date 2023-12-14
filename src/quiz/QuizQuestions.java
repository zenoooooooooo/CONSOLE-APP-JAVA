package quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class QuizQuestions {

	
	private static final Map<String, String> questionAnswerMap = new HashMap<>();
	
	
	
	static {
		questionAnswerMap.put("What is the capital of Canada?", "Ottawa");
        questionAnswerMap.put("How many continents are there in the world?", "7");
        questionAnswerMap.put("What is the largest mammal on Earth?", "Blue Whale");
        questionAnswerMap.put("Who wrote 'Harry Potter and the Philosopher's Stone'?", "J.K. Rowling");
        questionAnswerMap.put("What is the currency of Japan?", "Yen");
        questionAnswerMap.put("In which year did the Titanic sink?", "1912");
        questionAnswerMap.put("What is the chemical symbol for gold?", "Au");
        questionAnswerMap.put("Which planet is known as the 'Red Planet'?", "Mars");
        questionAnswerMap.put("What is the square root of 144?", "12");
        questionAnswerMap.put("Who is known as the 'Father of Computer Science'?", "Alan Turing");
	}

	public String getQuestions() {
        String[] questions = questionAnswerMap.keySet().toArray(new String[0]);
        int randomIndex = new Random().nextInt(questions.length);
        String question = questions[randomIndex]; 
        
        return question;
	}
	   
	public String getAnswer(String question) {
	    return questionAnswerMap.get(question);
	}
	
}
	        
