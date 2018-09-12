package Source;
import Source.Demo;
import Source.Customer;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.*;

public class DCCompany extends JFrame implements ActionListener{
	Customer l;
	String time;
	String GreenLineTime="8";
	String GreenLineTime2="3";
	String ShohagTime="3";
	
	private Frame f1;
	DCCompany(String x){
		time=x;
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		
		JButton b3= new JButton("Back");
		JButton b4= new JButton("Log Out");
		JMenuBar m1 = new JMenuBar();
		m1.add(Box.createRigidArea(new Dimension(400,70)));
	    setJMenuBar(m1);
	    m1.setOpaque(true);
	    m1.setBackground(Color.black);
		b4.setBackground(new Color(255,69,0));
        b4.setForeground(Color.WHITE);
        b4.setFocusPainted(false);
		
		b3.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Ticket");
				f1.setVisible(false);
				DCTiming d=new DCTiming();
            }
         }
	    );
		b4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				Demo d= new Demo(l);
				
            }
         }
	    );
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		Label l1=new Label("Select Timing ");
		l1.setFont(new Font("Courier", Font.BOLD, 36));
		checkGreenLine(x);
		checkShohag(x);
		f1.add(b3);
		b3.setBounds(290,300,70,30);
		f1.add(l1);
		l1.setBounds(210,290,300,230);
		f1.add(m1);
		m1.setBounds(0,0,640,90);
		m1.add(b4);
		b4.setBounds(640,100,170,140);
		f1.setVisible(true);
		
	}
	public void checkGreenLine(String o){
		if(o==GreenLineTime||o==GreenLineTime2){
			addGreenLineB();
		}
		else{
			//checkShohag(o);
		}
	}
	public void addGreenLineB(){
		JButton b1= new JButton("Green Line");
		b1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				System.out.println("G");
            }
         }
	    );
		f1.add(b1);
		b1.setBounds(250,100,150,70);
	}
	public void checkShohag(String o){
		if(o==ShohagTime){
			addShohagB();
		}
		else{
			f1.setVisible(false);
			DCTiming d=new DCTiming();
		}
	}
	public void addShohagB(){
		JButton b2= new JButton("Shohag");
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				System.out.println("S");
            }
         }
	    );
		f1.add(b2);
		b2.setBounds(250,220,150,70);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}