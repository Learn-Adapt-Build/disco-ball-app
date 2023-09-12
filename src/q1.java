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


public class q1 extends JFrame{
	
	private String[] arr;
	
	
	public q1(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("Self Advocate");
		
		
		b1.setBounds(136, 110, 120, 23);
		getContentPane().add(b1);
		
		JRadioButton b6 = new JRadioButton("Other");
		b6.setBounds(136, 235, 120, 23);
		getContentPane().add(b6);
		
		JButton btnNewButton = new JButton("Next Question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q2 thing = new q2(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(116, 280, 150, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("What is your primary relation to neurodiversity:");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 63, 300, 23);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b2 = new JRadioButton("Family Member");
		b2.setBounds(136, 135, 120, 23);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("Researcher/Scholar");
		b3.setBounds(136, 160, 212, 23);
		getContentPane().add(b3);
		
		JRadioButton b4 = new JRadioButton("Policy Maker");
		b4.setBounds(136, 185, 120, 23);
		getContentPane().add(b4);
		
		JRadioButton b5 = new JRadioButton("General Public");
		b5.setBounds(136, 210, 120, 23);
		getContentPane().add(b5);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b6.setSelected(false);
						arr[0] = "c1";
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
						arr[0] = "c2";
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
						arr[0] = "c3";
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
						arr[0] = "c4";
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
						arr[0] = "c";
					}
			}
			});
	}
}
