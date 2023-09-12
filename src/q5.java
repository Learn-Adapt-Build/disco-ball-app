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


public class q5 extends JFrame{
	
	private String[] arr;
	
	
	public q5(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("<html>My unique perspective as a neurodiverse individual</html>");
		b1.setVerticalAlignment(SwingConstants.TOP);
		
		
		b1.setBounds(35, 150, 343, 23);
		getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("<html><center>My background in engineering/computer science</center></html>");
		b2.setBounds(35, 176, 327, 23);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("<html><center>My creativity and design skills</center></html>");
		b3.setBounds(35, 202, 312, 23);
		getContentPane().add(b3);
		
		JButton btnNewButton = new JButton("Next Question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q6 thing = new q6(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(116, 300, 150, 23);
		getContentPane().add(btnNewButton);
		
		JRadioButton b4 = new JRadioButton("<html><center>The knowledge I have gained through my research</center></html>");
		b4.setBounds(35, 228, 312, 23);
		getContentPane().add(b4);
		
		JLabel lblNewLabel = new JLabel("<html><center>What strengths do you bring to the neurodiversity movement?</center></html>");
		lblNewLabel.setBounds(91, 57, 200, 73);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b5 = new JRadioButton("Other");
		b5.setBounds(35, 254, 109, 23);
		getContentPane().add(b5);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b5.setSelected(false);
						arr[4] = "c1";
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
					b5.setSelected(false);
					arr[4] = "c2";
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
						b5.setSelected(false);
						arr[4] = "c3";
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
						b5.setSelected(false);
						arr[4] = "c4";
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
						arr[4] = "c";
					}
			}
			});
		}
		
}
