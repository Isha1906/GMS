package com.gms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Front extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front frame = new Front();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Front() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 424);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(224, 123, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("");
		lbl.setIcon(new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\picture(gms).jpg"));
		lbl.setBounds(93, 115, 400, 200);
		contentPane.add(lbl);
		
		JLabel lbl1 = new JLabel("Grocery Managemnet System");
		lbl1.setForeground(new Color(255, 255, 255));
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lbl1.setVerticalAlignment(SwingConstants.TOP);
		lbl1.setBounds(116, 50, 361, 41);
		contentPane.add(lbl1);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				category c=new category();
				c.show();
				dispose();
			}
		});
		btnNext.setVerticalAlignment(SwingConstants.TOP);
		btnNext.setFont(new Font("Yu Mincho Light", Font.BOLD, 13));
		btnNext.setBackground(new Color(128, 128, 255));
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.setBounds(228, 339, 89, 23);
		contentPane.add(btnNext);
	}
}
