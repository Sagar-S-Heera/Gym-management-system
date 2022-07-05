package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class ViewTrainer extends JFrame implements ActionListener {

	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("images/download.png"));
	Font f;
	String header[] = { "TrainerID", "FirstName", "LastName", "Gender", "Email", "Age", "Phone", "Category", "Height", "Weight", "Remarks", "Address" };
	String table[][] = new String[23][12];
	int i = 0, j = 0;
	JTable tb;
	JScrollPane sp;
	JButton b1, b2, b3;
	JTextField tf;
	JPanel p;

	public ViewTrainer() {
		super("Trainer Information");
		setLocation(20, 20);
		setSize(1150, 550);
		setResizable(false);
		setIconImage(logo.getImage());
		getContentPane().setLayout(null);
		f = new Font("Cambria", Font.PLAIN, 15);
		
		  try { 
			  ConnectionClass obj = new ConnectionClass(); 
			  ResultSet rs =obj.stm.executeQuery("select * from trainer"); 
			  while(rs.next()) {
				  table[i][j++]=rs.getString("TrainerID");
				  table[i][j++]=rs.getString("fname");
				  table[i][j++]=rs.getString("lname");
				  table[i][j++]=rs.getString("gender");
				  table[i][j++]=rs.getString("email");
				  table[i][j++]=rs.getString("dob");
				  table[i][j++]=rs.getString("cont");
				  table[i][j++]=rs.getString("Tcat");
				  table[i][j++]=rs.getString("hei");
				  table[i][j++]=rs.getString("wei");
				  table[i][j++]=rs.getString("remarks");
				  table[i][j++]=rs.getString("Address");
				  i++;
				  j=0;
			} 
			  tb= new JTable(table,header);
			  tb.setFont(f);
			  tb.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int index = tb.getSelectedRow();
						TableModel tm= tb.getModel();
						String str = tm.getValueAt(index, 0).toString();
						tf.setText(str);
					}
				});
		  }
			  catch (Exception e){ 
				  e.printStackTrace(); 
			}
		sp = new JScrollPane(tb);
		sp.setBounds(20, 20, 1100, 391);
		getContentPane().add(sp);
		p = new JPanel();
		p.setBounds(50, 440, 1000, 55);
		b1 = new JButton("Update");
		b1.setBounds(643, 9, 100, 25);
		b1.setFont(f);
		b2 = new JButton("Delete");
		b2.setBounds(753, 9, 100, 25);
		b2.setFont(f);
		b3 = new JButton("Return");
		b3.setBounds(863, 9, 100, 25);
		b3.setFont(f);
		p.setLayout(null);
		tf = new JTextField();
		tf.setBounds(290, 14, 100, 20);
		p.add(tf);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		getContentPane().add(p);

		JLabel l1 = new JLabel("TrainerID");
		l1.setBounds(215, 14, 70, 20);
		l1.setFont(f);
		p.add(l1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String TID = tf.getText();
		if (e.getSource() == b2) {
			try {
				ConnectionClass obj = new ConnectionClass();
				String q = "delete from trainer where TrainerID='"+ TID +"'";
				obj.stm.executeUpdate(q);
				setVisible(false);
				new ViewTrainer().setVisible(true);
			} catch (Exception ep) {
				ep.printStackTrace();
			}
		}
		if (e.getSource() == b1) {
			new UpdateTrainer().setVisible(true);
			setVisible(false);
		}
		if (e.getSource() == b3) {
			new HomePage(null).setVisible(true);
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		
		ViewTrainer vt = new ViewTrainer();
		vt.setVisible(true);
		vt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
