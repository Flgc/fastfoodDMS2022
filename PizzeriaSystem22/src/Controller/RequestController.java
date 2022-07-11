/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.RequestDAO;
import java.util.List;

/**
 *
 * @author fabio
 */
public class RequestController {
    
    RequestDAO RequestD;

    public RequestController() {
        RequestD = new RequestDAO();
    } 
    
    public void itensController(String sSearch, List<String>ItemsList){
        RequestD.itensFind(sSearch, ItemsList);
   }  
    
}
