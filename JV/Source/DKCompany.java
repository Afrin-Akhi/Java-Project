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

public class DKCompany extends JFrame implements ActionListener{
	Customer l;
	String time;
	String ShyamoliTime="12";
	String HanifTime="12";
	String HanifTime2="5";
	
	private Frame f1;
	DKCompany(String x){
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
				DKTiming d=new DKTiming();
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
		checkShyamoli(x);
		checkHanif(x);
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
	public void checkShyamoli(String o){
		if(o==ShyamoliTime){
			addShyamoliB();
		}
		else{
			//checkShohag(o);
		}
	}
	public void addShyamoliB(){
		JButton b1= new JButton("Shyamoli");
		b1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				System.out.println("Sh");
            }
         }
	    );
		f1.add(b1);
		b1.setBounds(250,100,150,70);
	}
	public void checkHanif(String o){
		if(o==HanifTime||o==HanifTime2){
			addHanifB();
		}
		else{
			f1.setVisible(false);
			DKTiming d=new DKTiming();
		}
	}
	public void addHanifB(){
		JButton b2= new JButton("Hanif");
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				System.out.println("H");
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