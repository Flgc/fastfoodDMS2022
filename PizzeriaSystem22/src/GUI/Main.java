/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utility.ScreenBackground;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author fabio
 */
public class Main extends javax.swing.JFrame {

    ScreenBackground scrt;
    ClientIntFrameform clientIntFrameform;
    EmployeeIntFrameform employeeIntFrameform;
    
    public Main() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setLayout(new GridLayout());
        
        scrt = new ScreenBackground("img/pizza-fundo.jpg");
        getContentPane().add(scrt);
        
        Jfm_RegistrationMenuClient.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_clientes.png")));
        Jfm_RegistrationMenuEmployee.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_func.png")));
        Jfm_RegistrationMenuMenu.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_cardapio.png")));
        Jfm_RegistrationMenuDeliveryman.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_boy.png")));
        Jfm_Registration.setIcon(new ImageIcon(getClass().getResource("/Icons/inserir-32.png")));
        Jfm_Cashier.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_caixa.png")));
        Jfm_Report.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_rel.png")));
        Jfm_Exit.setIcon(new ImageIcon(getClass().getResource("/Icons/ico_sair.png")));
        
        // Bar Icon from operational system
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/ico_cardapio.png"));
        setIconImage(icon.getImage());      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Jfm_Registration = new javax.swing.JMenu();
        Jfm_RegistrationMenuClient = new javax.swing.JMenuItem();
        Jfm_RegistrationMenuEmployee = new javax.swing.JMenuItem();
        Jfm_RegistrationMenuMenu = new javax.swing.JMenuItem();
        Jfm_RegistrationMenuDeliveryman = new javax.swing.JMenuItem();
        Jfm_Cashier = new javax.swing.JMenu();
        Jfm_CashierRequest = new javax.swing.JMenuItem();
        Jfm_Report = new javax.swing.JMenu();
        Jfm_Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria FLGC");

        Jfm_Registration.setText("Cadastro");
        Jfm_Registration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Jfm_RegistrationMenuClient.setText("Clientes");
        Jfm_RegistrationMenuClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jfm_RegistrationMenuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jfm_RegistrationMenuClientActionPerformed(evt);
            }
        });
        Jfm_Registration.add(Jfm_RegistrationMenuClient);

        Jfm_RegistrationMenuEmployee.setText("Funcionários");
        Jfm_RegistrationMenuEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jfm_RegistrationMenuEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jfm_RegistrationMenuEmployeeActionPerformed(evt);
            }
        });
        Jfm_Registration.add(Jfm_RegistrationMenuEmployee);

        Jfm_RegistrationMenuMenu.setText("Cardápio");
        Jfm_RegistrationMenuMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jfm_RegistrationMenuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jfm_RegistrationMenuMenuActionPerformed(evt);
            }
        });
        Jfm_Registration.add(Jfm_RegistrationMenuMenu);

        Jfm_RegistrationMenuDeliveryman.setText("Entregador");
        Jfm_RegistrationMenuDeliveryman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jfm_RegistrationMenuDeliveryman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jfm_RegistrationMenuDeliverymanActionPerformed(evt);
            }
        });
        Jfm_Registration.add(Jfm_RegistrationMenuDeliveryman);

        jMenuBar1.add(Jfm_Registration);

        Jfm_Cashier.setText("Caixa");
        Jfm_Cashier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Jfm_CashierRequest.setText("Pedido");
        Jfm_CashierRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jfm_Cashier.add(Jfm_CashierRequest);

        jMenuBar1.add(Jfm_Cashier);

        Jfm_Report.setText("Relatórios");
        Jfm_Report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(Jfm_Report);

        Jfm_Exit.setText("Sair");
        Jfm_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(Jfm_Exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jfm_RegistrationMenuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jfm_RegistrationMenuMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jfm_RegistrationMenuMenuActionPerformed

    private void Jfm_RegistrationMenuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jfm_RegistrationMenuClientActionPerformed
        clientIntFrameform = new ClientIntFrameform();
        scrt.add(clientIntFrameform);
        clientIntFrameform.setVisible(true);
    }//GEN-LAST:event_Jfm_RegistrationMenuClientActionPerformed

    private void Jfm_RegistrationMenuDeliverymanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jfm_RegistrationMenuDeliverymanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jfm_RegistrationMenuDeliverymanActionPerformed

    private void Jfm_RegistrationMenuEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jfm_RegistrationMenuEmployeeActionPerformed
        employeeIntFrameform = new EmployeeIntFrameform();
        scrt.add(employeeIntFrameform);
        employeeIntFrameform.setVisible(true);
    }//GEN-LAST:event_Jfm_RegistrationMenuEmployeeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jfm_Cashier;
    private javax.swing.JMenuItem Jfm_CashierRequest;
    private javax.swing.JMenu Jfm_Exit;
    private javax.swing.JMenu Jfm_Registration;
    private javax.swing.JMenuItem Jfm_RegistrationMenuClient;
    private javax.swing.JMenuItem Jfm_RegistrationMenuDeliveryman;
    private javax.swing.JMenuItem Jfm_RegistrationMenuEmployee;
    private javax.swing.JMenuItem Jfm_RegistrationMenuMenu;
    private javax.swing.JMenu Jfm_Report;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
