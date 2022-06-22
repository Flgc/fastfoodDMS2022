/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ClientBeans;
import Utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Utility.Brokers;

/**
 *
 * @author fabio
 */
public class ClientDAO {
    public ClientDAO(){
    }
    
    public void insertClient(ClientBeans client) {
        try {
            String SQLInsertion = "insert tb_client (  name_cli, adress_cli, district_cli, state_cli, phone_cli, email_cli"
                    + ", zip_cli, date_cad_cli) values (?, ? ,?, ?, ?, ?, ?, ?)";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, client.getNameCli());
            st.setString(2, client.getAdressCli());
            st.setString(3, client.getDistrictCli());
            st.setString(4, client.getStateCli());
            st.setString(5, client.getPhoneCli());
            st.setString(6, client.getEmailCli());
            st.setString(7, client.getZipCli());
            st.setString(8, Brokers.DateConverterBrToUs(client.getDateCli()));
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }
    }
    
}