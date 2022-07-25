/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.RequestScreenDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class RequestScreenController {
    
    RequestScreenDAO RequestScreenD;
    
    public RequestScreenController(){
        RequestScreenD = new RequestScreenDAO();
    }
    
    public void findControll(DefaultTableModel mModel){
        RequestScreenD.ShowRequest(mModel);
    }    
    
}
