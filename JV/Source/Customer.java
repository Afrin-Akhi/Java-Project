package Source;
import Source.Demo;
import Source.Admin;
import Source.CustomerLogin;
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
public class Customer extends JFrame implements ActionListener{
	private Frame f1;
	Customer o;
	int cid;
	int id;
	String name;
	String email;
	String ticketId;
	DataAccess da = new DataAccess();
	ResultSet s=null;	
	//private Panel p1;
	Customer(){
		prepareGUI1();
	}
	Customer(int jj){
		
	}
	Customer(Demo d){
		prepareGUI1();
		
	}
	private void prepareGUI1(){
		//System.out.println("Customer");
		f1 = new Frame("Online Bus Ticketing System");
		Label l1=new Label("E-Mail: ");
		TextField tf1=new TextField("",35);
		Label l2=new Label("Password: ");
		TextField tf2=new TextField("",35);
		
		//p1 = new Panel();
        //p1.setLayout(new FlowLayout());
		//p1.setBackground(Color.magenta);
		
		//tf2.setEchoChar("*");
		JButton b1= new JButton("Login");
		JButton b2= new JButton("Cancel");
		JButton b3=new JButton("Need to open an Account?");
		b1.setBorder(new RoundedBorder(10));
		b2.setBorder(new RoundedBorder(10));
		b3.setBorder(new RoundedBorder(10));
		b1.setBackground(new Color(255,69,0));
        b1.setForeground(Color.WHITE);
        b1.setFocusPainted(false);
	    b2.setBackground(new Color(255,69,0));
        b2.setForeground(Color.WHITE);
        b2.setFocusPainted(false);
	    b3.setBackground(new Color(255,69,0));
        b3.setForeground(Color.WHITE);
        b3.setFocusPainted(false);
		b1.addActionListener(
		new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("OK");
				
				
				
				//"SELECT user name FROM admininfo WHERE id = 101;"
				String sql="SELECT * FROM customerinfo WHERE Email='"+tf1.getText()+"' and Password='"+
																tf2.getText()+"'";
			System.out.println(sql);
			s=da.getData(sql);
			
				//f1.setVisible(false);
				//AdminLogin a=new AdminLogin(o);
				try{
					if(s.next())
				{
					
					Customer ob=new Customer(1);
					ob.cid= s.getInt("customerId");
					ob.name= s.getString("Name");
					ob.email= s.getString("Email");
					String sql9="SELECT * FROM ticketinfo WHERE customerId='"+ob.cid+"'";
					s=da.getData(sql9);
					try{
						if(s.next()){
							ob.id=s.getInt("BusId");
							
						}
					}
					catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
				f1.setVisible(false);
				CustomerLogin n=new CustomerLogin(ob);	
					
					
				}
				else{
					f1.setVisible(false);
					CustomerReg u=new CustomerReg();
					
				}
         }
			catch(Exception ex){
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
				Demo n=new Demo(o);
         }
      }
	  );
	  b3.addActionListener(
			new ActionListener(){
					public void actionPerformed(ActionEvent e){
						//System.out.println("Sign Up");
						f1.setVisible(false);
						CustomerReg a=new CustomerReg();
					}
			}
	  );
		f1.setSize(640,480);
	    f1.setLayout(null);

        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		
		//Label l3=new Label("E-Mail: ");
		//TextField tf3=new TextField("",35);
		f1.add(l1);
		l1.setBounds(50,100,80,30);
		f1.add(tf1);
		tf1.setBounds(170,100,170,30);
		f1.add(l2);
		l2.setBounds(50,150,80,30);
		f1.add(tf2);
		tf2.setBounds(170,150,170,30);
		//f1.add(l3);
		//l3.setBounds(50,200,80,30);
		//f1.add(tf3);
		//tf3.setBounds(170,200,170,30);
		f1.add(b1);
		b1.setBounds(50,250,80,30);
		f1.add(b2);
		b2.setBounds(170,250,80,30);
		f1.add(b3);
		b3.setBounds(50,300,200,100);
		//f1.setBackground(new Color(204,204,255));
		
		f1.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}