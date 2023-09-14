import javax.swing.*;
import java.util.ArrayList;

public class MainSurvey {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                startSurvey();
            }
        });
    }

    public static void startSurvey() {
        // Create an ArrayList to store user's answers for each question
        ArrayList<ArrayList<String>> userAnswers = new ArrayList<>();

        // Create a list of questions and answers
        ArrayList<String> questionsList = new ArrayList<>();
        questionsList.add("Question 1 text");
        questionsList.add("Question 2 text");
        // Add more questions...

        ArrayList<String> answersList1 = new ArrayList<>();
        answersList1.add("Answer 1");
        answersList1.add("Answer 2");
        answersList1.add("Answer 3");
        // Add more answers...

        ArrayList<String> answersList2 = new ArrayList<>();
        answersList2.add("Answer A");
        answersList2.add("Answer B");
        // Add more answers...

        // Add answer lists to the userAnswers ArrayList
        userAnswers.add(answersList1);
        userAnswers.add(answersList2);
        // Add more answer lists...

        // Start the survey at question 1
        int currentQuestion = 0;

        // Display the first question
        Question questionWindow = new Question(currentQuestion + 1, questionsList, userAnswers.get(currentQuestion));
        questionWindow.setVisible(true);
    }
}
