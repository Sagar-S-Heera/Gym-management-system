package classes;

import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

@SuppressWarnings("serial")
public class ModifyEquipment extends javax.swing.JFrame {
    
    public void modifyDetails(String name){
        try{
            ConnectionClass obj = new ConnectionClass();
            String nam=name;
            String q = "select * from equipment where name='"+nam+"'";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next()){
                jLabel4.setText(nam);
                jTextField1.setText(rest.getString("units"));
                jTextField2.setText(rest.getString("cost"));
                System.out.println(rest.getString("availability"));
                if(rest.getString("availability")=="Available"){
                    jComboBox1.setSelectedIndex(0);
                }
                else if(rest.getString("availability")=="Unavailable"){
                    jComboBox1.setSelectedIndex(1);
                }  
            }
        }
        catch (Exception ex) {
             ex.printStackTrace();
        }
        
    }
    public ModifyEquipment(String name) {
        initComponents();
        setResizable(false);
        setLocation(100, 50);
        //getContentPane().setBackground(new Color(204, 255, 255));
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
        setIconImage(img.getImage());
        modifyDetails(name);
        
    }
    private void initComponents() {

        new javax.swing.ButtonGroup();
        new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Modify Equipment");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Equipment Name :");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Change No. of Unit(s)");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new Font("Cambria", Font.PLAIN, 16)); // NOI18N
        jLabel5.setText("Unit(s) : ");

        jRadioButton2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Change Cost of the Equipment : ");

        jLabel6.setFont(new Font("Cambria", Font.PLAIN, 16)); // NOI18N
        jLabel6.setText("Cost : ");

        jRadioButton3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Change Availability Option : ");

        jLabel7.setFont(new Font("Cambria", Font.PLAIN, 16)); // NOI18N
        jLabel7.setText("Availability : ");

        jTextField1.setFont(new Font("Cambria", Font.PLAIN, 15)); // NOI18N

        jTextField2.setFont(new Font("Cambria", Font.PLAIN, 15)); // NOI18N

        jComboBox1.setFont(new Font("Cambria", Font.PLAIN, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));

        jButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton1)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addGap(349)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addGap(55)
        						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(270)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jRadioButton3)
        							.addComponent(jRadioButton1)
        							.addComponent(jSeparator2, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        							.addComponent(jRadioButton2)
        							.addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(300)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(112)
        						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 745, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(127)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createSequentialGroup()
        								.addGap(10)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(348)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        						.addGap(42)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(352)
        						.addComponent(jLabel7)
        						.addGap(39)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(38)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jLabel3)
        				.addComponent(jLabel4))
        			.addGap(32)
        			.addComponent(jRadioButton1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addComponent(jRadioButton2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addComponent(jRadioButton3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(63))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String nam=jLabel4.getText();
        int units=Integer.parseInt(jTextField1.getText());
        int cost=Integer.parseInt(jTextField2.getText());
        String avail=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        System.out.println(avail);
        try{
            ConnectionClass obj = new ConnectionClass();
            String q = "update equipment set units='"+units+"',cost='"+cost+"',availability='"+avail+"' where name='"+nam+"'";
            obj.stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            setVisible(false);
            new Equipments().setVisible(true);
        }
        catch (Exception ex) {
             ex.printStackTrace();
        }
        
        
        
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifyEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyEquipment(null).setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
