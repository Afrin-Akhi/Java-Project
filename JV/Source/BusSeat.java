package Source;
import Source.Demo;
import Source.Customer;
import Source.CustomerLogin;
import Source.DataAccess;
import Source.Bus;
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

public class BusSeat extends JFrame implements ActionListener , ItemListener{
	ResultSet s=null;
	Customer t;
	public int i=0;
	public int j=0;
	int id;
	int cid;
	int tid;
	DataAccess da=new DataAccess();
	
	BusSeat(){
		
	}
	BusSeat(Bus x){
		
		
		id=x.id;
		cid=x.cid;
		
		
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
	JCheckBox b1= new JCheckBox("A1");
	JCheckBox b2= new JCheckBox("A2");
	JCheckBox b3= new JCheckBox("A3");
	JCheckBox b4= new JCheckBox("A4");
	JCheckBox b5= new JCheckBox("B1");
	JCheckBox b6= new JCheckBox("B2");
	JCheckBox b7= new JCheckBox("B3");
	JCheckBox b8= new JCheckBox("B4");
	JCheckBox b9= new JCheckBox("C1");
	JCheckBox b10= new JCheckBox("C2");
	JCheckBox b11= new JCheckBox("C3");
	JCheckBox b12= new JCheckBox("C4");
	JCheckBox b13= new JCheckBox("D1");
	JCheckBox b14= new JCheckBox("D2");
	JCheckBox b15= new JCheckBox("D3");
	JCheckBox b16= new JCheckBox("D4");
	JCheckBox b17= new JCheckBox("E1");
	JCheckBox b18= new JCheckBox("E2");
	JCheckBox b19= new JCheckBox("E3");
	JCheckBox b20= new JCheckBox("E4");
	JCheckBox b21= new JCheckBox("F1");
	JCheckBox b22= new JCheckBox("F2");
	JCheckBox b23= new JCheckBox("F3");
	JCheckBox b24= new JCheckBox("F4");
	JCheckBox b25= new JCheckBox("G1");
	JCheckBox b26= new JCheckBox("G2");
	JCheckBox b27= new JCheckBox("G3");
	JCheckBox b28= new JCheckBox("G4");
	JCheckBox b29= new JCheckBox("H1");
	JCheckBox b30= new JCheckBox("H2");
	JCheckBox b31= new JCheckBox("H3");
	JCheckBox b32= new JCheckBox("H4");
	JCheckBox b33= new JCheckBox("I1");
	JCheckBox b34= new JCheckBox("I2");
	JCheckBox b35= new JCheckBox("I3");
	JCheckBox b36= new JCheckBox("I4");
	JCheckBox b37= new JCheckBox("J1");
	JCheckBox b38= new JCheckBox("J2");
	JCheckBox b39= new JCheckBox("J3");
	JCheckBox b40= new JCheckBox("J4");
	f1.setLayout(null);
	f1.setSize(640,480);
	f1.add(b1);
	b1.setBounds(50,110,70,30);
	String sqlx= "SELECT * FROM bus_seat WHERE SeatNo='A1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx);
	try{
		if(s.next()){
		b1.setSelected(true);
	}}
	catch(Exception exz1){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	
	f1.add(b2);
	b2.setBounds(140,110,70,30);
	String sqlx1= "SELECT * FROM bus_seat WHERE SeatNo='A2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx1);
	try{
		if(s.next()){
		b2.setSelected(true);
	}
	}
	catch(Exception exz2){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b3);
	b3.setBounds(260,110,70,30);
	String sqlx2= "SELECT * FROM bus_seat WHERE SeatNo='A3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx2);
	try{
		if(s.next()){
		b3.setSelected(true);
		}}
	catch(Exception exz3){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b4);
	b4.setBounds(350,110,70,30);
	String sqlx3= "SELECT * FROM bus_seat WHERE SeatNo='A4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx3);
	try{
		if(s.next()){
		b4.setSelected(true);
	}}
	catch(Exception exz4){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b5);
	b5.setBounds(50,130,70,30);
	String sqlx4= "SELECT * FROM bus_seat WHERE SeatNo='B1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx4);
	try{
		if(s.next()){
		b5.setSelected(true);
	}}
	catch(Exception exz5){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b6);
	b6.setBounds(140,130,70,30);
	String sqlx5= "SELECT * FROM bus_seat WHERE SeatNo='B2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx5);
	try{
		if(s.next()){
		b6.setSelected(true);
	}}
	catch(Exception exz6){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b7);
	b7.setBounds(260,130,70,30);
	String sqlx6= "SELECT * FROM bus_seat WHERE SeatNo='B3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx6);
	try{
		if(s.next()){
		b7.setSelected(true);
	}}
	catch(Exception exz7){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b8);
	b8.setBounds(350,130,70,30);
	String sqlx7= "SELECT * FROM bus_seat WHERE SeatNo='B4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx7);
	try{
		if(s.next()){
		b8.setSelected(true);
	}}
	catch(Exception exz8){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b9);
	b9.setBounds(50,150,70,30);
	String sqlx9= "SELECT * FROM bus_seat WHERE SeatNo='C1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx9);
	try{
		if(s.next()){
		b9.setSelected(true);
	}}
	catch(Exception exz9){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b10);
	b10.setBounds(140,150,70,30);String sqlx10= "SELECT * FROM bus_seat WHERE SeatNo='C2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx10);
	try{
		if(s.next()){
		b10.setSelected(true);
	}}
	catch(Exception exz10){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b11);
	b11.setBounds(260,150,70,30);
	String sqlx11= "SELECT * FROM bus_seat WHERE SeatNo='C3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx11);
	try{
		if(s.next()){
		b11.setSelected(true);
	}}
	catch(Exception exz11){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b12);
	b12.setBounds(350,150,70,30);
	String sqlx12= "SELECT * FROM bus_seat WHERE SeatNo='C4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx12);
	try{
		if(s.next()){
		b12.setSelected(true);
	}}
	catch(Exception exz12){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b13);
	b13.setBounds(50,170,70,30);
	String sqlx13= "SELECT * FROM bus_seat WHERE SeatNo='D1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx13);
	try{
		if(s.next()){
		b13.setSelected(true);
	}}
	catch(Exception exz13){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b14);
	b14.setBounds(140,170,70,30);
	String sqlx14= "SELECT * FROM bus_seat WHERE SeatNo='D2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx14);
	try{
		if(s.next()){
		b14.setSelected(true);
	}}
	catch(Exception exz14){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b15);
	b15.setBounds(260,170,70,30);
	String sqlx15= "SELECT * FROM bus_seat WHERE SeatNo='D3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx15);
	try{
		if(s.next()){
		b15.setSelected(true);
	}}
	catch(Exception exz15){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b16);
	b16.setBounds(350,170,70,30);
	String sqlx16= "SELECT * FROM bus_seat WHERE SeatNo='D4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx16);
	try{
		if(s.next()){
		b16.setSelected(true);
	}}
	catch(Exception exz16){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b17);
	b17.setBounds(50,190,70,30);
	String sqlx17= "SELECT * FROM bus_seat WHERE SeatNo='E1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx17);
	try{
		if(s.next()){
		b17.setSelected(true);
	}}
	catch(Exception exz17){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b18);
	b18.setBounds(140,190,70,30);
	String sqlx18= "SELECT * FROM bus_seat WHERE SeatNo='E2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx18);
	try{
		if(s.next()){
		b18.setSelected(true);
	}}
	catch(Exception exz18){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b19);
	b19.setBounds(260,190,70,30);
	String sqlx19= "SELECT * FROM bus_seat WHERE SeatNo='E3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx19);
	try{
		if(s.next()){
		b19.setSelected(true);
	}}
	catch(Exception exz19){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b20);
	b20.setBounds(350,190,70,30);
	String sqlx20= "SELECT * FROM bus_seat WHERE SeatNo='E4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx20);
	try{
		if(s.next()){
		b20.setSelected(true);
	}}
	catch(Exception exz20){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b21);
	b21.setBounds(50,210,70,30);
	String sqlx21= "SELECT * FROM bus_seat WHERE SeatNo='F1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx21);
	try{
		if(s.next()){
		b21.setSelected(true);
	}}
	catch(Exception exz21){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b22);
	b22.setBounds(140,210,70,30);
	String sqlx22= "SELECT * FROM bus_seat WHERE SeatNo='F2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx22);
	try{
		if(s.next()){
		b22.setSelected(true);
	}}
	catch(Exception exz22){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b23);
	b23.setBounds(260,210,70,30);
	String sqlx23= "SELECT * FROM bus_seat WHERE SeatNo='F3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx23);
	try{
		if(s.next()){
		b23.setSelected(true);
	}}
	catch(Exception exz23){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b24);
	b24.setBounds(350,210,70,30);
	String sqlx24= "SELECT * FROM bus_seat WHERE SeatNo='F4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx24);
	try{
		if(s.next()){
		b24.setSelected(true);
	}}
	catch(Exception exz24){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b25);
	b25.setBounds(50,230,70,30);
	String sqlx25= "SELECT * FROM bus_seat WHERE SeatNo='G1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx25);
	try{
		if(s.next()){
		b25.setSelected(true);
	}}
	catch(Exception exz25){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b26);
	b26.setBounds(140,230,70,30);
	String sqlx26= "SELECT * FROM bus_seat WHERE SeatNo='G2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx26);
	try{
		if(s.next()){
		b26.setSelected(true);
	}}
	catch(Exception exz26){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b27);
	b27.setBounds(260,230,70,30);
	String sqlx27= "SELECT * FROM bus_seat WHERE SeatNo='G3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx27);
	try{
		if(s.next()){
		b27.setSelected(true);
	}}
	catch(Exception exz27){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b28);
	b28.setBounds(350,230,70,30);
	String sqlx28= "SELECT * FROM bus_seat WHERE SeatNo='G4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx28);
	try{
		if(s.next()){
		b28.setSelected(true);
	}}
	catch(Exception exz28){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b29);
	b29.setBounds(50,250,70,30);
	String sqlx29= "SELECT * FROM bus_seat WHERE SeatNo='H1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx29);
	try{
		if(s.next()){
		b29.setSelected(true);
	}}
	catch(Exception exz29){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b30);
	b30.setBounds(140,250,70,30);
	String sqlx30= "SELECT * FROM bus_seat WHERE SeatNo='H2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx30);
	try{
		if(s.next()){
		b30.setSelected(true);
	}}
	catch(Exception exz30){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b31);
	b31.setBounds(260,250,70,30);
	String sqlx31= "SELECT * FROM bus_seat WHERE SeatNo='H3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx31);
	try{
		if(s.next()){
		b31.setSelected(true);
	}}
	catch(Exception exz31){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b32);
	b32.setBounds(350,250,70,30);
	String sqlx32= "SELECT * FROM bus_seat WHERE SeatNo='H4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx32);
	try{
		if(s.next()){
		b32.setSelected(true);
	}}
	catch(Exception exz32){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b33);
	b33.setBounds(50,270,70,30);
	String sqlx33= "SELECT * FROM bus_seat WHERE SeatNo='I1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx33);
	try{
		if(s.next()){
		b33.setSelected(true);
	}}
	catch(Exception exz33){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b34);
	b34.setBounds(140,270,70,30);
	String sqlx34= "SELECT * FROM bus_seat WHERE SeatNo='I2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx34);
	try{
		if(s.next()){
		b34.setSelected(true);
	}}
	catch(Exception exz34){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b35);
	b35.setBounds(260,270,70,30);
	String sqlx35= "SELECT * FROM bus_seat WHERE SeatNo='I3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx35);
	try{
		if(s.next()){
		b35.setSelected(true);
	}}
	catch(Exception exz35){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b36);
	b36.setBounds(350,270,70,30);
	String sqlx36= "SELECT * FROM bus_seat WHERE SeatNo='I4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx36);
	try{
		if(s.next()){
		b36.setSelected(true);
	}}
	catch(Exception exz36){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b37);
	b37.setBounds(50,290,70,30);
	String sqlx37= "SELECT * FROM bus_seat WHERE SeatNo='J1' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx37);
	try{
		if(s.next()){
		b37.setSelected(true);
	}}
	catch(Exception exz37){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b38);
	b38.setBounds(140,290,70,30);
	String sqlx38= "SELECT * FROM bus_seat WHERE SeatNo='J2' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx38);
	try{
		if(s.next()){
		b38.setSelected(true);
	}}
	catch(Exception exz38){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b39);
	b39.setBounds(260,290,70,30);
	String sqlx39= "SELECT * FROM bus_seat WHERE SeatNo='J3' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx39);
	try{
		if(s.next()){
		b39.setSelected(true);
	}
	}
	catch(Exception exz39){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	f1.add(b40);
	b40.setBounds(350,290,70,30);
	String sqlx40= "SELECT * FROM bus_seat WHERE SeatNo='J4' AND Status='Not Available' AND BusId='"+id+"'";
	s=da.getData(sqlx40);
	try{
		if(s.next()){
		b40.setSelected(true);
	}}
	catch(Exception exz40){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
	JButton bb=new JButton("Confirm");
	f1.add(bb);
	bb.setBounds(200,350,120,70);
	bb.setBackground(new Color(255,69,0));
    bb.setForeground(Color.WHITE);
    bb.setFocusPainted(false);
    bb.setFont(new Font("Tahoma", Font.BOLD, 12));
	
	b1.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b1.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='A1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b1.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='A1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b2.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b2.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='A2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b2.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='A2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b3.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b3.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='A3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b3.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='A3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b4.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b4.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='A4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b4.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='A4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b5.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b5.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='B1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b5.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='B1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b6.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b6.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='B2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b6.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='B2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b7.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b7.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='B3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b7.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='B3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b8.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b8.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='B4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b8.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='B4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b9.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b9.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='C1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b9.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='C1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b10.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b10.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='C2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b10.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='C2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b11.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b11.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='C3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b11.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='C3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b12.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b12.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='C4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b12.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='C4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b13.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b13.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='D1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b13.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='D1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b14.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b14.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='D2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b14.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='D2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b15.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b15.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='D3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b15.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='D3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b16.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b16.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='D4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b16.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='D4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b17.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b17.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='E1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b17.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='E1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b18.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b18.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='E2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b18.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='E2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b19.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b19.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='E3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b19.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='E3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b20.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b20.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='E4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b20.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='E4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b21.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b21.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='F1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b21.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='F1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b22.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b22.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='F2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b22.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='F2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b23.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b23.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='F3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b23.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='F3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b24.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b24.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='F4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b24.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='F4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b25.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b25.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='G1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b25.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='G1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b26.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b26.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='G2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b26.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='G2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b27.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b27.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='G3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b27.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='G3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b28.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b28.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='G4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b28.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='G4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b29.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b29.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='H1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b29.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='H1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b30.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b30.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='H2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b30.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='H2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b31.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b31.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='H3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b31.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='H3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b32.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b32.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='H4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b32.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='H4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b33.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b33.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='I1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b33.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='I1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b34.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b34.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='I2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b34.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='I2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b35.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b35.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='I3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b35.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='I3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b36.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b36.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='I4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b36.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='I4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b37.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b37.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='J1' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b37.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='J1' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b38.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b38.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='J2' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b38.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='J2' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b39.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b39.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='J3' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b39.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='J3' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	b40.addItemListener(
	new ItemListener(){
		public void itemStateChanged(ItemEvent ex){
		if(b40.isSelected()){
			String sql= "SELECT * FROM bus_seat WHERE SeatNo='J4' AND Status='Not Available' AND BusId='"+id+"'";
			s=da.getData(sql);
			try{
				if(s.next()){
					f1.setVisible(false);
					Frame f2;
					f2 = new Frame("Online Bus Ticketing System");
					f2.setSize(640,480);
					f2.setLayout(null);
					Label l3=new Label("Seat Already Selected");
					l3.setFont(new Font("Courier", Font.BOLD, 24));
					f2.add(l3);
					l3.setBounds(210,100,300,230);
					JButton bg= new JButton("Back");
					f2.add(bg);
					bg.setBounds(290,400,70,30);
					f2.addWindowListener(new WindowAdapter() 
					{
						public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
						}        
					});
					bg.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//System.out.println("Ticket");
					b40.setSelected(true);
					f2.setVisible(false);
					f1.setVisible(true);
            }
         }
	    );
					f2.setVisible(true);
					
				
			}
			else{
			String sql1="UPDATE bus_seat SET Status= 'Pending' WHERE SeatNo='J4' AND BusId='"+id+"'";
			da.updateDB(sql1);
			i++;
			}
			}
			catch(Exception exz){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
		}
	}
	}
	);
	
	bb.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tid=cid;
					String sql="UPDATE bus_seat SET Status= 'Not Available' ,customerId='"+cid+"' WHERE Status= 'Pending'";
					da.updateDB(sql);
					String sql2="UPDATE bus_info SET SeatsOccupied=SeatsOccupied+'"+i+"' WHERE BusId= '"+id+"'";
					da.updateDB(sql2);
					String sql3="INSERT INTO ticketinfo (TicketId,BusId,customerId) VALUES ('"+ tid+"', '"+id+"', '"+cid+"');";
					da.updateDB(sql3);
					String sql4="SELECT * FROM ticketinfo WHERE BusId='"+id+"' and customerId='"+
																cid+"';";
					s=da.getData(sql4);
				
				try{
					if(s.next()){
						BusSeat ob=new BusSeat();
						ob.tid=s.getInt("TicketId");
						String sql11="UPDATE customerinfo SET TicketId='"+ob.tid+"' WHERE customerId='"+cid+"'";
						da.updateDB(sql11);
						ob.id=id;
						ob.cid=cid;
						f1.setVisible(false);
						CustomerLogin v=new CustomerLogin(ob);
					}
				
				}
				catch(Exception ex){
						System.out.println("DB Read Error !");
						//ex.printStackTrace();
				}
		}
	});
	f1.setVisible(true);
	}

	

	public void itemStateChanged(ItemEvent arg) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}