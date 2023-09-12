import java.awt.EventQueue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;


public class q4 extends JFrame{
	
	private String[] arr;
	
	
	public q4(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b4 = new JRadioButton("<html><center>" + "Job training" + "</center></html>");
		b4.setVerticalAlignment(SwingConstants.TOP);
		
		
		b4.setBounds(35, 170, 300, 23);
		getContentPane().add(b4);
		
		JRadioButton b2 = new JRadioButton("<html>Educate neurotypical employees with sensitivity training</html>");
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBounds(35, 196, 343, 23);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("<html>Adjusting the hiring process to be more inclusive</html>");
		b3.setVerticalAlignment(SwingConstants.TOP);
		b3.setBounds(35, 222, 321, 23);
		getContentPane().add(b3);
		
		JButton btn = new JButton("Next Question");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q5 thing = new q5(arr);
				thing.setVisible(true);
			}
		});
		btn.setBounds(116, 313, 150, 23);
		getContentPane().add(btn);
		
		JLabel lblNewLabel = new JLabel("<html><center>" + "How can businesses and the concerned parties foster a constructive partnership?" + "</center></html>");
		lblNewLabel.setBounds(92, 66, 200, 74);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b1 = new JRadioButton("<html>Support for starting their own businesses</html>");
		b1.setVerticalAlignment(SwingConstants.TOP);
		b1.setBounds(35, 144, 300, 23);
		getContentPane().add(b1);
		
		JRadioButton b5 = new JRadioButton("<html>Providing accomodations in the workplace</html>");
		b5.setVerticalAlignment(SwingConstants.TOP);
		b5.setBounds(35, 248, 343, 23);
		getContentPane().add(b5);
		
		JRadioButton b6 = new JRadioButton("Other");
		b6.setBounds(35, 274, 109, 23);
		getContentPane().add(b6);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b6.setSelected(false);
						arr[3] = "c1";
					}
			}
			});
	
		b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(b2.isSelected())
				{
					b1.setSelected(false);
					b3.setSelected(false);
					b4.setSelected(false);
					b6.setSelected(false);
					arr[3] = "c2";
				}
		}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b3.isSelected())
					{
						b1.setSelected(false);
						b2.setSelected(false);
						b4.setSelected(false);
						b6.setSelected(false);
						arr[3] = "c3";
					}
			}
			});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b4.isSelected())
					{
						b1.setSelected(false);
						b2.setSelected(false);
						b3.setSelected(false);
						b6.setSelected(false);
						arr[3] = "c4";
					}
			}
			});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b5.isSelected())
					{
						b1.setSelected(false);
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b6.setSelected(false);
						arr[3] = "c5";
					}
			}
			});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b6.isSelected())
					{
						b1.setSelected(false);
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b5.setSelected(false);
						arr[3] = "c";
					}
			}
			});
	}
}
