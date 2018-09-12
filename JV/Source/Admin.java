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

import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Admin extends JFrame implements ActionListener{
	Admin o;
	Demo x;
	ResultSet s=null;
	private Frame f1;
	Label l1=new Label("User Name: ");
	TextField tf1=new TextField("",30);
	Label l2=new Label("Password: ");
	TextField tf2=new TextField("",30);
	//private Panel p1;
	Admin(Demo d){
		//System.out.println("Admin");
		f1 = new Frame("Online Bus Ticketing System");
		//p1 = new Panel();
        //p1.setLayout(new FlowLayout());
		//p1.setBackground(Color.magenta);
		
		//tf2.setEchoChar("*");
		JButton b1= new JButton("Ok");
		JButton b2= new JButton("Cancel");
		
		b1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("OK");
				
				DataAccess da = new DataAccess(); 
				
				//"SELECT user name FROM admininfo WHERE id = 101;"
				String sql="SELECT * FROM admininfo WHERE username='"+tf1.getText()+"' and password='"+
																tf2.getText()+"';";
			System.out.println(sql);
			s=da.getData(sql);
			
				//f1.setVisible(false);
				//AdminLogin a=new AdminLogin(o);
				try{
					if(s.next())
				{
					f1.setVisible(false);
					AdminLogin a=new AdminLogin(o);
				}
				else{
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Not An Admin");
					l3.setFont(new Font("Courier", Font.BOLD, 36));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton b3= new JButton("Back");
					f2.add(b3);
					b3.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					b3.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					f2.setVisible(false);
					Admin t=new Admin(x);
            }
         }
	    );
					f2.setVisible(true);
					
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
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		
		
		f1.add(l1);
		l1.setBounds(50,100,80,30);
		f1.add(tf1);
		tf1.setBounds(170,100,170,30);
		f1.add(l2);
		l2.setBounds(50,150,80,30);
		
		f1.add(tf2);
		tf2.setBounds(170,150,170,30);
		f1.add(b1);
		b1.setBounds(50,250,80,30);
		f1.add(b2);
		b2.setBounds(170,250,80,30);
		
		
		f1.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
