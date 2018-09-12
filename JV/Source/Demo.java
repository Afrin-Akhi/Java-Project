package Source;

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
public class Demo extends JFrame implements ActionListener{
	Demo o;
	ResultSet s=null;
	//Admin x;
	DataAccess da = new DataAccess();
	DefaultListModel model = new DefaultListModel();
	private JFrame f1 = new JFrame();
	private Panel p1;
	
	public Demo(){
		prepareGui();
	}
	public Demo(Admin a){
		prepareGui();
	}
	public Demo(Customer b){
		prepareGui();
	}
	private void prepareGui(){
	  f1 = new JFrame("Online Bus Ticketing System");
      p1 = new Panel();
	  p1.setLayout(new FlowLayout());
	  
	  JMenuBar m1 = new JMenuBar();
	  m1.add(Box.createRigidArea(new Dimension(400,70)));
	  setJMenuBar(m1);
	  m1.setOpaque(true);
	  m1.setBackground(Color.black);
	  JButton b1 = new JButton("Admin Login");
	  JButton b2 = new JButton("Customer Login");
	  JButton b6=new JButton("Done");
	  b1.setBackground(new Color(255,69,0));
      b1.setForeground(Color.WHITE);
      b1.setFocusPainted(false);
      b1.setFont(new Font("Tahoma", Font.BOLD, 12));
	  b2.setBackground(new Color(255,69,0));
      b2.setForeground(Color.WHITE);
      b2.setFocusPainted(false);
      b2.setFont(new Font("Tahoma", Font.BOLD, 12));
	  m1.add(b1);
	  m1.add(b2);
	  
	  b1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Admin");
				f1.setVisible(false);
				Admin a=new Admin(o);
			 }
      }
	  );
	   b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Customer");
				f1.setVisible(false);
				Customer a=new Customer(o);
         }
      }
	  );
	  f1.setSize(640,500);
	  
	  f1.setLayout(new FlowLayout());
        //f1.add(m1, new GridBagConstraints());
      f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		}
	  );   
	  
	  b6.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Customer");
				f1.setVisible(false);
				Demo pp=new Demo();
         }
      }
	  );
	  f1.add(m1);
	  TextField tf1=new TextField("",35);
	  tf1.setSize(150,70);
	  JButton b5 = new JButton("Search");
	  b5.setBackground(new Color(255,69,0));
	  b5.setForeground(Color.WHITE);
      b5.setFocusPainted(false);
      b5.setFont(new Font("Tahoma", Font.BOLD, 12));
	  p1.add(b5);
	  
	  //b6.setBounds(250,600,80,30);
	  b5.addActionListener(
	  new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			  String sql="SELECT * FROM bus_info WHERE CompanyName='"+tf1.getText()+"'; ";
				s=da.getData(sql);
				
				try{
					while(s.next()){
					String busName= s.getString("CompanyName");
					String timing= s.getString("Timing");
					String source= s.getString("Source");
					String destination= s.getString("Destination");
					String seat= s.getString("SeatsOccupied");
					//int id= s.getInt("BusId");
					String z= busName+" at "+timing+" From "+source+" To "+destination+" Seats Occupied: "+seat;
					
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
					list.setBounds(50,170,500,380);
					
				
			}
			catch(Exception ex){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
			}
		  }
	  }
	  );
	  p1.add(tf1);
	  p1.add(b6);
	  f1.add(p1);
	  //f1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Presentation1.jpg")))));
	  setLayout(new BorderLayout());
	  JLabel background=new JLabel(new ImageIcon("G:\\Project\\Source\\Presentation2.jpg"));
	  f1.add(background);
	 // p1.add(Color.WHITE);
	  background.setLayout(new FlowLayout());
	  background.setSize(623,350);
	  f1.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}