/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class RequestScreenDAO {
    
    public RequestScreenDAO(){
    } 

    
    public void ShowRequest(DefaultTableModel mModel){
              try {        
                    String SQLSelection = "select * from tb_request order by cod_req desc limit 15";  
                    PreparedStatement st = DbConnection.getConnection().prepareStatement(SQLSelection);
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                        mModel.addRow(new Object[] {rs.getString("cod_req"), rs.getString("date_cad_req"),
                            rs.getString("time_cad_req"), rs.getString("status_req")});
                    }
             } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Realizar a Pesquisa", "Error", 0, 
                                new ImageIcon("img/btn_sair.png"));    
             }  
    }    
    
}
