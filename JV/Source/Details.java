package Source;
import Source.Demo;
import Source.Customer;
import Source.DataAccess;
import Source.Bus;
import Source.BusSeat;
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
import java.util.ArrayList;
import javax.imageio.ImageIO;
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

public class Details extends JFrame implements ActionListener,ItemListener{
	ResultSet s=null;
	int id;
	int cid;
	String name;
	String CompanyName;
	String Timing;
	String Source;
	String Destination;
	String[] tickets;
	Customer ob;
	DefaultListModel model = new DefaultListModel();
	Details(BusSeat u){
		id=u.id;
		cid=u.cid;
		JFrame f1 = new JFrame();
		JButton bc= new JButton("Log Out");
		JMenuBar m1 = new JMenuBar();
		m1.add(Box.createRigidArea(new Dimension(550,70)));
	    setJMenuBar(m1);
	    m1.setOpaque(true);
	    m1.setBackground(Color.black);
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
		f1.add(m1);
		m1.setBounds(0,0,640,90);
		m1.add(bc);
		bc.setBounds(640,100,170,140);
		f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		f1.setLayout(null);
		f1.setSize(640,480);
		
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
		Label l6=new Label("Selected Seat: ");
		String sql2= "SELECT SeatNo FROM bus_seat WHERE BusId= '"+id+"' AND customerId='"+cid+"'";
		s=da.getData(sql2);
		try{
			while(s.next()){
				String e=s.getString("SeatNo");
				model.addElement(e);
			}
			JList list = new JList(model);
			list.setVisibleRowCount(5);
			s.close();
			f1.add(list);
			list.setBounds(120,350,200,200);
		}
		catch(Exception ex2){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		
		f1.add(l1);
		l1.setBounds(50,100,280,30);
		f1.add(l2);
		l2.setBounds(50,150,280,30);
		f1.add(l3);
		l3.setBounds(50,200,280,30);
		f1.add(l4);
		l4.setBounds(50,250,280,30);
		f1.add(l5);
		l5.setBounds(50,300,280,30);
		f1.add(l6);
		l6.setBounds(50,350,280,30);
		
		f1.setVisible(true);
		
		
		
	}
	
	public void itemStateChanged(ItemEvent arg) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}