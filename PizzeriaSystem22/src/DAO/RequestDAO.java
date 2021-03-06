/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.RequestBeans;
import Utility.DbConnection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class RequestDAO {
    
   public void itensFind(String sSearch, List<String>ItemsList){        
        try {        
        String SQLSelection = "select * from tb_menu where description_men like '%" + sSearch + "%' ";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
        while(rs.next()){
            ItemsList.add(rs.getString("description_men") );
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Realizar a Pesquisa", "Error", 0, 
                    new ImageIcon("img/btn_sair.png"));    
        }        
    }
   
   public double itemPrice(String sSearch){
          try {        
                String SQLSelection = "select * from tb_menu where description_men = ?";  
                PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLSelection);
                st.setString(1, sSearch);
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    return rs.getDouble("price_men") ;
                }
         } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Realizar a Pesquisa", "Error", 0, 
                            new ImageIcon("img/btn_sair.png"));    
         }  
          return 0;
   }
   
   public int itemCod(String sSearch){
          try {        
                String SQLSelection = "select * from tb_menu where description_men = ?";  
                PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLSelection);
                st.setString(1, sSearch);
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    return rs.getInt("cod_men") ;
                }
         } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Realizar a Pesquisa", "Error", 0, 
                            new ImageIcon("img/btn_sair.png"));    
         }  
          return 0;
   }
      
   public void RequestInsert(String ClientCode, String EmployeeCode, String Total, int TableSize, 
           RequestBeans RequestB){
       Date Date = new Date();
       SimpleDateFormat FormattoDate = new SimpleDateFormat("yyyy-MM-dd");
       SimpleDateFormat FormattoTime = new SimpleDateFormat("HH:mm:ss");
       try { 
                String SQLInsert = "insert into tb_request (cod_cli_req, date_cad_req, total_req, cod_emp_req, "           
               + "cod_del_req, status_req, time_cad_req) values (?, ?, ?, ?, ?, ?, ?)"; 
                
                PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLInsert);
                st.setString(1, ClientCode);           
                st.setString(2, FormattoDate.format(Date));           
                st.setString(3, Total.replace(',', '.'));             // Convert , for . (replace)
                st.setString(4, EmployeeCode);           
                st.setString(5, "1");                                       // deliveryman implements in the future      
                st.setString(6, "Pedido Aberto");           
                st.setString(7, FormattoTime.format(Date));    
                
                st.execute();
                ItemsInsert(ClientCode, EmployeeCode, NextRequestCode(), TableSize, RequestB);
                NextRequestCode();
                DbConnection.getConnection().commit();
                JOptionPane.showMessageDialog(null, "Pedido Salvo com Sucesso!", "Aten????o !", 1, 
                        new ImageIcon("img/ok.png"));                  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Inserir Pedido no Banco", "Error", 0,
                   new ImageIcon("img/btn_sair.png"));   
       }
   } 
   
   public String NextRequestCode() {
       String RequestCod = "0";
       try {                
           String SQLSelection = "select cod_req from tb_request order by cod_req desc limit 1";           
           PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLSelection);
           ResultSet rs = st.executeQuery();
           if(rs.next()){
                 RequestCod = rs.getString("cod_req");
          }           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Recuperar o Pr??ximo c??digo do Pedido no Banco", 
                   "Error", 0, new ImageIcon("img/btn_sair.png"));    
       }
       return RequestCod;
   }
   
   public void ItemsInsert(String ClientCode, String EmployeeCode, String RequestCod, int TableSize,
            RequestBeans RequestB){
       for (int i = 0; i < TableSize; i++) {
            String SQLInsert = "insert into tb_item(cod_del_ite, cod_emp_ite, cod_cli_ite, cod_req_ite, cod_men_ite,"
                    + "quantit_ite) values (?, ?, ?, ?, ?, ?)"; 
           try {
                PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLInsert);
                st.setString(1, "1");                            // deliveryman implements in the future      
                st.setString(2, EmployeeCode);           
                st.setString(3, ClientCode);             
                st.setString(4, RequestCod);           
                st.setInt(5, RequestB.getMenuCode(i));                                      
                st.setInt(6, RequestB.getQuantit(i));           
                
                st.execute();                   
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Itens do Pedido no Banco", 
                   "Error", 0, new ImageIcon("img/btn_sair.png"));    
           }
       }   
   }   
}
