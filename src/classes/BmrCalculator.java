package classes;

import javax.swing.*;  
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class BmrCalculator extends javax.swing.JFrame {
    String name;
    String gender;
    public int calculateAge(String birth) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.parse(birth);
		int age = Period.between(birthday, today).getYears();
		return age;
	}
    public BmrCalculator() {
        initComponents();
        setResizable(false);
        setLocation(100, 50);
        //getContentPane().setBackground(new Color(204, 255, 255));
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
        setIconImage(img.getImage());
        choice1.add("Select");
        try {
        	ConnectionClass obj = new ConnectionClass();
        	ResultSet rs = obj.stm.executeQuery("select MemberID from member");
        	while(rs.next()) {
        		choice1.add(rs.getString("MemberID"));
        	}
                
        }catch (Exception ep) {
        	ep.printStackTrace();
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMR Calculator");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BMR   Calculator");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Weight");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Height");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Age");

        jTextField1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        jCheckBox1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jCheckBox1.setText("Male");

        jCheckBox2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jCheckBox2.setText("Female");

        jButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("kg");

        jRadioButton2.setText("lbs");

        jRadioButton3.setText("inches");

        jRadioButton4.setText("cm");

        jRadioButton5.setSelected(true);
        jRadioButton5.setText("years");

        jButton2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("MemberId");

        choice1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(230)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
        					.addGap(189)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
        							.addGap(32)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jRadioButton1)
        									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jRadioButton2))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jRadioButton3)
        									.addGap(18)
        									.addComponent(jRadioButton4))
        								.addComponent(jRadioButton5)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jCheckBox1)
        							.addGap(57)
        							.addComponent(jCheckBox2))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(353)
        					.addComponent(jButton1)
        					.addGap(44)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(173)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jSeparator1, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
        							.addGap(26)
        							.addComponent(choice1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jSeparator2))))
        			.addContainerGap(131, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(0, 368, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
        			.addGap(326))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(49)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6)
        				.addComponent(choice1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(48)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(29)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        					.addGap(43)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jRadioButton2)))
        					.addGap(37)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jRadioButton3)
        						.addComponent(jRadioButton4))
        					.addGap(28)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jRadioButton5))))
        			.addGap(34)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jCheckBox1)
        				.addComponent(jCheckBox2))
        			.addGap(33)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(39)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addContainerGap(65, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        pack();
    }

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        double bmr=0.0;
        Double w=Double.parseDouble(jTextField1.getText());
        Double h=Double.parseDouble(jTextField2.getText());
        int a=Integer.parseInt(jTextField3.getText());
        if(jRadioButton2.isSelected()){
            w=w/2.205;
        }
        if(jRadioButton3.isSelected()){
            h=h*2.54;
        }
        if(jCheckBox1.isSelected()){
            bmr=(10*w)+(6.25*h)-(5*a)+5;
        }
        else if(jCheckBox2.isSelected()){
            bmr=(10*w)+(6.25*h)-(5*a)-161;
        }
        JOptionPane.showMessageDialog(this,"Basal Metabolic Rate (BMR) of "+name+" is :"+Math.round((bmr*100.0)/100.0)+" Calories/day"); 
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new HomePage(null).setVisible(true);
    }

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {
        if(choice1.getSelectedIndex()==0){
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            name="the data you entered";
            if(jRadioButton1.isSelected()){
                jRadioButton1.doClick();
            }
            if(jRadioButton2.isSelected()){
                jRadioButton2.doClick();
            }
            if(jRadioButton3.isSelected()){
                jRadioButton3.doClick();
            }
            if(jRadioButton4.isSelected()){
                jRadioButton1.doClick();
            }
            if(jCheckBox1.isSelected()){
                jCheckBox1.doClick();
            }
            if(jCheckBox2.isSelected()){
                jCheckBox2.doClick();
            }
        }else{
            try {
        	ConnectionClass obj = new ConnectionClass();
        	String MID = choice1.getSelectedItem();
                String q1 = "select * from member where MemberID='"+MID+"'";
                ResultSet rs1 = obj.stm.executeQuery(q1);
        	while(rs1.next()) {
                    jTextField1.setText(rs1.getString("wei"));
                    jTextField2.setText(rs1.getString("hei"));
                    String date=rs1.getString("dob");
                    jTextField3.setText(String.valueOf(calculateAge(date)));
                    name=rs1.getString("fname");
                    gender=rs1.getString("gender");
                    if(!jRadioButton1.isSelected()){
                        jRadioButton1.doClick();
                    }
                    if(jRadioButton2.isSelected()){
                        jRadioButton2.doClick();
                    }
                    if(!jRadioButton3.isSelected()){
                        jRadioButton3.doClick();
                    }
                    if(jRadioButton4.isSelected()){
                        jRadioButton1.doClick();
                    }
                    if(gender.equals("male")){
                        if(jCheckBox2.isSelected()){
                            jCheckBox2.doClick();
                        }
                        jCheckBox1.doClick();
                    }
                    else if(gender.equals("female")){
                        if(jCheckBox1.isShowing()){
                            jCheckBox1.doClick();
                        }
                        jCheckBox2.doClick();
                
                    } 
                }
                
                }catch (Exception ep) {
        	ep.printStackTrace();
        }
        }
        
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BmrCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
