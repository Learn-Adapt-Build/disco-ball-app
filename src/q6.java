import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q6 extends JFrame {

    private String[] arr;

    public q6(String[] arr1) {
        arr = arr1;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 1); // Start with a small height, it will adjust automatically
        //setLocationRelativeTo(null); // Center the frame on the screen
        getContentPane().setLayout(new GridBagLayout());

        // Add question label
        JLabel lblNewLabel = new JLabel("<html><center>6. What area would you most like to know more about?</center></html>");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints labelGbc = new GridBagConstraints();
        labelGbc.anchor = GridBagConstraints.WEST;
        labelGbc.gridwidth = GridBagConstraints.REMAINDER;
        labelGbc.insets = new Insets(5, 5, 5, 5);
        labelGbc.fill = GridBagConstraints.HORIZONTAL;
        labelGbc.weightx = 1.0;
        getContentPane().add(lblNewLabel, labelGbc);

        // Add radio buttons with dynamic sizing and fixed width
        addRadioButton("<html>How to support neurodivergent people</html>", 1);
        addRadioButton("<html>How to help develop neurodivergent people's strengths and talents</html>", 2);
        addRadioButton("<html>How to improve accessibility and make accommodations more widespread</html>", 3);
        addRadioButton("How to celebrate diversity in everyday life", 4);
        addRadioButton("Other", 5);

        // Add Next Question button
        JButton btnNewButton = new JButton("Next Question");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                q7 thing = new q7(arr);
                thing.setVisible(true);
            }
        });
        GridBagConstraints buttonGbc = new GridBagConstraints();
        buttonGbc.anchor = GridBagConstraints.WEST;
        buttonGbc.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(btnNewButton, buttonGbc);

        pack(); // Automatically adjust the frame size to fit the contents
        setLocationRelativeTo(null); // Center the frame on the screen

    }

    private void addRadioButton(String text, int index) {
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setVerticalAlignment(SwingConstants.TOP);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 1; i <= 5; i++) {
                    if (i != index) {
                        arr[5] = "c" + index;
                    }
                }
            }
        });

        getContentPane().add(radioButton, gbc);
    }
}
