package classes;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Equipments extends javax.swing.JFrame {

    public void tableDetails(){
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            ConnectionClass obj = new ConnectionClass();
            String q = "select * from equipment ";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next()){
                model.addRow(new Object[]{rest.getString(1),rest.getString(2),rest.getString(3),rest.getString(4)});
            }
        }
        catch (Exception ex) {
             ex.printStackTrace();
        }
        
    }
    public Equipments() {
        initComponents();
        setSize(1000,550);
		setLocation(100, 60);
		setResizable(false);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
        setIconImage(img.getImage());
        tableDetails();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        f= new Font("Cambria",Font.PLAIN,15);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipments List");

        jTable1.setFont(f); // NOI18N
        jButton1.setFont(f);
        jButton2.setFont(f);
        jButton3.setFont(f);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "No. of Unit(s)", "Cost (in Rs.)", "Availability"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        btnNewButton = new JButton("Return");
        btnNewButton.setFont(f);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new HomePage(null).setVisible(true);
        		setVisible(false);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(79)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 820, GroupLayout.PREFERRED_SIZE)
        			.addGap(100))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(348)
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        			.addGap(331))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(345, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(300))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(122)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 766, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
        			.addGap(54)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(112, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new AddEquipment().setVisible(true);
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int row=jTable1.getSelectedRow();
        String cell=model.getValueAt(row, 0).toString();
        new ModifyEquipment(cell).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int row=jTable1.getSelectedRow();
        String cell=model.getValueAt(row, 0).toString();
        try{
            ConnectionClass obj = new ConnectionClass();
            String q = "delete from equipment where name ='"+cell+"'";
            obj.stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            tableDetails();
        }
        catch (Exception ex) {
             ex.printStackTrace();
        }
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private JButton btnNewButton;
    private Font f;
    // End of variables declaration//GEN-END:variables
}
