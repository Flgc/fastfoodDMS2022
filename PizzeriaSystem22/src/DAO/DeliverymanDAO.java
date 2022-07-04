/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.DeliverymanBeans;
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
public class DeliverymanDAO {
    public DeliverymanDAO(){        
    }

    public void insertDeliveryman(DeliverymanBeans Deliveryman) {
        try {
            String SQLInsertion = "insert into tb_deliveryman (name_del, status_del, date_cad_del)"
                    + " values (?, ? ,?)";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Deliveryman.getNameDel());
            st.setString(2, "Livre");
            st.setString(3, Brokers.DateConverterBrToUs(Deliveryman.getDateCadDel()));
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entregador Salvo com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Entregador no Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }
    }
    
    public String nextDeliveryman() {
        String SQLSelection = "select * from tb_deliveryman order by cod_del desc limit 1";
        try {
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                return (Integer.parseInt(rs.getString("cod_del")) + 1) + " ";
            }
            else {
                return "1";
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar o Entregador", "Error", 0, new ImageIcon("img/btn_sair.png"));    
           return "0";
        }
    }
    
    public void deliverymanFind(String sSearch, DefaultTableModel mModel){        
        try {        
        String SQLSelection = "select * from tb_deliveryman where name_del like '%" + sSearch + "%' ";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            mModel.addRow(new Object[] {rs.getString("cod_del"), rs.getString("name_del"), 
                Brokers.DateConverterUsToBr(rs.getString("date_cad_del"))});
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Entregador", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }        
    }
    
    public DeliverymanBeans fillFiels(int Cod){
        DeliverymanBeans Employee = new DeliverymanBeans();        
        try {        
        String SQLSelection = "select * from tb_deliveryman where cod_del = ?";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        st.setInt(1, Cod);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            Employee.setCodDel(rs.getInt("cod_del"));
            Employee.setNameDel(rs.getString("name_del"));
            Employee.setDateCadDel(Brokers.DateConverterUsToBr(rs.getString("date_cad_del")));
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Entregador", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }   
        
        return Employee;
    }
    
    public void deliverymanEdit(DeliverymanBeans Deliveryman){
        try {
            String SQLInsertion = "update tb_deliveryman set name_del = ? where cod_del  = ?";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Deliveryman.getNameDel());
            st.setInt(2, Deliveryman.getCodDel());
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entregador Editado com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar Entregador no Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }    
    }
    
}
