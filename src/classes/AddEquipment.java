 package classes;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class AddEquipment extends javax.swing.JFrame {

    public AddEquipment() {
        initComponents();
        setResizable(false);
        setLocation(100, 50);
        //getContentPane().setBackground(new Color(200, 200, 200));
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
        setIconImage(img.getImage());
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
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Install New Equipment");

        jLabel2.setFont(new Font("Cambria", Font.PLAIN, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Units");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Cost (in Rs)");

        jTextField1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        btnReturn = new JButton();
        btnReturn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new Equipments().setVisible(true);
        		setVisible(false);
        	}
        });
        btnReturn.setText("Return");
        btnReturn.setFont(new Font("Cambria", Font.PLAIN, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(133, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jSeparator2, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(175)
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(55)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel4)
        								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
        							.addGap(228)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField1)
        								.addComponent(jTextField2)
        								.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))))
        					.addGap(122))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addGap(18)
        					.addComponent(btnReturn, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
        					.addGap(386))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(43)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(53)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(62)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton1)
        				.addComponent(btnReturn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        			.addGap(103))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
                String name=jTextField1.getText();
                int units=Integer.parseInt(jTextField2.getText());
                int cost=Integer.parseInt(jTextField3.getText());
                String avail="Available";
                
                ConnectionClass obj = new ConnectionClass();
                String q = "insert into equipment values('"+name+"','"+units+"','"+cost+"','"+avail+"')";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
                setVisible(false);
                new Equipments().setVisible(true);
                }
         catch (Exception ex) {
                ex.printStackTrace();
            }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private JButton btnReturn;
    // End of variables declaration//GEN-END:variables
}
