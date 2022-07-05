package classes;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

import jdk.incubator.vector.VectorOperators.Test;

public class LoginPage extends JFrame implements ActionListener {

	JLabel l1,l2,l3,l4;
	JTextField tf;
	JPasswordField pf;
	JPanel p1,p2;
	JButton bt1, bt2;
	Font f, f1;
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("\\images\\download.png"));
	public LoginPage() {
		super("Login");
		setLocation(50, 50);
		setSize(476, 255);
		setResizable(false);
		
		setIconImage(logo.getImage());
		
		l1=new JLabel("Welcome to Apple Fitness");
		l2=new JLabel("UserName ");
		l2.setBounds(32, 9, 147, 32);
		l3=new JLabel("Password");
		l3.setBounds(32, 52, 107, 51);
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		
		tf = new JTextField();
		tf.setBounds(199, 0, 150, 30);
		pf = new JPasswordField();
		pf.setBounds(199, 61, 150, 30);
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("\\images\\download.png"));
		Image img1 = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon icon = new ImageIcon(img1);
		l4 = new JLabel(icon);
		
		bt1 = new JButton("Login");
		bt1.setBounds(10, 120, 100, 25);
		bt2 = new JButton("Cancel");
		bt2.setBounds(115, 120, 100, 25);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.add(l2);
		p1.add(tf);
		p1.add(l3);
		p1.add(pf);
		p1.add(bt1);
		p1.add(bt2);
		
		getContentPane().setLayout(new BorderLayout(30, 30));
		getContentPane().add(l1, "North");
		getContentPane().add(l4, "East");
		getContentPane().add(p1, "Center");
		
		JButton btnNewButton = new JButton("Sign-in");
		btnNewButton.setBounds(215, 120, 100, 25);
		p1.add(btnNewButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = tf.getText();
		char[] p= pf.getPassword();
		String passwd = new String(p);
		if(e.getSource()==bt1) {
			try {
				ConnectionClass obj = new ConnectionClass();
				String q ="select * from loginpage where username='"+name+"'AND password='"+passwd+"'";
				ResultSet rest=obj.stm.executeQuery(q);
				if(rest.next()) {
					new HomePage(null).setVisible(true);
					this.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, new String(name+" logged in successfully!"));
					this.setVisible(false);
				}
				
			}catch (Exception ep) {
				ep.printStackTrace();
			}
		}if(e.getSource()==bt2) {
			JOptionPane.showMessageDialog(null, "Are you sure to cancel?");
			this.setVisible(false);
		}
	
	}
	public static void main(String[] args) {
			LoginPage lp= new LoginPage();
			lp.setVisible(true);
			lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
