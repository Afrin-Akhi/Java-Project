package Source;
import Source.Demo;
import Source.Customer;
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
public class AdminLogin extends JFrame implements ActionListener{
	AdminLogin o;
	Admin l;
	
	private Frame f1;
	AdminLogin(Admin x){
		f1 = new Frame("Online Bus Ticketing System");
		f1.setSize(640,480);
	    f1.setLayout(null);
        f1.addWindowListener(new WindowAdapter() 
		{
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
			}        
		});
		JButton b1= new JButton("See Bus Details");
		JButton b3= new JButton("Cancel Bus");
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
				System.out.println("See Bus Details");
				f1.setVisible(false);
				BusDetails a=new BusDetails();
            }
         }
	    );
		b3.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Cancel Bus");
				f1.setVisible(false);
				DeleteBus hh=new DeleteBus();
            }
         }
	    );
		b4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//System.out.println("Logout");
				f1.setVisible(false);
				Demo d= new Demo(l);
				
            }
         }
	    );
		
		
		f1.add(b1);
		b1.setBounds(250,100,150,70);
		f1.add(b3);
		b3.setBounds(250,340,150,70);
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