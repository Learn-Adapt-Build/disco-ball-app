import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q5 extends JFrame {

    private String[] arr;

    public q5(String[] arr1) {
        arr = arr1;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 1); // Start with a small height, it will adjust automatically
        getContentPane().setLayout(new GridBagLayout());

        // Add question label
        JLabel lblNewLabel = new JLabel("<html><center>5. What strengths do you bring to the neurodiversity movement?</center></html>");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints labelGbc = new GridBagConstraints();
        labelGbc.anchor = GridBagConstraints.WEST;
        labelGbc.gridwidth = GridBagConstraints.REMAINDER;
        labelGbc.insets = new Insets(5, 5, 5, 5);
        labelGbc.fill = GridBagConstraints.HORIZONTAL;
        labelGbc.weightx = 1.0;
        getContentPane().add(lblNewLabel, labelGbc);

        // Add radio buttons with dynamic sizing and fixed width
        addRadioButton("<html>My unique perspective as a neurodiverse individual</html>", "c1");
        addRadioButton("<html>My background in engineering/computer science</html>", "c2");
        addRadioButton("<html>My creativity and design skills</html>", "c3");
        addRadioButton("<html>The knowledge I have gained through my research</html>", "c4");
        addRadioButton("Other", "c");

        // Add Next Question button
        JButton btnNewButton = new JButton("Next Question");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                q6 thing = new q6(arr);
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
                arr[4] = value;
            }
        });

        return radioButton;
    }
}
