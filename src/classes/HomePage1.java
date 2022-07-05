package classes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;

public class HomePage1 extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3;
	JPanel p;
	JTextArea tf ;
	private JLabel lblNewLabel;
	public HomePage1() {
		setSize(1000,550);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocation(100, 60);
		b1 = new JButton("Members");
		b2 = new JButton("Trainers");
		b3 = new JButton("Fee Management");
		b4 = new JButton("Equipments");
		b5 = new JButton("Exit");
		b1.setBackground(new Color(170, 84, 232));
		b2.setBackground(new Color(231, 237, 121));
		b3.setBackground(new Color(121, 237, 129));
		b4.setBackground(new Color(96, 110, 97));
		b5.setBackground(new Color(237, 50, 53));
		
		p =new JPanel(new GridLayout(5, 1,0,10));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.setBackground(getForeground());
		getContentPane().add(p);
		p.setBounds(100,100,250,200);
		
		l1 = new JLabel("Welcome!");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime date = LocalDateTime.now();
		l3 = new JLabel();
		l3.setText(dtf.format(date));
		tf = new JTextArea(10, 30);
		tf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		getContentPane().add(l1);
		getContentPane().add(new JSeparator());
		getContentPane().add(tf);getContentPane().add(l3);
JDateChooser dateChooser = new JDateChooser();
dateChooser.setBorder(new LineBorder(Color.BLACK, 1, true));
dateChooser.getCalendarButton().setText("hello");
dateChooser.setBounds(467, 112, 220, 44);
getContentPane().add(dateChooser);
lblNewLabel = new JLabel("ADD\r\n");
lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 22));
lblNewLabel.setBounds(488, 188, 199, 32);
getContentPane().add(lblNewLabel);
		
	}
	
	
	public static void main(String[] args) {
		HomePage1 hp = new HomePage1();
		hp.getContentPane().setBackground(new Color(167, 237, 164));
		hp.setVisible(true);
		hp.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
