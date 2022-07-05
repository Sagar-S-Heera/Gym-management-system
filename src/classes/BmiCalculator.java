
package classes;

import javax.swing.JOptionPane;
import javax.swing.*;  
import java.sql.ResultSet;

@SuppressWarnings("serial")
public class BmiCalculator extends javax.swing.JFrame {

    String name;
    public BmiCalculator() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMI Calculator");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("BMI Calculator");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Weight");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Height");

        jTextField1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jRadioButton1.setText("kg");

        jRadioButton2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jRadioButton2.setText("lbs");

        jRadioButton3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jRadioButton3.setText("inches");

        jRadioButton4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jRadioButton4.setText("cm");

        jButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("MemberId");

        choice1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        choice1.setName(""); // NOI18N
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(59, 59, 59)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        double bmi=0.0;
        String msg="";
        Double w=Double.parseDouble(jTextField1.getText());
        Double h=Double.parseDouble(jTextField2.getText());
        
        if(jRadioButton2.isSelected()){
            w=w/2.205;
        }
        if(jRadioButton3.isSelected()){
            h=h/39.37;
        }
        else if(jRadioButton4.isSelected()){
            h=h/100;
        }
        bmi=w/(h*h);
        if(bmi>=30){
            msg="( obese )";
        }
        else if(bmi>=25){
            msg="( over weight )";
        }
        else if(bmi>=18.5){
            msg="( normal weight )";
        }
        else{
            msg="( under weight )";
        }
        JOptionPane.showMessageDialog(this,"Body Mass Index (BMI) of "+name+" is :"+Math.round((bmi*100.0)/100.0)+"  "+msg); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new HomePage(null).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {
        if(choice1.getSelectedIndex()==0){
            jTextField1.setText("");
            jTextField2.setText("");
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
        }
        else{
            try {
        	ConnectionClass obj = new ConnectionClass();
                String MID = choice1.getSelectedItem();
                String q1 = "select * from member where MemberID='"+MID+"'";
                ResultSet rs1 = obj.stm.executeQuery(q1);
        	while(rs1.next()) {
                    jTextField1.setText(rs1.getString("wei"));
                    jTextField2.setText(rs1.getString("hei"));
                    name=rs1.getString("fname");
                }
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
                    
                
            }
            catch (Exception ep) {
        	ep.printStackTrace();
            }
        }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BmiCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
