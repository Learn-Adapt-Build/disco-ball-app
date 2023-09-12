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


public class q6 extends JFrame{
	
	private String[] arr;
	
	
	public q6(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("<html>How to support neurodivergent people</html>");
		b1.setVerticalAlignment(SwingConstants.TOP);
		
		
		b1.setBounds(78, 135, 269, 23);
		getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("<html>How to help develop neurodivergent people's strengths and talents</html>");
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBounds(78, 161, 287, 37);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("<html>How to improve accessibility and make accommodations more widespread</html>");
		b3.setVerticalAlignment(SwingConstants.TOP);
		b3.setBounds(78, 201, 287, 37);
		getContentPane().add(b3);
		
		JButton btnNewButton = new JButton("Next Question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q7 thing = new q7(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(116, 327, 150, 23);
		getContentPane().add(btnNewButton);
		
		JRadioButton b4 = new JRadioButton("How to celebrate diversity in everyday life");
		b4.setVerticalAlignment(SwingConstants.TOP);
		b4.setBounds(78, 241, 269, 23);
		getContentPane().add(b4);
		
		JLabel lblNewLabel = new JLabel("<html><center>What area would you most like to know more about?</center></html>");
		lblNewLabel.setBounds(91, 58, 200, 70);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b5 = new JRadioButton("Other");
		b5.setVerticalAlignment(SwingConstants.TOP);
		b5.setBounds(78, 267, 109, 23);
		getContentPane().add(b5);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b5.setSelected(false);
						arr[5] = "c1";
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
					arr[5] = "c2";
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
						arr[5] = "c3";
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
						arr[5] = "c4";
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
						arr[5] = "c";
					}
			}
			});
	}
}
