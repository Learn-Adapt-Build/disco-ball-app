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
		setLocationRelativeTo(null);
		
		
		JButton btnNewButton = new JButton("Restart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				main thing;
				try {
					thing = new main();
					thing.setVisible(true);
					thing.setLocationRelativeTo(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(135, 327, 112, 23);
		getContentPane().add(btnNewButton);
		
		JLabel img1 = new JLabel("");
		img1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img1.setBounds(0, 0, 384, 316);
		getContentPane().add(img1);
		JLabel img2 = new JLabel("");
		img2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img2.setBounds(0, 0, 384, 316);
		getContentPane().add(img2);
		JLabel img3 = new JLabel("");
		img3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img3.setBounds(0, 0, 384, 316);
		getContentPane().add(img3);
		JLabel img4 = new JLabel("");
		img4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img4.setBounds(0, 0, 384, 316);
		getContentPane().add(img4);
		JLabel img5 = new JLabel("");
		img5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q5.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img5.setBounds(0, 0, 384, 316);
		getContentPane().add(img5);
		JLabel img6 = new JLabel("");
		img6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q6.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img6.setBounds(0, 0, 384, 316);
		getContentPane().add(img6);
		JLabel img7 = new JLabel("");
		img7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q7.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img7.setBounds(0, 0, 384, 316);
		getContentPane().add(img7);
		JLabel img8 = new JLabel("");
		img8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q8.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img8.setBounds(0, 0, 384, 316);
		getContentPane().add(img8);
		JLabel img9 = new JLabel("");
		img9.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q9.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img9.setBounds(0, 0, 384, 316);
		getContentPane().add(img9);
		JLabel img10 = new JLabel("");
		img10.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q10.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img10.setBounds(0, 0, 384, 316);
		getContentPane().add(img10);
		JLabel img11 = new JLabel("");
		img11.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q11.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img11.setBounds(0, 0, 384, 316);
		getContentPane().add(img11);
		JLabel img12 = new JLabel("");
		img12.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q12.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		img12.setBounds(0, 0, 384, 316);
		getContentPane().add(img12);
		
		if(arr[0].equals("c1"))
		{
			img1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q1c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[0].equals("c2"))
		{
			img1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q1c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[0].equals("c3"))
		{
			img1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q1c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[0].equals("c4"))
		{
			img1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q1c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[0].equals("c5"))
		{
			img1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q1c5.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q2
		if(arr[1].equals("c1"))
		{
			img2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q2c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[1].equals("c2"))
		{
			img2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q2c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[1].equals("c3"))
		{
			img2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q2c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q3
		if(arr[2].equals("c1"))
		{
			img3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q3c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[2].equals("c2"))
		{
			img3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q3c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[2].equals("c3"))
		{
			img3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q3c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[2].equals("c4"))
		{
			img3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q3c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q4
		if(arr[3].equals("c1"))
		{
			img4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q4c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[3].equals("c2"))
		{
			img4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q4c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[3].equals("c3"))
		{
			img4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q4c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[3].equals("c4"))
		{
			img4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q4c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[3].equals("c5"))
		{
			img4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q4c5.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q5
		if(arr[4].equals("c1"))
		{
			img5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q5c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[4].equals("c2"))
		{
			img5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q5c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[4].equals("c3"))
		{
			img5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q5c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[4].equals("c4"))
		{
			img5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q5c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q6
		if(arr[5].equals("c1"))
		{
			img6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q6c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[5].equals("c2"))
		{
			img6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q6c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[5].equals("c3"))
		{
			img6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q6c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[5].equals("c4"))
		{
			img6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q6c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q7
		if(arr[6].equals("c1"))
		{
			img7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q7c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[6].equals("c2"))
		{
			img7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q7c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[6].equals("c3"))
		{
			img7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q7c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[6].equals("c4"))
		{
			img7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q7c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q8
		if(arr[7].equals("c1"))
		{
			img8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q8c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[7].equals("c2"))
		{
			img8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q8c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[7].equals("c3"))
		{
			img8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q8c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[7].equals("c4"))
		{
			img8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q8c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q9
		if(arr[8].equals("c1"))
		{
			img9.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q9c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[8].equals("c2"))
		{
			img9.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q9c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[8].equals("c3"))
		{
			img9.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q9c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[8].equals("c4"))
		{
			img9.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q9c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q10
		if(arr[9].equals("c1"))
		{
			img10.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q10c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[9].equals("c2"))
		{
			img10.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q10c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[9].equals("c3"))
		{
			img10.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q10c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[9].equals("c4"))
		{
			img10.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q10c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q11
		if(arr[10].equals("c1"))
		{
			img11.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q11c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[10].equals("c2"))
		{
			img11.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q11c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[10].equals("c3"))
		{
			img11.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q11c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[10].equals("c4"))
		{
			img11.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q11c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		//Q12
		if(arr[11].equals("c1"))
		{
			img12.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q12c1.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[11].equals("c2"))
		{
			img12.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q12c2.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[11].equals("c3"))
		{
			img12.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q12c3.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
		else if(arr[11].equals("c4"))
		{
			img12.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q12c4.png")).getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		}
	}
}
