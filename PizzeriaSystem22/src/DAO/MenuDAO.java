/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.MenuBeans;
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
public class MenuDAO {
    public MenuDAO(){        
    }
    
    public void insertMenu(MenuBeans Menu) {
        try {
            String SQLInsertion = "insert into tb_menu (description_men, type_men, price_men, date_cad_men)"
                    + " values (?, ? ,?,?)";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Menu.getDescriptionMen());
            st.setString(2, Menu.getTypeMen());
            st.setDouble(3, Menu.getPriceMen());
            st.setString(4, Brokers.DateConverterBrToUs(Menu.getDateCadMen()));
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cardápio Salvo com Sucesso!", "Atenção !", 1, 
                    new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Cardápio no Banco", "Error", 0, 
                    new ImageIcon("img/btn_sair.png"));            
        }
    }
    
    public String nextMenu() {
        String SQLSelection = "select * from tb_menu order by cod_men desc limit 1";
        try {
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                return (Integer.parseInt(rs.getString("cod_men")) + 1) + " ";
            }
            else {
                return "1";
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar o Cardápio", "Error", 0, 
                   new ImageIcon("img/btn_sair.png"));    
           return "0";
        }
    }
    
    public void menuFind(String sSearch, DefaultTableModel mModel){        
        try {        
        String SQLSelection = "select * from tb_menu where description_men like '%" + sSearch + "%' ";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            mModel.addRow(new Object[] {rs.getString("cod_men"), rs.getString("description_men"), 
                rs.getString("type_men"), rs.getDouble("price_men"),
                Brokers.DateConverterUsToBr(rs.getString("date_cad_men"))});
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cardápio", "Error", 0, 
                    new ImageIcon("img/btn_sair.png"));    
        }        
    }
    
    public MenuBeans fillFiels(int Cod){
        MenuBeans Menu = new MenuBeans();        
        try {        
        String SQLSelection = "select * from tb_menu where cod_men = ?";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        st.setInt(1, Cod);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            Menu.setCodMen(rs.getInt("cod_men"));            
            Menu.setDescriptionMen(rs.getString("description_men"));
            Menu.setTypeMen(rs.getString("type_men"));
            Menu.setPriceMen(rs.getDouble("price_men"));
            Menu.setDateCadMen(Brokers.DateConverterUsToBr(rs.getString("date_cad_men")));
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cardápio", "Error", 0, 
                    new ImageIcon("img/btn_sair.png"));    
        }   
        
        return Menu;
    }
    
    public void menuEdit(MenuBeans Menu){
        try {
            String SQLInsertion = "update tb_menu set description_men = ?, type_men = ?, price_men = ? where"
                    + " cod_men  = ?";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Menu.getDescriptionMen());
            st.setString(2, Menu.getTypeMen());
            st.setDouble(3, Menu.getPriceMen());
            st.setInt(4,Menu.getCodMen());
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cardápio Editado com Sucesso!", "Atenção !", 1, 
                    new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar Cardápio no Banco", "Error", 0,
                    new ImageIcon("img/btn_sair.png"));            
        }    
    }
    
}