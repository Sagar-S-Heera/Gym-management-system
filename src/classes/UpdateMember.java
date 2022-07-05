package classes;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import com.toedter.calendar.JDateChooser;
@SuppressWarnings("serial")
public class UpdateMember extends JFrame implements ActionListener{
	
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("\\images\\download.png"));
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12,l13,l14,l15,l16;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
	JDateChooser dateChooser;
	JButton b1, b2, b3;
	JSeparator s;
	Font f;
	Choice c1,c2,c3;
	String Tcat ="";
	
	public int calculateAge() {
		LocalDate today = LocalDate.now();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = df.format(dateChooser.getDate());
		LocalDate birthday = LocalDate.parse(str);
		int age = Period.between(birthday, today).getYears();
		return age;
	}
	JButton b4 = new JButton("Personal");
	JButton b5 = new JButton("General");
	
	public UpdateMember() {
		super("Update Member");
		setLocation(100, 60);
		setSize(900, 600);
		setResizable(false);
		setIconImage(logo.getImage());
		getContentPane().setLayout(null);
		
		Date date = new Date();
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tf5.setText(String.valueOf(calculateAge()));
			}
		});
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(200, 264, 120, 25);
		dateChooser.setDate(date);
		
		c1 = new Choice();
		c1.add("male");
		c1.add("female");
		c1.add("others");
		
		l1= new JLabel("First name");
		l1.setBounds(100, 144, 100, 20);
		l2= new JLabel("Last name");
		l2.setBounds(310, 144, 100, 20);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l3 = new JLabel("Email");
		l3.setBounds(100, 224, 90, 20);
		l4 = new JLabel("DOB");
		l4.setBounds(100, 264, 100, 20);
		l5 = new JLabel("Age");
		l5.setBounds(330, 264, 75, 20);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l6= new JLabel("Contact number");
		l6.setBounds(100, 304, 120, 20);
		l7 = new JLabel("Update Gym Member");
		l7.setBounds(100, 50, 400, 30);
		l7.setFont(new Font("Cambria", Font.PLAIN, 25));
		l8 = new JLabel("Gender");
		l8.setBounds(100, 184, 100, 20);
		c1.setBounds(199, 184, 100, 20);
		l9= new JLabel("Address");
		l9.setBounds(100, 344, 100, 20);
		l10 = new JLabel("MemberID");
		l10.setBounds(100, 104, 100, 20);
		l12 = new JLabel("Height(inc.)");
		l12.setBounds(100, 460, 100, 20);
		l13 = new JLabel("Weight(kg)");
		l13.setHorizontalAlignment(SwingConstants.CENTER);
		l13.setBounds(330, 460, 100, 20);
		l14 = new JLabel("Remarks");
		l14.setBounds(100, 384, 100, 20);
		
		tf1 = new JTextField();
		tf1.setBounds(200, 144, 100, 25);
		tf2 = new JTextField();
		tf2.setBounds(408, 144, 100, 25);
		tf3 = new JTextField();
		tf3.setBounds(200, 224, 200, 25);
		tf4 = new JTextField();
		tf4.setBounds(240, 304, 100, 25);
		tf5 = new JTextField();
		tf5.setBounds(408, 264, 100, 25);
		tf6 = new JTextField();
		tf6.setBounds(200, 344, 500, 25);
		c3=new Choice();
		c3.setBounds(200, 104, 100, 13);
		tf8 = new JTextField();
		tf8.setBounds(440, 340, 100, 25);
		tf9 = new JTextField();
		tf9.setBounds(200, 460, 100, 25);
		tf10 = new JTextField();
		tf10.setBounds(440, 460, 100, 25);
		tf11 = new JTextField();
		tf11.setBounds(200, 384, 500, 25);
		
		f =new Font("Cambria", Font.PLAIN, 15);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		l10.setFont(f);
		l12.setFont(f);
		l13.setFont(f);
		l14.setFont(f);
		
		s = new JSeparator();
		s.setBounds(82, 91, 700, 10);
        s.setOrientation(SwingConstants.HORIZONTAL);
        getContentPane().setLayout(null);
        
        getContentPane().add(l7);
        getContentPane().add(s);
        getContentPane().add(l1);
        getContentPane().add(tf1);
        getContentPane().add(l2);
        getContentPane().add(tf2);
        getContentPane().add(l8);
        getContentPane().add(c1);        
        getContentPane().add(l3);
        getContentPane().add(tf3);
        getContentPane().add(l4);
        getContentPane().add(dateChooser);
        getContentPane().add(l5);
        getContentPane().add(tf5);
        getContentPane().add(l6);
        getContentPane().add(tf4);
        getContentPane().add(l9);
        getContentPane().add(tf6);
        getContentPane().add(l10);
        getContentPane().add(c3);
        getContentPane().add(l12);
        getContentPane().add(tf9);
        getContentPane().add(l13);
        getContentPane().add(tf10);
        getContentPane().add(l14);
        getContentPane().add(tf11);
        
         b1 = new JButton("Exit");
        b1.setBounds(704, 507, 90, 25);
        b1.setFont(f);
        getContentPane().add(b1);
        
        b2 = new JButton("Return");
        b2.setBounds(604, 507, 90, 25);
        b2.setFont(f);
        getContentPane().add(b2);
        
        b3 = new JButton("Update");
        b3.setBounds(504, 507, 90, 25);
        b3.setFont(f);
        getContentPane().add(b3);
        
        
        b4.setFont(new Font("Cambria", Font.PLAIN, 15));
        b4.setBounds(200, 420, 100, 25);
        getContentPane().add(b4);
        
        b5.setFont(new Font("Cambria", Font.PLAIN, 15));
        b5.setBounds(330, 420, 100, 25);
        getContentPane().add(b5);
        
        l15 = new JLabel("Trainer name");
        l15.setFont(f);
        l15.setBounds(455, 420, 90, 20);
        getContentPane().add(l15);
        
        c2 = new Choice();
        c2.setBounds(550, 420, 110, 18);
        getContentPane().add(c2);
        
        JLabel l16 = new JLabel("Amount");
    	l16.setFont(new Font("Cambria", Font.PLAIN, 15));
    	l16.setBounds(560, 460, 60, 20);
    	getContentPane().add(l16);
    	
    	tf12 = new JTextField();
    	tf12.setBounds(620, 460, 100, 25);
    	getContentPane().add(tf12);
        tf5.setText(String.valueOf(calculateAge()));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        try {
        	ConnectionClass obj = new ConnectionClass();
        	ResultSet rs = obj.stm.executeQuery("select MemberID from member");
        	while(rs.next()) {
        		c3.add(rs.getString("MemberID"));
        	}
        }catch (Exception ep) {
        	ep.printStackTrace();
        }
        c3.addItemListener(new ItemListener() {
        	@Override
        	public void itemStateChanged(ItemEvent e) {
        		try {
        			ConnectionClass obj2 = new ConnectionClass();
        			String MID = c3.getSelectedItem();
        			String q = "select * from Member where MemberID='"+MID+"'";
        			ResultSet rs = obj2.stm.executeQuery(q);
        			while(rs.next()) {
        				tf1.setText(rs.getString("fname"));
        				tf2.setText(rs.getString("lname"));
        				tf3.setText(rs.getString("email"));
        				tf4.setText(rs.getString("cont"));
        				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("dob"));
        				dateChooser.setDate(date);
        				c2.add(rs.getString("Tname"));
        				tf6.setText(rs.getString("address"));
        				tf9.setText(rs.getString("hei"));
        				tf10.setText(rs.getString("wei"));
        				tf11.setText(rs.getString("remarks"));
        				tf12.setText(rs.getString("amount"));
        			}	
        		}catch (Exception ep) {
        			ep.printStackTrace();
        		}
        	}
        });
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		switch(cmd) {
		case "Return" : {
			new HomePage(null).setVisible(true);
			this.setVisible(false);
			break;
		}
		case "Exit" : {
			System.exit(0);
		}
		}
		try {
			ConnectionClass obj = new ConnectionClass();
			if(e.getSource()==b4) {
				c2.removeAll();
				Tcat=b4.getText();
				String q ="select * from trainer where Tcat='Personal'";
				ResultSet res= obj.stm.executeQuery(q);
				while(res.next())
					c2.add(res.getString("fname"));
			}
			if(e.getSource()==b5) {
				c2.removeAll();
				Tcat=b5.getText();
				String q ="select * from trainer where Tcat='General'";
				ResultSet res= obj.stm.executeQuery(q);
				while(res.next())
					c2.add(res.getString("fname"));
			}
		}catch (Exception ep) {
			ep.printStackTrace();
		}
		if(e.getSource()==b3) {
			String MemberID = c3.getSelectedItem();
			String fname = tf1.getText();
			String lname = tf2.getText();
			String gender = c1.getSelectedItem();
			String email = tf3.getText();
			SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
			String dob= dcn.format(dateChooser.getDate());
			float cont = Float.parseFloat(tf4.getText());
			String address = tf6.getText();
			String Tname = c2.getSelectedItem();
			float hei = Float.parseFloat(tf9.getText());
			float wei = Float.parseFloat(tf10.getText());
			String remarks = tf11.getText();
			int amount = Integer.parseInt(tf12.getText());
			try {
				ConnectionClass obj = new ConnectionClass();
				String q = "update member set fname='"+fname+"',lname='"+lname+"',gender='"+gender+"',email='"+email+"',dob='"+dob+"',cont='"+cont+"',Tname='"+Tname+"',Tcat='"+Tcat+"',hei='"+hei+"',wei='"+wei+"',remarks='"+remarks+"',address='"+address+"',amount='"+amount+"' where MemberID='"+MemberID+"'";
				obj.stm.executeUpdate(q);
				JOptionPane.showMessageDialog(null, "Member Updated successfully!");
				this.setVisible(false);
				new ViewMember().setVisible(true);
			}catch (Exception ep) {
				ep.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * try { for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) { if
		 * ("Nimbus".equals(info.getName())) {
		 * UIManager.setLookAndFeel(info.getClassName()); break; } } } catch (Exception
		 * e) { // If Nimbus is not available, you can set the GUI to another look and
		 * feel. }
		 */
		UpdateMember uc = new UpdateMember();
		uc.setVisible(true);
		uc.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
