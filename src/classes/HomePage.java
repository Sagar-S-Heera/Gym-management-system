package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class HomePage extends JFrame implements ActionListener {

	JLabel l1,l2,l3,l4,l5;
	JPanel p, p1;
	JButton b1,b2,b3,b4,b5, b6, b7;
	JSeparator s, s1;
	JTextArea ta;
	Font f;
	JMenu m6;
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("\\images\\download.png"));
	private static String usname;
	public HomePage(String passedname) {
		
		super("Home Page");
		
		if(passedname!=null){
            usname=passedname;
        }
		
		setSize(950,550);
		setLocation(100, 60);
		setResizable(false);
		setIconImage(logo.getImage());
		
		f= new Font("Cambria",Font.BOLD,15);
		JMenuItem m1a = new JMenuItem("Add Trainer");
		m1a.setMnemonic('T');
		m1a.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		JMenuItem m1b = new JMenuItem("Add Member");
		m1b.setMnemonic('M');
		m1b.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		JMenu m1 = new JMenu("Master");
		m1.add(m1a);
		m1.add(m1b);
		
		JMenuItem m2a = new JMenuItem("Trainer Information");
		JMenuItem m2b = new JMenuItem("Member Information");
		JMenu m2 = new JMenu("View Information");
		m2.add(m2a);
		m2.add(m2b);
		
		JMenuItem m3a = new JMenuItem("Update Trainer");
		JMenuItem m3b = new JMenuItem("Update Member");
		JMenu m3 = new JMenu("Update Information");
		m3.add(m3a);
		m3.add(m3b);
		
		//JMenuItem m4a = new JMenuItem("Trainer Fee");
		JMenuItem m4b = new JMenuItem("Member Fee");
		JMenu m4 = new JMenu("Fee Information");
		//m4.add(m4a);
		m4.add(m4b);
		
		JMenuItem m6a = new JMenuItem("BMI Calculator");
		JMenuItem m6b = new JMenuItem("BMR Calculator");
		m6 = new JMenu("Tools");
		m6.add(m6a);
		m6.add(m6b);
		
		JMenuItem m5a = new JMenuItem("LogOut");
		JMenu m5 = new JMenu("Logout");
		m5.add(m5a);
		
		JMenuBar mb = new JMenuBar();
		mb.setFont(new Font("Cambria", Font.PLAIN, 12));
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m6);
		mb.add(m5);
		mb.setBackground(new Color(31, 127, 237));
		/*
		 * m1.setForeground(Color.GRAY); m2.setForeground(Color.GRAY);
		 * m3.setForeground(Color.GRAY); m4.setForeground(Color.GRAY);
		 * m5.setForeground(Color.GRAY); m6.setForeground(Color.GRAY);
		 */
		m1a.addActionListener(this);
		m1b.addActionListener(this);
		m2a.addActionListener(this);
		m2b.addActionListener(this);
		m3a.addActionListener(this);
		m3b.addActionListener(this);
		//m4a.addActionListener(this);
		m4b.addActionListener(this);
		m5a.addActionListener(this);
		m6a.addActionListener(this);
		m6b.addActionListener(this);
	
		setJMenuBar(mb);
		
		b1 = new JButton("Members");
		b2 = new JButton("Trainers");
		b3 = new JButton("Fee Management");
		b4 = new JButton("Equipments");
		b5 = new JButton("Tools");
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		
		p1 =new JPanel(new GridLayout(5, 1,0,10));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.setBackground(getForeground());
		getContentPane().add(p1);
		
		ta = new JTextArea(10, 30);
		ta.setFont(new Font("Cambria", Font.PLAIN, 12));
		ta.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		b6 = new JButton("Clear");
		b6.setFont(new Font("Cambria", Font.PLAIN, 12));
		b7 = new JButton("Save");
		b7.setFont(new Font("Cambria", Font.PLAIN, 12));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		l3 = new JLabel();
		l3.setBounds(62, 5, 126, 15);
		l3.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		l3.setText(dtf.format(date));
		
		l4= new JLabel("Your Saved notes");
		l4.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		
		l1 = new JLabel("Welcome! "+usname);
		l1.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		l2 = new JLabel("Today Is: ");
		l2.setBounds(10, 5, 51, 15);
		l2.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		s = new JSeparator();
		s1 = new JSeparator();
        s.setOrientation(SwingConstants.HORIZONTAL);
        s1.setOrientation(SwingConstants.VERTICAL);
		
		p = new JPanel();
		p.setLayout(null);
		p.add(l2);
		p.add(l3);
		
		l5 = new JLabel("\u00a9 Designed by Manoj and Sagar.");
		l5.setFont(new Font("Cambria", Font.PLAIN, 12));
		
		getContentPane().add(l1);
		getContentPane().add(s);
		getContentPane().add(l4);
		getContentPane().add(ta);
		getContentPane().add(b6);
		getContentPane().add(b7);
		getContentPane().add(p);
		getContentPane().add(s1);
		getContentPane().add(l5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		getContentPane().setLayout(null);
		p1.setBounds(100,100,250,200);
		l1.setBounds(410,50,130,40);
		s.setBounds(400,90,400,10);
		l4.setBounds(410,90,110,40);
		ta.setBounds(410,130,350,150);
		b6.setBounds(580,290,80,25);
		b7.setBounds(680,290,80,25);
		p.setBounds(410,398,217,32);
		p.setBackground(getForeground());
		s1.setBounds(380,50,10,400);
		l5.setBounds(25,450,180,20);
		
		 try{
             ConnectionClass obj = new ConnectionClass();
             String q = "select * from loginpage where username='"+usname+"'";
             ResultSet rest = obj.stm.executeQuery(q);
             while(rest.next()){
                 String notes=rest.getString("notes");
                 ta.setText(notes);
             }
         }
         catch (Exception ex) {
             ex.printStackTrace();
         }
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch(cmd) {
		case "Add Trainer" : {new AddTrainer().setVisible(true);
		this.setVisible(false);
		break;
		}
		case "Add Member" : {new AddMember().setVisible(true);
		this.setVisible(false);
		break;
		}
		case "Trainers":
		case "Trainer Information":{new ViewTrainer().setVisible(true);
		this.setVisible(false);
		break;
		}
		case "Members":
		case "Member Information":{new ViewMember().setVisible(true);
		this.setVisible(false);
		break;
		}
		case "Update Trainer":{new UpdateTrainer().setVisible(true);
		this.setVisible(false);
		break;
		}
		case "Update Member":{new UpdateMember().setVisible(true);
		this.setVisible(false);
		break;
		}
		case "BMI Calculator":{new BmiCalculator().setVisible(true);
			this.setVisible(false);
			break;	
		}
		case "BMR Calculator":{new BmrCalculator().setVisible(true);
		this.setVisible(false);
		break;	
		}
		case "Member Fee":
		case "Fee Management":{new PaymentPage().setVisible(true);
			this.setVisible(false);
			break;
		}
		case "Equipments":{new Equipments().setVisible(true);
		this.setVisible(false);
		break;		
		}
		case "Tools":{
			m6.doClick();
			break;
		}
		case "Clear":{ta.setText(" ");break;}
		case "Save": {
			try{
            ConnectionClass obj = new ConnectionClass();
            String q = "update loginpage set notes='"+ta.getText()+"' where username='"+usname+"'";
            obj.stm.executeUpdate(q);
            
            JOptionPane.showMessageDialog(null, "Saved Successfully");
            new HomePage(usname).setVisible(true);
            this.setVisible(false);
            }
            catch (Exception ex) {
              ex.printStackTrace();
            }
            break;}
		case "LogOut": {
			int ans = JOptionPane.showConfirmDialog(null,"Are you Sure?", "Are you Sure?", JOptionPane.YES_NO_OPTION);
			if(ans==JOptionPane.YES_OPTION) {
				new login().setVisible(true);
				this.setVisible(false);
			}
		}
	}
	}
	public static void main(String[] args) {
		HomePage hp = new HomePage(null);
		hp.setVisible(true);
		hp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
