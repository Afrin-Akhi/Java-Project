package Source;
import Source.Demo;
import Source.Customer;
import Source.Details;
import Source.BusSeat;
import Source.Bus;
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
public class CustomerLogin extends JFrame implements ActionListener{
	Customer l;
	int cid;
	ResultSet s=null;
	int id;
	//int cid;
	String name;
	String CompanyName;
	String Timing;
	String Source;
	String Destination;
	String[] tickets;
	//Customer ob;
	DefaultListModel model = new DefaultListModel();
	private Frame f1;
	JFrame f2 = new JFrame();
	CustomerLogin(Customer x){
		cid=x.cid;
		id=x.id;
		//BusSeat rr=new BusSeat();
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		JButton b1= new JButton("See Details");
		JButton b2= new JButton("Book Ticket");
		JButton b4= new JButton("Log Out");
		JMenuBar m1 = new JMenuBar();
		m1.add(Box.createRigidArea(new Dimension(400,70)));
	    setJMenuBar(m1);
	    m1.setOpaque(true);
	    m1.setBackground(Color.black);
		b4.setBackground(new Color(255,69,0));
        b4.setForeground(Color.WHITE);
        b4.setFocusPainted(false);
		b1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Details");
				f1.setVisible(false);
				
			
			JButton bc= new JButton("Log Out");
			JMenuBar m2 = new JMenuBar();
			m2.add(Box.createRigidArea(new Dimension(550,70)));
			setJMenuBar(m2);
			m2.setOpaque(true);
			m2.setBackground(Color.black);
			bc.setBackground(new Color(255,69,0));
			bc.setForeground(Color.WHITE);
			bc.setFocusPainted(false);
			bc.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				Demo d= new Demo();
				
            }
         }
	    );
		f2.add(m2);
		m2.setBounds(0,0,640,90);
		m2.add(bc);
		bc.setBounds(640,100,170,140);
		f2.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		f2.setLayout(null);
		f2.setSize(640,480);
		JButton b44=new JButton("Back");
		b44.setBackground(new Color(255,69,0));
		b44.setForeground(Color.WHITE);
		b44.setFocusPainted(false);
		b44.setFont(new Font("Tahoma", Font.BOLD, 12));
		b44.addActionListener(
		new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						//System.out.println("Logout");
							f1.setVisible(false);
					CustomerLogin ob=new CustomerLogin(x);}});
		f2.add(b44);
		b44.setBounds(300,400,80,30);
		DataAccess da=new DataAccess();
		String sql= "SELECT * FROM customerinfo WHERE customerId= '"+cid+"'";
		s=da.getData(sql);
		try{
			if(s.next()){
				name=s.getString("Name");
			}
		}
		catch(Exception ex){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		String sql1= "SELECT * FROM bus_info WHERE BusId= '"+id+"'";
		s=da.getData(sql1);
		try{
			if(s.next()){
				CompanyName=s.getString("CompanyName");
				Source=s.getString("Source");
				Destination=s.getString("Destination");
				Timing=s.getString("Timing");
			}
		}
		catch(Exception ex1){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		Label l1=new Label("Name: "+name);
		Label l2=new Label("Selected Bus: "+CompanyName);
		Label l3=new Label("Starts from: "+Source);
		Label l4=new Label("Destination: "+Destination);
		Label l5=new Label("Selected Timing: "+Timing);
		Label l6=new Label("Seats: ");
		String sql2= "SELECT SeatNo FROM bus_seat WHERE BusId= '"+id+"' AND customerId='"+cid+"'";
		s=da.getData(sql2);
		try{
			while(s.next()){
				String ezzz=s.getString("SeatNo");
				model.addElement(ezzz);
			}
			JList list = new JList(model);
			list.setVisibleRowCount(5);
			s.close();
			f2.add(list);
			list.setBounds(250,150,80,200);
		}
		catch(Exception ex2){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		
		f2.add(l1);
		l1.setBounds(50,100,280,30);
		f2.add(l2);
		l2.setBounds(50,150,280,30);
		f2.add(l3);
		l3.setBounds(50,200,280,30);
		f2.add(l4);
		l4.setBounds(50,250,280,30);
		f2.add(l5);
		l5.setBounds(50,300,280,30);
		f2.add(l6);
		l6.setBounds(250,120,70,30);
		
		f2.setVisible(true);
		
		
		
	//Details n=new Details(rr);
            }
         }
	    );
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Ticket");
				f1.setVisible(false);
				DropDown z= new DropDown(cid);
            }
         }
	    );
		b4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				f2.setVisible(false);
				Demo d= new Demo(l);
				
            }
         }
	    );
		
		
		f1.add(b1);
		b1.setBounds(250,100,150,70);
		f1.add(b2);
		b2.setBounds(250,220,150,70);
		f1.add(m1);
		m1.setBounds(0,0,640,90);
		m1.add(b4);
		b4.setBounds(640,100,170,140);
		f1.setVisible(true);
	}
	CustomerLogin(BusSeat y){
		id=y.id;
		cid=y.cid;
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		JButton b1= new JButton("See Details");
		JButton b2= new JButton("Book Ticket");
		JButton b4= new JButton("Log Out");
		JMenuBar m1 = new JMenuBar();
		m1.add(Box.createRigidArea(new Dimension(400,70)));
	    setJMenuBar(m1);
	    m1.setOpaque(true);
	    m1.setBackground(Color.black);
		b4.setBackground(new Color(255,69,0));
        b4.setForeground(Color.WHITE);
        b4.setFocusPainted(false);
		b1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Details");
				f1.setVisible(false);
				
			
			JButton bc= new JButton("Log Out");
			JMenuBar m2 = new JMenuBar();
			m2.add(Box.createRigidArea(new Dimension(550,70)));
			setJMenuBar(m2);
			m2.setOpaque(true);
			m2.setBackground(Color.black);
			bc.setBackground(new Color(255,69,0));
			bc.setForeground(Color.WHITE);
			bc.setFocusPainted(false);
			bc.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				Demo d= new Demo();
				
            }
         }
	    );
		f2.add(m2);
		m2.setBounds(0,0,640,90);
		m2.add(bc);
		bc.setBounds(640,100,170,140);
		f2.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		f2.setLayout(null);
		f2.setSize(640,480);
		
		DataAccess da=new DataAccess();
		String sql= "SELECT * FROM customerinfo WHERE customerId= '"+cid+"'";
		s=da.getData(sql);
		try{
			if(s.next()){
				name=s.getString("Name");
			}
		}
		catch(Exception ex){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		String sql1= "SELECT * FROM bus_info WHERE BusId= '"+id+"'";
		s=da.getData(sql1);
		try{
			if(s.next()){
				CompanyName=s.getString("CompanyName");
				Source=s.getString("Source");
				Destination=s.getString("Destination");
				Timing=s.getString("Timing");
			}
		}
		catch(Exception ex1){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		Label l1=new Label("Name: "+name);
		Label l2=new Label("Selected Bus: "+CompanyName);
		Label l3=new Label("Starts from: "+Source);
		Label l4=new Label("Destination: "+Destination);
		Label l5=new Label("Selected Timing: "+Timing);
		Label l6=new Label("Seats: ");
		String sql2= "SELECT SeatNo FROM bus_seat WHERE BusId= '"+id+"' AND customerId='"+cid+"'";
		s=da.getData(sql2);
		try{
			while(s.next()){
				String ezzz=s.getString("SeatNo");
				model.addElement(ezzz);
			}
			JList list = new JList(model);
			list.setVisibleRowCount(5);
			s.close();
			f2.add(list);
			list.setBounds(250,150,80,120);
		}
		catch(Exception ex2){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		
		f2.add(l1);
		l1.setBounds(50,100,280,30);
		f2.add(l2);
		l2.setBounds(50,150,280,30);
		f2.add(l3);
		l3.setBounds(50,200,280,30);
		f2.add(l4);
		l4.setBounds(50,250,280,30);
		f2.add(l5);
		l5.setBounds(50,300,280,30);
		f2.add(l6);
		l6.setBounds(250,120,70,30);
		
		f2.setVisible(true);
		
		
		
	//Details n=new Details(rr);
            }
         }
	    );
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Ticket");
				f1.setVisible(false);
				DropDown z= new DropDown(cid);
            }
         }
	    );
		b4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				f2.setVisible(false);
				Demo d= new Demo(l);
				
            }
         }
	    );
		
		
		f1.add(b1);
		b1.setBounds(250,100,150,70);
		f1.add(b2);
		b2.setBounds(250,220,150,70);
		f1.add(m1);
		m1.setBounds(0,0,640,90);
		m1.add(b4);
		b4.setBounds(640,100,170,140);
		f1.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}