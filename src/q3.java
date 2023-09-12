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


public class q3 extends JFrame{
	
	private String[] arr;
	
	
	public q3(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("<html>Accessing services</html>");
		b1.setVerticalAlignment(SwingConstants.TOP);
		
		
		b1.setBounds(109, 131, 173, 23);
		getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("<html>Being accepted by society</html>");
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBounds(109, 156, 240, 23);
		getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("<html>Accommodation for being different</html>");
		b3.setVerticalAlignment(SwingConstants.TOP);
		b3.setBounds(109, 181, 269, 23);
		getContentPane().add(b3);
		
		JButton btnNewButton = new JButton("Next Question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				q4 thing = new q4(arr);
				thing.setVisible(true);
			}
		});
		btnNewButton.setBounds(116, 279, 150, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<html><center>" + "From your own experiences, what is currently the most important aspects of improving lives?"+ "</center></html>");
		lblNewLabel.setBounds(92, 56, 200, 68);
		getContentPane().add(lblNewLabel);
		
		JRadioButton b4 = new JRadioButton("<html>Celebrating neurodiversity</html>");
		b4.setVerticalAlignment(SwingConstants.TOP);
		b4.setBounds(109, 206, 240, 23);
		getContentPane().add(b4);
		
		JRadioButton b5 = new JRadioButton("Other");
		b5.setVerticalAlignment(SwingConstants.TOP);
		b5.setBounds(109, 231, 110, 23);
		getContentPane().add(b5);
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
					{
						b2.setSelected(false);
						b3.setSelected(false);
						b4.setSelected(false);
						b5.setSelected(false);
						arr[2] = "c1";
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
					arr[2] = "c2";
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
						arr[2] = "c3";
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
						arr[2] = "c4";
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
						arr[2] = "c";
					}
			}
			});
	}
}
