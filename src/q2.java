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


public class q2 extends JFrame{
	
	private String[] arr;
	
	
	public q2(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("<html>Successful neurodivergent people overcome challeneges with neurodiversity through innate talent, hard work, family social status, and support from others.</html>");
		b1.setVerticalAlignment(SwingConstants.TOP);
		
		
		b1.setBounds(21, 121, 350, 51);
		getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("<html>They achieve success by harnessing the unique strengths of their neurodivergence (Strength-Based Model of Neurodiversity).</html>");
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBounds(21, 175, 350, 37);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("<html>Some think they were fortunate to be in environments that suits their traits (Social Model)</html>");
		b3.setVerticalAlignment(SwingConstants.TOP);
		b3.setBounds(21, 215, 350, 37);
		getContentPane().add(b3);
		
		JButton btnNewButton = new JButton("Next Question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q3 thing = new q3(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(116, 327, 150, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<html> <center>" + "There are various views regarding the reasons for the success of a neurodivergent people.Which perspective resonates with you the most? And how do you think a neurodivergent person can succeed in life?" + "</center></html");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 33, 322, 81);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b4 = new JRadioButton("<html> <center>" + "Other" + "</center></html");
		b4.setVerticalAlignment(SwingConstants.TOP);
		b4.setBounds(21, 255, 350, 23);
		getContentPane().add(b4);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						arr[1] = "c1";
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
					arr[1] = "c2";
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
						arr[1] = "c3";
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
						arr[1] = "c";
					}
			}
			});
	}
}
