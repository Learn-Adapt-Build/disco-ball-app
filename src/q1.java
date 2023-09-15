import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q1 extends JFrame {

    private String[] arr;

    public q1(String[] arr1) {

        //setLocation(parentFrame.getLocation()); // Set the location to match the parent frame (q1)

        arr = arr1;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add the question label with a maximum width of 450
        JLabel lblNewLabel = createWrappedLabel("<html> <center>" + "1. What is your primary relation to neurodiversity?" + "</center></html>", 450);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblNewLabel, gbc);

        // Create a button group for the radio buttons
        ButtonGroup buttonGroup = new ButtonGroup();

        // Add the radio buttons with text wrapping and maximum width of 450
        JRadioButton radioButton1 = createWrappedRadioButton("Self Advocate", 450, "c1");
        JRadioButton radioButton2 = createWrappedRadioButton("Family Member", 450, "c2");
        JRadioButton radioButton3 = createWrappedRadioButton("Researcher/Scholar", 450, "c3");
        JRadioButton radioButton4 = createWrappedRadioButton("Policy Maker", 450, "c4");
        JRadioButton radioButton5 = createWrappedRadioButton("General Public/Other", 450, "c");

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);

        addRadioButton(radioButton1, gbc, 1);
        addRadioButton(radioButton2, gbc, 2);
        addRadioButton(radioButton3, gbc, 3);
        addRadioButton(radioButton4, gbc, 4);
        addRadioButton(radioButton5, gbc, 5);

        // Add the Next Question button
        JButton btnNewButton = new JButton("Next Question");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                // Assuming "q3" is another class that you want to open
                q2 thing = new q2(arr);
                thing.setVisible(true);
            }
        });
        getContentPane().add(btnNewButton, gbc);

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

    private JRadioButton createWrappedRadioButton(String text, int maxWidth, String value) {
        JRadioButton radioButton = new JRadioButton();
        radioButton.setVerticalAlignment(SwingConstants.TOP);
        radioButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        radioButton.setText("<html><div style='width:" + maxWidth + "px;'>" + text + "</div></html>");

        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arr[1] = value;
            }
        });

        return radioButton;
    }

    private void addRadioButton(JRadioButton radioButton, GridBagConstraints gbc, int gridY) {
        gbc.gridx = 0;
        gbc.gridy = gridY;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(radioButton, gbc);
    }
}
