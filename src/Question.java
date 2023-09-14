package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Question extends JFrame {

    private String[] arr;
    private int questionNumber;
    private ArrayList<String> questions;
    private ArrayList<String> answers;

    public Question(int num, ArrayList<String> questionList, ArrayList<String> answerList, String[] arr1) {
        questionNumber = num;
        questions = questionList;
        answers = answerList;
        arr = arr1;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 1); // Start with a small height, it will adjust automatically
        getContentPane().setLayout(new GridBagLayout());

        // Add question label
        JLabel lblNewLabel = new JLabel("<html><center>" + questionNumber + ". " + questions.get(questionNumber - 1) + "</center></html>");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints labelGbc = new GridBagConstraints();
        labelGbc.anchor = GridBagConstraints.WEST;
        labelGbc.gridwidth = GridBagConstraints.REMAINDER;
        labelGbc.insets = new Insets(5, 5, 5, 5);
        labelGbc.fill = GridBagConstraints.HORIZONTAL;
        labelGbc.weightx = 1.0;
        getContentPane().add(lblNewLabel, labelGbc);

        // Add radio buttons with dynamic sizing and fixed width
        for (int i = 0; i < answers.size(); i++) {
            addRadioButton(answers.get(i), "c" + (i + 1));
        }

        // Add Next Question button if not the last question
        if (questionNumber < questions.size()) {
            JButton btnNewButton = new JButton("Next Question");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    Question nextQuestion = new Question(questionNumber + 1, questions, answers, arr);
                    nextQuestion.setVisible(true);
                }
            });
            GridBagConstraints buttonGbc = new GridBagConstraints();
            buttonGbc.anchor = GridBagConstraints.WEST;
            buttonGbc.insets = new Insets(5, 5, 5, 5);
            getContentPane().add(btnNewButton, buttonGbc);
        }

        pack(); // Automatically adjust the frame size to fit the contents
        setLocationRelativeTo(null);
    }

    private void addRadioButton(String text, String value) {
        JRadioButton radioButton = createWrappedRadioButton(text, value);
        getContentPane().add(radioButton, createConstraints());
    }

    private GridBagConstraints createConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        return gbc;
    }

    private JRadioButton createWrappedRadioButton(String text, String value) {
        JRadioButton radioButton = new JRadioButton();
        radioButton.setVerticalAlignment(SwingConstants.TOP);
        radioButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        radioButton.setText("<html><div style='width:" + 450 + "px;'>" + text + "</div></html>");

        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arr[arr.length - 1] = value;
            }
        });

        return radioButton;
    }
}
