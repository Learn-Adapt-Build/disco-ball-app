import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q4 extends JFrame {

    private String[] arr;

    public q4(String[] arr1) {
        arr = arr1;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 1); // Start with a small height, it will adjust automatically
        getContentPane().setLayout(new GridBagLayout());

        // Add question label
        JLabel lblNewLabel = new JLabel("<html><center>" + "4. How can businesses and the concerned parties foster a constructive partnership?" + "</center></html>");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints labelGbc = new GridBagConstraints();
        labelGbc.anchor = GridBagConstraints.WEST;
        labelGbc.gridwidth = GridBagConstraints.REMAINDER;
        labelGbc.insets = new Insets(5, 5, 5, 5);
        labelGbc.fill = GridBagConstraints.HORIZONTAL;
        labelGbc.weightx = 1.0;
        getContentPane().add(lblNewLabel, labelGbc);

        // Add radio buttons with dynamic sizing and fixed width
        addRadioButton("<html>Support for starting their own businesses</html>", "c1");
        addRadioButton("<html>Job training</html>", "c2");
        addRadioButton("<html>Educate neurotypical employees with sensitivity training</html>", "c3");
        addRadioButton("<html>Adjusting the hiring process to be more inclusive</html>", "c4");
        addRadioButton("<html>Providing accommodations in the workplace</html>", "c5");
        addRadioButton("Other", "c");

        // Add Next Question button
        labelGbc.gridx = 0;
        labelGbc.gridy = 7;
        labelGbc.gridwidth = 2;
        labelGbc.fill = GridBagConstraints.HORIZONTAL;
        JButton btn = new JButton("Next Question");
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                q5 thing = new q5(arr);
                thing.setVisible(true);
            }
        });
        GridBagConstraints buttonGbc = new GridBagConstraints();
        buttonGbc.anchor = GridBagConstraints.WEST;
        buttonGbc.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(btn, labelGbc);

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
                arr[3] = value;
            }
        });

        return radioButton;
    }
}
