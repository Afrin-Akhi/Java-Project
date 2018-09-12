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

public class DeleteBus extends JFrame implements ActionListener{
	ResultSet s=null;
	Admin x;
	DataAccess da = new DataAccess();
	DefaultListModel model = new DefaultListModel();
	
	public int ui=0;
	Customer l;
	public Frame f1;
	Label l0=new Label("Bus ID[Only 2 digits] ");
	JTextField tf0=new JTextField("",35);
	
	
	
	DeleteBus(){
		
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		JButton b1=new JButton("Back");
				b1.setBackground(new Color(255,69,0));
				b1.setForeground(Color.WHITE);
				b1.setFocusPainted(false);
				b1.setFont(new Font("Tahoma", Font.BOLD, 12));
				b1.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						//System.out.println("Logout");
							f1.setVisible(false);
					AdminLogin ob=new AdminLogin(x);}});
		JButton b2=new JButton("Delete");
				b2.setBackground(new Color(255,69,0));
				b2.setForeground(Color.WHITE);
				b2.setFocusPainted(false);
				b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		JButton b3=new JButton("Search");
				b3.setBackground(new Color(255,69,0));
				b3.setForeground(Color.WHITE);
				b3.setFocusPainted(false);
				b3.setFont(new Font("Tahoma", Font.BOLD, 12));
				b2.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						//System.out.println("Logout");
							String sql1="SELECT * FROM bus_seat WHERE BusId='"+tf0.getText()+"'";
							s=da.getData(sql1);
							try{
								if(s.next()){
									String sqlee="DELETE FROM bus_seat WHERE BusId='"+tf0.getText()+"'";
									da.updateDB(sqlee);
								}
							}
							catch(Exception exz){
								System.out.println("DB Read Error !");
								//ex.printStackTrace();
							}
							String sql2="SELECT * FROM bus_info WHERE BusId='"+tf0.getText()+"'";
							s=da.getData(sql2);
							try{
								if(s.next()){
									String sqlee2="DELETE FROM bus_info WHERE BusId='"+tf0.getText()+"'";
									da.updateDB(sqlee2);
								}
							}
							catch(Exception exz2){
								System.out.println("DB Read Error !");
								//ex.printStackTrace();
							}
							}
					}
					
					);
		JButton b4= new JButton("Log Out");
		JMenuBar m1 = new JMenuBar();
		m1.add(Box.createRigidArea(new Dimension(400,70)));
	    setJMenuBar(m1);
	    m1.setOpaque(true);
	    m1.setBackground(Color.black);
		b4.setBackground(new Color(255,69,0));
        b4.setForeground(Color.WHITE);
        b4.setFocusPainted(false);
		b4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				Demo d= new Demo(l);
				
            }
         }
	    );
		b3.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e){
					String sql="SELECT * FROM bus_info WHERE BusId='"+tf0.getText()+"'";
				s=da.getData(sql);
				
				try{
					if(s.next()){
					String busName= s.getString("CompanyName");
					String timing= s.getString("Timing");
					String seat= s.getString("SeatsOccupied");
					//int id= s.getInt("BusId");
					String z= busName+" "+timing+" Seats Occupied: "+seat;
					
					//Bus k=new Bus(busName,timing,seat,id,cid);
					//i++;
					//busList.add(k);
					model.addElement(z);
					
					
				}
				else{
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3i=new Label("Not In the Database");
					l3i.setFont(new Font("Courier", Font.BOLD, 20));
					f2.add(l3i);
					l3i.setBounds(210,100,300,230);
					JButton b3i= new JButton("Back");
					f2.add(b3i);
					b3i.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					b3i.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					f2.setVisible(false);
					DeleteBus jj=new DeleteBus();
            }
         }
	    );
					f2.setVisible(true);
				}
					JList list = new JList(model);
					list.setVisibleRowCount(25);
					//list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					new JScrollPane(list);
					
					
					//statement.close();
					f1.add(list);
					list.setBounds(50,200,300,180);
				
			}
			catch(Exception ex){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
			}
				}
			}
		);
		
		f1.add(b1);
		b1.setBounds(300,400,80,30);
		f1.add(b2);
		b2.setBounds(100,400,80,30);
		f1.add(b3);
		b3.setBounds(450,150,80,30);
		f1.add(m1);
		m1.setBounds(0,0,640,90);
		m1.add(b4);
		b4.setBounds(640,100,170,140);
		f1.add(l0);
		l0.setBounds(250,100,120,30);
		f1.add(tf0);
		tf0.setBounds(240,150,170,30);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}


