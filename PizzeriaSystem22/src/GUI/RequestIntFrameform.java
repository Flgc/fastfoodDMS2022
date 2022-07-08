/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Beans.ClientBeans;
import Controller.ClientController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class RequestIntFrameform extends javax.swing.JInternalFrame {
    
    ClientBeans ClientB; 
    ClientController ClientC;
    List<String> sList;

    MaskFormatter TelFormat;
    
    public RequestIntFrameform() {
        initComponents();
        fieldsEnable(false);
        
        sList = new ArrayList<>();
        ClientB = new ClientBeans();
        ClientC = new ClientController();        
        
        panelRequest.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRequest = new javax.swing.JTabbedPane();
        jPn_Clientes = new javax.swing.JPanel();
        btn_Search = new javax.swing.JButton();
        cmb_Clients = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_codCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_dateCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nameCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_adressCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_districtCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_stateCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_zipCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        try {
            TelFormat = new MaskFormatter("(##) #####-####");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo Personalizado", "Error", 0);
        }
        txt_phoneCli = new JFormattedTextField(TelFormat);
        jLabel7 = new javax.swing.JLabel();
        txt_emailCli = new javax.swing.JTextField();
        btn_Closed = new javax.swing.JButton();
        btn_Request = new javax.swing.JButton();
        jPn_Pedido = new javax.swing.JPanel();
        jtf_txt_NameClient = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_RequestPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_RequestQuantit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_RequestCode = new javax.swing.JTextField();
        btn_subt = new javax.swing.JButton();
        btn_Price1 = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_calc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        btn_finish = new javax.swing.JButton();
        btn_ClosedRequest = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pedido");

        btn_Search.setText("Pesquisar");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        cmb_Clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ClientsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        txt_codCli.setEditable(false);
        txt_codCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Data de Cadastro");

        txt_dateCli.setEditable(false);
        txt_dateCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        txt_nameCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Endereço");

        txt_adressCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Bairro");

        txt_districtCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Estado");

        txt_stateCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Cep");

        txt_zipCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Telefone");

        txt_phoneCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("E-mail");

        txt_emailCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btn_Closed.setText("Fechar");
        btn_Closed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClosedActionPerformed(evt);
            }
        });

        btn_Request.setText("Pedido");
        btn_Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPn_ClientesLayout = new javax.swing.GroupLayout(jPn_Clientes);
        jPn_Clientes.setLayout(jPn_ClientesLayout);
        jPn_ClientesLayout.setHorizontalGroup(
            jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPn_ClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPn_ClientesLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_codCli, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dateCli, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPn_ClientesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_phoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emailCli, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
                    .addGroup(jPn_ClientesLayout.createSequentialGroup()
                        .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPn_ClientesLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPn_ClientesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPn_ClientesLayout.createSequentialGroup()
                                .addComponent(txt_nameCli, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_adressCli)))
                    .addGroup(jPn_ClientesLayout.createSequentialGroup()
                        .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPn_ClientesLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_districtCli, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_stateCli, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14)
                                .addComponent(txt_zipCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPn_ClientesLayout.createSequentialGroup()
                                .addComponent(btn_Search)
                                .addGap(27, 27, 27)
                                .addComponent(cmb_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPn_ClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Request)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Closed))
        );
        jPn_ClientesLayout.setVerticalGroup(
            jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPn_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Search)
                    .addComponent(cmb_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_dateCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_codCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nameCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_adressCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_districtCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_stateCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_zipCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_phoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_emailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(jPn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Closed)
                    .addComponent(btn_Request))
                .addContainerGap())
        );

        panelRequest.addTab("Clientes", jPn_Clientes);

        jtf_txt_NameClient.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setText("Item");

        jLabel11.setText("Selecionar");

        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setText("Preço");

        jLabel13.setText("Quantidade");

        jLabel14.setText("Nª do Pedido");

        btn_subt.setText("-");
        btn_subt.setMaximumSize(new java.awt.Dimension(43, 24));
        btn_subt.setMinimumSize(new java.awt.Dimension(43, 24));

        btn_Price1.setText("Preço");

        btn_add.setText("+");

        jLabel15.setText("Total");

        btn_calc.setText("Calcular");
        btn_calc.setMaximumSize(new java.awt.Dimension(43, 24));
        btn_calc.setMinimumSize(new java.awt.Dimension(43, 24));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Item", "Descrição", "Preço", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);

        btn_finish.setText("Finalizar");

        btn_ClosedRequest.setText("Fechar");

        javax.swing.GroupLayout jPn_PedidoLayout = new javax.swing.GroupLayout(jPn_Pedido);
        jPn_Pedido.setLayout(jPn_PedidoLayout);
        jPn_PedidoLayout.setHorizontalGroup(
            jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPn_PedidoLayout.createSequentialGroup()
                .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPn_PedidoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jtf_txt_NameClient, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPn_PedidoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPn_PedidoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPn_PedidoLayout.createSequentialGroup()
                                .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPn_PedidoLayout.createSequentialGroup()
                                        .addComponent(btn_Price1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_RequestPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_RequestQuantit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_RequestCode, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPn_PedidoLayout.createSequentialGroup()
                                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_subt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(429, 429, 429)
                                        .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 70, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPn_PedidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_finish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ClosedRequest))
        );
        jPn_PedidoLayout.setVerticalGroup(
            jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPn_PedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_txt_NameClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_RequestPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_RequestQuantit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_RequestCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Price1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_subt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPn_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_finish)
                    .addComponent(btn_ClosedRequest))
                .addContainerGap())
        );

        panelRequest.addTab("Pedido", jPn_Pedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRequest)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRequest)
        );

        setBounds(200, 50, 959, 543);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClosedActionPerformed
        dispose();
    }//GEN-LAST:event_btn_ClosedActionPerformed

    private void cmb_ClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_ClientsActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        cmb_Clients.removeAllItems();
        sList.clear();
        String SearchBtn = JOptionPane.showInputDialog(null, "Digite o Nome do Cliente", "Pesquisar", 3);
        ClientC.findControll(SearchBtn, sList);
        for(String i:sList){
            cmb_Clients.addItem(i);
        }
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RequestActionPerformed
        panelRequest.setEnabledAt(0,false);
        panelRequest.setEnabledAt(1, true);
        panelRequest.setSelectedIndex(1);
    }//GEN-LAST:event_btn_RequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Closed;
    private javax.swing.JButton btn_ClosedRequest;
    private javax.swing.JButton btn_Price1;
    private javax.swing.JButton btn_Request;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_calc;
    private javax.swing.JButton btn_finish;
    private javax.swing.JButton btn_subt;
    private javax.swing.JComboBox<String> cmb_Clients;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPn_Clientes;
    private javax.swing.JPanel jPn_Pedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtf_txt_NameClient;
    private javax.swing.JTabbedPane panelRequest;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField txt_RequestCode;
    private javax.swing.JTextField txt_RequestPrice;
    private javax.swing.JTextField txt_RequestQuantit;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_adressCli;
    private javax.swing.JTextField txt_codCli;
    private javax.swing.JTextField txt_dateCli;
    private javax.swing.JTextField txt_districtCli;
    private javax.swing.JTextField txt_emailCli;
    private javax.swing.JTextField txt_nameCli;
    private javax.swing.JTextField txt_phoneCli;
    private javax.swing.JTextField txt_stateCli;
    private javax.swing.JTextField txt_zipCli;
    // End of variables declaration//GEN-END:variables

    final void fieldsEnable(boolean value) {
        txt_codCli.setEnabled(value);    
        txt_dateCli.setEnabled(value);    
        txt_adressCli.setEnabled(value);    
        txt_districtCli.setEnabled(value);
        txt_emailCli.setEnabled(value);
        txt_nameCli.setEnabled(value);
        txt_phoneCli.setEnabled(value);
        txt_stateCli.setEnabled(value);
        txt_zipCli.setEnabled(value);    
    }  
}
