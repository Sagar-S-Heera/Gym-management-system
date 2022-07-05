package classes;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableModel;

import java.awt.event.*;
import java.sql.ResultSet;

@SuppressWarnings("serial")
public class ViewMember extends JFrame implements ActionListener {

	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("\\images\\download.png"));
	Font f;
	String header[] = { "MemberID", "FirstName", "LastName", "Gender", "DOB", "Email", "Phone", "Trainer Name", "Category", "Height", "Weight", "Remarks", "Address", "Amount" };
	String table[][] = new String[23][14];
	int i = 0, j = 0;
	JTable tb;
	JScrollPane sp;
	JButton b1, b2, b3;
	JTextField tf;
	JPanel p;

	public ViewMember() {
		super("Member Information");
		setLocation(20, 20);
		setSize(1150, 550);;
		setResizable(false);
		setIconImage(logo.getImage());
		getContentPane().setLayout(null);
		f = new Font("Cambria", Font.PLAIN, 15);
		try { 
			  ConnectionClass obj = new ConnectionClass(); 
			  ResultSet rs = obj.stm.executeQuery("select * from member"); 
			  while(rs.next()) {
				  table[i][j++]=rs.getString("MemberID");
				  table[i][j++]=rs.getString("fname"); 
				  table[i][j++]=rs.getString("lname");
				  table[i][j++]=rs.getString("gender"); 
				  table[i][j++]=rs.getString("dob");
				  table[i][j++]=rs.getString("email"); 
				  table[i][j++]=rs.getString("cont");
				  table[i][j++]=rs.getString("Tname");
				  table[i][j++]=rs.getString("Tcat");
				  table[i][j++]=rs.getString("hei"); 
				  table[i][j++]=rs.getString("wei");
				  table[i][j++]=rs.getString("remarks"); 
				  table[i][j++]=rs.getString("Address");
				  table[i][j++]=rs.getString("amount");
				  i++;
				  j=0;
			} 
			tb= new JTable(table,header);
			tb.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int index = tb.getSelectedRow();
					TableModel tm= tb.getModel();
					String str = tm.getValueAt(index, 0).toString();
					tf.setText(str);
				}
			});
			tb.setFont(f);
		}catch (Exception e)
		  { e.printStackTrace(); }
		 
		sp = new JScrollPane(tb);
		sp.setBounds(20, 20, 1100, 391);
		getContentPane().add(sp);
		p = new JPanel();
		p.setBounds(50, 440, 1000, 55);
		b1 = new JButton("Update");
		b1.setBounds(576, 11, 100, 25);
		b1.setFont(f);
		b2 = new JButton("Delete");
		b2.setBounds(686, 11, 100, 25);
		b2.setFont(f);
		b3 = new JButton("Return");
		b3.setBounds(796, 11, 100, 25);
		b3.setFont(f);
		p.setLayout(null);
		tf = new JTextField();
		tf.setBounds(366, 12, 100, 25);
		p.add(tf);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		getContentPane().add(p);

		JLabel l1 = new JLabel("MemberID");
		l1.setBounds(260, 11, 100, 25);
		l1.setFont(f);
		p.add(l1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String MID = tf.getText();
		if (e.getSource() == b2) {
			try {
				ConnectionClass obj = new ConnectionClass();
				String q = "delete from member where MemberID='" + MID + "'";
				obj.stm.executeUpdate(q);
				setVisible(false);
				new ViewMember().setVisible(true);
			} catch (Exception ep) {
				ep.printStackTrace();
			}
		}
		if (e.getSource() == b1) {
			new UpdateMember().setVisible(true);
			setVisible(false);
		}
		if (e.getSource() == b3) {
			new HomePage(null).setVisible(true);
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		ViewMember vc = new ViewMember();
		vc.setVisible(true);
		vc.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
