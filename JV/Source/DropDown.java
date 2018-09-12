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

public class DropDown extends JFrame implements ActionListener , ItemListener{
	private Frame f1;
	ArrayList<Bus> busList = new ArrayList<>();
	int cid;
	int i=0;
	DefaultListModel model = new DefaultListModel();
	ResultSet s=null;
	DropDown(int pp){
		cid=pp;
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,500);
	    f1.setLayout(new FlowLayout());
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
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
		TextField tf1=new TextField("Enter Source",35);
		tf1.setSize(150,70);
		TextField tf2=new TextField("Enter Destination",35);
		tf2.setSize(150,70);
		Panel p1=new Panel();
		JButton b5 = new JButton("Search");
		b5.setBackground(new Color(255,69,0));
		b5.setForeground(Color.WHITE);
		b5.setFocusPainted(false);
		b5.setFont(new Font("Tahoma", Font.BOLD, 12));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(b5);
		p1.setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		f1.add(p1);
		b5.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Search");
				f1.setVisible(false);
				DataAccess da = new DataAccess();
				String sql="SELECT * FROM bus_info WHERE Source='"+tf1.getText()+"' and Destination='"+
																tf2.getText()+"';";
				s=da.getData(sql);
				
				try{
					while(s.next()){
					String busName= s.getString("CompanyName");
					String timing= s.getString("Timing");
					String seat= s.getString("SeatsOccupied");
					int id= s.getInt("BusId");
					String z= busName+" "+timing;
					
					Bus k=new Bus(busName,timing,seat,id,cid);
					//i++;
					busList.add(k);
					model.addElement(z);
					
					
				}
					JList list = new JList(model);
					list.setVisibleRowCount(5);
					list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					new JScrollPane(list);
					list.addListSelectionListener(
					new ListSelectionListener(){
						public void valueChanged(ListSelectionEvent x){
							BusSeat n=new BusSeat(busList.get(list.getSelectedIndex()));
							//System.out.println(""+busList.get(list.getSelectedIndex()).CompanyName);
							f1.setVisible(false);
						}
					}
					);
					s.close();
					f1.add(list);
					//statement.close();
					f1.setVisible(true);
				
			}
			catch(Exception ex){
            System.out.println("DB Read Error !");
            //ex.printStackTrace();
        }
			
         }
			}
	    );
		f1.setVisible(true);
		
	}
	
	public void itemStateChanged(ItemEvent arg) {
		// TODO Auto-generated method stub
		
	}


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

