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
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;


public class picture extends JFrame{
	
	private String[] arr;
	
	
	public picture(String[] arr1) {
		arr = arr1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		
		JButton btnNewButton = new JButton("Restart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				main thing;
				try {
					thing = new main();
					thing.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(135, 280, 112, 23);
		getContentPane().add(btnNewButton);
		
		if(arr[0].equals("c1"))
		{
			Image img = new ImageIcon(this.getClass().getResource("/q1c1.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(10,53,166,256);
			Image newImage = img.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
			getContentPane().add(lblNewLabel);
		}
		else if(arr[0].equals("c2"))
		{
			Image img = new ImageIcon(this.getClass().getResource("/q1c2.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(10,53,166,256);
			Image newImage = img.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
			getContentPane().add(lblNewLabel);
		}
		else if(arr[0].equals("c3"))
		{
			Image img = new ImageIcon(this.getClass().getResource("/q1c3.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(10,53,166,256);
			Image newImage = img.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
			getContentPane().add(lblNewLabel);
		}
		else if(arr[0].equals("c4"))
		{
			Image img = new ImageIcon(this.getClass().getResource("/q1c4.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(10,53,166,256);
			Image newImage = img.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
			getContentPane().add(lblNewLabel);
		}
		else
		{
			Image img = new ImageIcon(this.getClass().getResource("/q1c5.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(10,53,166,256);
			Image newImage = img.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
			getContentPane().add(lblNewLabel);
		}
			
		
		
		

		
	}
}
