package classes;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

@SuppressWarnings("serial")
public class login extends javax.swing.JFrame{
  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private static javax.swing.JTextField jTextField1;
    
    public login() {
        initComponents();
        setSize(1000,600);
		setLocation(100, 50);
        setResizable(false);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
        setIconImage(img.getImage());
        
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setFont(new Font("Cambria", Font.PLAIN, 15));
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setFont(new Font("Cambria", Font.PLAIN, 15));
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Database Management System");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new Font("Cambria", Font.BOLD, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gym Database Management System");

        jLabel2.setFont(new Font("Cambria", Font.PLAIN, 18)); // NOI18N
        jLabel2.setText("UserName");

        jLabel3.setFont(new Font("Cambria", Font.PLAIN, 18)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setFont(new Font("Cambria", Font.PLAIN, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new Font("Cambria", Font.PLAIN, 18)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Cambria", Font.PLAIN, 18)); // NOI18N
        jLabel4.setText("Login");

        jCheckBox1.setFont(new Font("Cambria", Font.PLAIN, 15)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(109)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(600)
        							.addComponent(jCheckBox1))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(10)
        							.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(194)
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
        							.addGap(171)
        							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(160)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        							.addGap(129)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField1)
        								.addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(441)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(166)
        					.addComponent(jLabel1)))
        			.addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(jLabel1)
        			.addGap(55)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addGap(33)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(48)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addGap(58)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addGap(38)
        					.addComponent(jCheckBox1))
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addGap(15)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(60, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        char[] p= jPasswordField1.getPassword();
		String passwd = new String(p);
        try {
                ConnectionClass obj = new ConnectionClass();
                String q = "select * from loginpage where username='" + name + "' and password='" + passwd + "'";
                ResultSet rest = obj.stm.executeQuery(q);
                if (rest.next()) {
                    new HomePage(name).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "username or password is invalid");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Are you sure?");
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }
        else{
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

   
    public static void main(String args[]) {
		/*
		 * try { for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) { if
		 * ("Nimbus".equals(info.getName())) {
		 * UIManager.setLookAndFeel(info.getClassName()); break; } } } catch (Exception
		 * e) { // If Nimbus is not available, you can set the GUI to another look and
		 * feel. }
		 */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
        
    }
}
