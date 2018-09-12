package Source;
import Source.Demo;
import Source.Customer;
import Source.Admin;
import Source.AdminLogin;
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
public class BusDetails extends JFrame implements ActionListener{
			Admin x;
			DefaultListModel model = new DefaultListModel();
			ResultSet s=null;
			DataAccess da = new DataAccess();
			BusDetails(){
				JFrame f1=new JFrame("Online Bus Ticketing System");
				f1.setSize(640,500);
				f1.setLayout(null);
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
				 f1.addWindowListener(new WindowAdapter() 
				{
					public void windowClosing(WindowEvent windowEvent){
					System.exit(0);
					}        
				});
				f1.add(b1);
				b1.setBounds(300,400,80,30);
				JButton b4= new JButton("Log Out");
				JMenuBar m1 = new JMenuBar();
				m1.add(Box.createRigidArea(new Dimension(550,70)));
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
				Demo d= new Demo();
				
            }
         }
	    );
				f1.add(m1);
				m1.setBounds(0,0,640,90);
				m1.add(b4);
				b4.setBounds(640,100,170,140);
				String sql="SELECT * FROM bus_info";
				s=da.getData(sql);
				
				try{
					while(s.next()){
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
					JList list = new JList(model);
					list.setVisibleRowCount(25);
					//list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					new JScrollPane(list);
					
					
					//statement.close();
					f1.add(list);
					list.setBounds(50,180,300,180);
				
			}
			catch(Exception ex){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
			}
				
				f1.setVisible(true);
            }
			
         
				
				
				
				

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

