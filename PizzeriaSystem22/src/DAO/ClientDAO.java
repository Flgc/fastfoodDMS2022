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
import  java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class ClientDAO {
    public ClientDAO(){        
    }
    
    public void insertClient(ClientBeans Client) {
        try {
            String SQLInsertion = "insert into tb_client (  name_cli, adress_cli, district_cli, state_cli, phone_cli, "
                    + "email_cl, zip_cli, date_cad_cli) values (?, ? ,?, ?, ?, ?, ?, ?)";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Client.getNameCli());
            st.setString(2, Client.getAdressCli());
            st.setString(3, Client.getDistrictCli());
            st.setString(4, Client.getStateCli());
            st.setString(5, Client.getPhoneCli());
            st.setString(6, Client.getEmailCli());
            st.setString(7, Client.getZipCli());
            st.setString(8, Brokers.DateConverterBrToUs(Client.getDateCli()));
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Cliente no Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }
    }
    
    public String nextClient() {
        String SQLSelection = "select * from tb_client order by cod_cli desc limit 1";
        try {
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                return (Integer.parseInt(rs.getString("cod_cli")) + 1) + " ";
            }
            else {
                return "1";
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar o Registro", "Error", 0, new ImageIcon("img/btn_sair.png"));    
           return "0";
        }
    }
    
    public void clientFind(String sSearch, DefaultTableModel mModel){        
        try {        
        String SQLSelection = "select * from tb_client where name_cli like '%" + sSearch + "%' ";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            mModel.addRow(new Object[] {rs.getString("cod_cli"), rs.getString("name_cli"),
                rs.getString("adress_cli"), rs.getString("district_cli"), rs.getString("state_cli"), rs.getString("phone_cli"),
                rs.getString("email_cli"), rs.getString("zip_cli")});
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }        
    }
    
    public ClientBeans fillFiels(int Cod){
        ClientBeans Client = new ClientBeans();        
        try {        
        String SQLSelection = "select * from tb_client where cod_cli = ?";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        st.setInt(1, Cod);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            Client.setCodCli(rs.getInt("cod_cli"));
            Client.setNameCli(rs.getString("name_cli"));
            Client.setAdressCli(rs.getString("adress_cli"));
            Client.setDistrictCli(rs.getString("district_cli"));
            Client.setStateCli(rs.getString("state_cli"));
            Client.setZipCli(rs.getString("zip_cli"));
            Client.setEmailCli(rs.getString("email_cli"));
            Client.setPhoneCli(rs.getString("phone_cli"));
            Client.setDateCli(Brokers.DateConverterUsToBr(rs.getString("date_cad_cli")));
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }   
        
        return Client;
    }
    
    public void clientEdit(ClientBeans Client){
        try {
            String SQLInsertion = "update tb_client set name_cli = ?, adress_cli = ?, district_cli =  ?, state_cli = ?,"
                    + " phone_cli = ?, email_cli = ?, zip_cli = ? where cod_cli  = ?";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Client.getNameCli());
            st.setString(2, Client.getAdressCli());
            st.setString(3, Client.getDistrictCli());
            st.setString(4, Client.getStateCli());
            st.setString(5, Client.getPhoneCli());
            st.setString(6, Client.getEmailCli());
            st.setString(7, Client.getZipCli());
            st.setInt(8, Client.getCodCli());
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Editado com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro no Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }    
    }
    
}
