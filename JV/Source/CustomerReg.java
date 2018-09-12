package Source;
import Source.Demo;
import Source.Customer;
import Source.DataAccess;
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

import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerReg extends JFrame implements ActionListener{
	ResultSet s=null;
	CustomerReg r;
	DataAccess da = new DataAccess();
	
	public int ui=0;
	Customer l;
	public Frame f1;
	Label l0=new Label("User ID[Only 2 digits] ");
	JTextField tf0=new JTextField("",35);
	Label l1=new Label("Name ");
	JTextField tf1=new JTextField("",35);
	Label l2=new Label("E-Mail ");
	JTextField tf2=new JTextField("",35);
	Label l3=new Label("Password ");
	JTextField tf3=new JTextField("",35);
	
	
	
	CustomerReg(){
		
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		JButton b1= new JButton("Sign Up");
		JButton b2= new JButton("Cancel");
		//DataAccess da = new DataAccess(); 
		b1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Sign Up");
				//JOptionPane.showMessageDialog(null,"What is your name?", null);
				//JOptionPane.showMessageDialog(null,"You must provide a department no.");
				//MenuAction1 m=new MenuAction1(r);
				String sqli="SELECT * FROM customerinfo WHERE customerId='"+tf0.getText()+"'";
				s=da.getData(sqli);
				try{
					if(s.next()){
						f1.setVisible(false);
					Frame f3;
					f3 = new Frame("Online Bus Ticketing System");
					f3.setSize(640,480);
					f3.setLayout(null);
					Label l3i=new Label("USER ID NOT AVAILABLE");
					l3i.setFont(new Font("Courier", Font.BOLD, 20));
					f3.add(l3i);
					l3i.setBounds(210,100,300,230);
					JButton b3i= new JButton("Back");
					f3.add(b3i);
					b3i.setBounds(290,400,70,30);
					f3.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					b3i.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					f3.setVisible(false);
					CustomerReg uu=new CustomerReg();
					}
				}
					);
					f3.setVisible(true);}
				
				
				else{
				String sql="INSERT INTO customerinfo (customerId,Name, Email, Password) VALUES ('"+ tf0.getText() +"', '"+tf1.getText()+"', '"+
																tf2.getText()+"', '"+
																tf3.getText()+"');";
				System.out.println(sql);
				da.updateDB(sql);
				f1.setVisible(false);
				Customer tu=new Customer();
				}
								
				
		}
		catch(Exception exz3){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
        }
			}
			
	    );
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Cancel");
				f1.setVisible(false);
				Demo n=new Demo(l);
            }
         }
	    );
		f1.add(l0);
		l0.setBounds(50,100,120,30);
		f1.add(l1);
		l1.setBounds(50,150,80,30);
		f1.add(l2);
		l2.setBounds(50,200,80,30);
		f1.add(l3);
		l3.setBounds(50,250,80,30);
		f1.add(tf0);
		tf0.setBounds(240,100,170,30);
		f1.add(tf1);
		tf1.setBounds(170,150,170,30);
		f1.add(tf2);
		tf2.setBounds(170,200,170,30);
		f1.add(tf3);
		tf3.setBounds(170,250,170,30);
		f1.add(b1);
		b1.setBounds(50,350,80,30);
		f1.add(b2);
		b2.setBounds(170,350,80,30);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}


