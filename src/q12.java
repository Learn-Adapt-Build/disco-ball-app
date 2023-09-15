import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q12 extends JFrame {

    private String[] arr;

    public q12(String[] arr1) {
        arr = arr1;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());

        // Add the question label with a maximum width of 450
        JLabel lblNewLabel = createWrappedLabel("<html><center>12. What did you learn most about in this conference?</center></html>", 450);
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 0;
        labelConstraints.gridwidth = 2;
        labelConstraints.fill = GridBagConstraints.HORIZONTAL;
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblNewLabel, labelConstraints);

        // Create a button group for the radio buttons
        ButtonGroup buttonGroup = new ButtonGroup();

        // Add the radio buttons with text wrapping and maximum width of 450
        addRadioButton(buttonGroup, "The neurodivergent movement as a whole", 450, "c1");
        addRadioButton(buttonGroup, "How to best support neurodivergent individuals", 450, "c2");
        addRadioButton(buttonGroup, "Japanese culture", 450, "c3");
        addRadioButton(buttonGroup, "What is currently being developed in the field of neurodiversity technology and how I can get involved", 450, "c4");
        addRadioButton(buttonGroup, "Other", 450, "c");

        // Add the Next Question button
        JButton btnNewButton = new JButton("Next Question");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                // Replace "picture" with the appropriate class for the next question
                picture thing = new picture(arr);
                thing.setVisible(true);
            }
        });
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = GridBagConstraints.RELATIVE; // This ensures it's placed below the previous component
        buttonConstraints.gridwidth = 2;
        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(btnNewButton, buttonConstraints);

        pack(); // Automatically adjust the frame size based on components
        setLocationRelativeTo(null); // Center the frame on the screen

    }

    private JLabel createWrappedLabel(String text, int maxWidth) {
        JLabel label = new JLabel();
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setText("<html><div style='width:" + maxWidth + "px;'>" + text + "</div></html>");
        return label;
    }

    private void addRadioButton(ButtonGroup buttonGroup, String text, int maxWidth, String value) {
        JRadioButton radioButton = createWrappedRadioButton(text, maxWidth, value);
        buttonGroup.add(radioButton);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE; // Place it below the previous component
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(radioButton, gbc);
    }

    private JRadioButton createWrappedRadioButton(String text, int maxWidth, String value) {
        JRadioButton radioButton = new JRadioButton();
        radioButton.setVerticalAlignment(SwingConstants.TOP);
        radioButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        radioButton.setText("<html><div style='width:" + maxWidth + "px;'>" + text + "</div></html>");

        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arr[11] = value;
            }
        });

        return radioButton;
    }
}
