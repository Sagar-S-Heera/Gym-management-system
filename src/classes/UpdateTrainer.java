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
public class UpdateTrainer extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11;
	JDateChooser dateChooser;
	JButton b1, b2, b3;
	JSeparator s;
	JPanel p1, p2, p3;
	Font f;
	Choice c1,c2, c3;
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("\\images\\download.png"));
	public int calculateAge() {
		LocalDate today = LocalDate.now();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = df.format(dateChooser.getDate());
		LocalDate birthday = LocalDate.parse(str);
		int age = Period.between(birthday, today).getYears();
		return age;
	}
	
	public UpdateTrainer() {
		super("Update Trainer");
		setLocation(100, 60);
		setSize(900, 600);
		setResizable(false);
		setIconImage(logo.getImage());
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(200, 258, 120, 25);
		dateChooser.getCalendarButton().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tf5.setText(String.valueOf(calculateAge()));
			}
		});
		dateChooser.setDateFormatString("yyyy-MM-dd");
		Date date = new Date();
		dateChooser.setDate(date);
		
		c1 = new Choice();
		c1.add("male");
		c1.add("female");
		c1.add("others");
		
		c3 = new Choice();
		c3.add("Personal");
		c3.add("General");
		c3.setBounds(445, 104, 100, 25);
		
		l1= new JLabel("First name");
		l1.setBounds(100, 138, 100, 20);
		l2= new JLabel("Last name");
		l2.setBounds(310, 138, 100, 20);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l3 = new JLabel("Email");
		l3.setBounds(100, 218, 90, 20);
		l4 = new JLabel("DOB");
		l4.setBounds(100, 258, 100, 20);
		l5 = new JLabel("Age");
		l5.setBounds(330, 258, 75, 20);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l6= new JLabel("Contact number");
		l6.setBounds(100, 298, 120, 20);
		l7 = new JLabel("Update Gym Trainer");
		l7.setBounds(100, 50, 400, 30);
		l7.setFont(new Font("Cambria", Font.PLAIN, 25));
		l8 = new JLabel("Gender");
		l8.setBounds(100, 178, 100, 20);
		c1.setBounds(199, 178, 100, 20);
		l9= new JLabel("Address");
		l9.setBounds(100, 338, 100, 20);
		l10 = new JLabel("Trainer ID");
		l10.setBounds(100, 100, 100, 20);
		l11 = new JLabel("Trainer Category");
		l11.setHorizontalAlignment(SwingConstants.CENTER);
		l11.setBounds(310, 100, 130, 20);
		l12 = new JLabel("Height(inc.)");
		l12.setBounds(100, 380, 100, 20);
		l13 = new JLabel("Weight(kg)");
		l13.setHorizontalAlignment(SwingConstants.CENTER);
		l13.setBounds(310, 380, 100, 20);
		l14 = new JLabel("Remarks");
		l14.setBounds(100, 420, 100, 20);
		
		tf1 = new JTextField();
		tf1.setBounds(200, 138, 100, 25);
		tf2 = new JTextField();
		tf2.setBounds(408, 138, 100, 25);
		tf3 = new JTextField();
		tf3.setBounds(200, 218, 200, 25);
		tf4 = new JTextField();
		tf4.setBounds(240, 298, 100, 25);
		tf5 = new JTextField();
		tf5.setBounds(408, 258, 100, 25);
		tf6 = new JTextField();
		tf6.setBounds(200, 338, 500, 25);
		
		tf8 = new JTextField();
		tf8.setBounds(440, 340, 100, 25);
		tf9 = new JTextField();
		tf9.setBounds(200, 380, 100, 25);
		tf10 = new JTextField();
		tf10.setBounds(440, 380, 100, 25);
		tf11 = new JTextField();
		tf11.setBounds(200, 420, 500, 25);
		
		c2 = new Choice();
		c2.setBounds(200, 104, 100, 20);
		
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
		l11.setFont(f);
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
        getContentPane().add(l11);
        getContentPane().add(c2);
        getContentPane().add(l12);
        getContentPane().add(tf9);
        getContentPane().add(l13);
        getContentPane().add(tf10);
        getContentPane().add(l14);
        getContentPane().add(tf11);
        
         b1 = new JButton("Exit");
        b1.setBounds(692, 485, 90, 25);
        b1.setFont(f);
        getContentPane().add(b1);
        
        b2 = new JButton("Return");
        b2.setBounds(592, 485, 90, 25);
        b2.setFont(f);
        getContentPane().add(b2);
        
        b3 = new JButton("Update");
        b3.setBounds(492, 485, 90, 25);
        b3.setFont(f);
        getContentPane().add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        try {
        	ConnectionClass obj = new ConnectionClass();
        	ResultSet rs = obj.stm.executeQuery("select TrainerID from trainer");
        	while(rs.next()) {
        		c2.add(rs.getString("TrainerID"));
        	}
        }catch (Exception ep) {
        	ep.printStackTrace();
        }
        c2.addItemListener(new ItemListener() {
        	@Override
        	public void itemStateChanged(ItemEvent e) {
        		try {
        			ConnectionClass obj2 = new ConnectionClass();
        			String TID = c2.getSelectedItem();
        			String q = "select * from trainer where TrainerID='"+TID+"'";
        			ResultSet rs = obj2.stm.executeQuery(q);
        			while(rs.next()) {
        				tf1.setText(rs.getString("fname"));
        				tf2.setText(rs.getString("lname"));
        				tf3.setText(rs.getString("email"));
        				tf4.setText(rs.getString("cont"));
        				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("dob"));
        				dateChooser.setDate(date);
        				tf6.setText(rs.getString("address"));
        				tf9.setText(rs.getString("hei"));
        				tf10.setText(rs.getString("wei"));
        				tf11.setText(rs.getString("remarks"));
        			}
        		}catch (Exception ep) {
        			ep.printStackTrace();
        		}
        	}
        });
	}
        
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
    		
    		if(e.getSource()==b3) {
    			
    			String TrainerID = c2.getSelectedItem();
    			String fname = tf1.getText();
    			String lname = tf2.getText();
    			String gender = c1.getSelectedItem();
    			String email = tf3.getText();
    			SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
    			String dob= dcn.format(dateChooser.getDate());
    			float cont = Float.parseFloat(tf4.getText());
    			String address = tf6.getText();
    			String Tcat = c3.getSelectedItem();
    			float hei = Float.parseFloat(tf9.getText());
    			float wei = Float.parseFloat(tf10.getText());
    			String remarks = tf11.getText();
    			try {
    				ConnectionClass obj = new ConnectionClass();
    				String q = "update trainer set fname='"+fname+"',lname='"+lname+"',gender='"+gender+"',email='"+email+"',dob='"+dob+"',cont='"+cont+"',Tcat='"+Tcat+"',hei='"+hei+"',wei='"+wei+"',remarks='"+remarks+"',address='"+address+"' where TrainerId='"+TrainerID+"'";
    				obj.stm.executeUpdate(q);
    				JOptionPane.showMessageDialog(null, "Trainer Updated successfully!");
    				this.setVisible(false);
    				new ViewTrainer().setVisible(true);
    			}catch (Exception ep) {
    				ep.printStackTrace();
    			}
    		}
    	}
    	public static void main(String[] args) {
    		UpdateTrainer ut = new UpdateTrainer();
    		ut.setVisible(true);
    		ut.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	}
}
