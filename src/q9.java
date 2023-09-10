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


public class q9 extends JFrame{
	
	private String[] arr;
	
	
	public q9(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("<html>I will attend if I do not have to pay for it</html>");
		
		
		b1.setBounds(52, 135, 240, 23);
		getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("<html>I would participate again since I got a lot of value out of this conference</html>");
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBounds(52, 161, 287, 37);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("<html>I am interested in participating in a similar event because I saw its topic's connection to the bigger picture</html>");
		b3.setVerticalAlignment(SwingConstants.TOP);
		b3.setBounds(52, 201, 326, 37);
		getContentPane().add(b3);
		
		JButton btnNewButton = new JButton("Next Question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q10 thing = new q10(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(116, 327, 150, 23);
		getContentPane().add(btnNewButton);
		
		JRadioButton b4 = new JRadioButton("<html>I would not participate in a similar symposium</html>");
		b4.setBounds(52, 241, 311, 23);
		getContentPane().add(b4);
		
		JLabel lblNewLabel = new JLabel("<html><center>Under what circumstances would you participate in a symposium like this in the future?</center></html>");
		lblNewLabel.setBounds(91, 58, 200, 70);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b5 = new JRadioButton("Other");
		b5.setBounds(52, 267, 109, 23);
		getContentPane().add(b5);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b5.setSelected(false);
						arr[8] = "c1";
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
					arr[8] = "c2";
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
						arr[8] = "c3";
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
						arr[8] = "c4";
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
						arr[8] = "c";
					}
			}
			});
	}
}
