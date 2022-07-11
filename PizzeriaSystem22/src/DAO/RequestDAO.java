/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utility.DbConnection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            JOptionPane.showMessageDialog(null, "Erro ao Realizar a Pesquisa", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }        
    }      
}
