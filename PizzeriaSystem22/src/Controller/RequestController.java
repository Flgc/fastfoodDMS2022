/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.RequestBeans;
import DAO.RequestDAO;
import GUI.RequestIntFrameform;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    
    public double itemPriceController(String sSearch){ 
        return RequestD.itemPrice(sSearch);           
    }   
    
    public int itemCodController(String sSearch){ 
        return RequestD.itemCod(sSearch);           
    } 
    
    public boolean itemVerify(String Price, String Quantit, String Code, String Item){
        
       try {
             int x = Integer.parseInt(Quantit);
             if (x == 0){
                    JOptionPane.showMessageDialog(null, "A Quantidade não pode ser 0", "Error", 0, new ImageIcon("img/dberro.png"));  
                    RequestIntFrameform.txt_RequestQuantit.setText("1");
                    RequestIntFrameform.txt_RequestQuantit.grabFocus();   
                     return false;
              }
            } catch (NumberFormatException Ex) {
                JOptionPane.showMessageDialog(null, "Insira um número inteiro", "Error", 0, new ImageIcon("img/dberro.png"));  
                RequestIntFrameform.txt_RequestQuantit.setText("1");
                RequestIntFrameform.txt_RequestQuantit.grabFocus();   
                 return false;
       }          
        
       if(Quantit.equals("")){
          return false;
        }
       
       if(Price.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Preço", "Error", 0, new ImageIcon("img/dberro.png")); 
            return false;
        }
       
       if(Code.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Código", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

       if(Item.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Item", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }         
       return true;
    }
    
    public void RequestController(String ClientCode, String EmployeeCode, String Total, int TableSize, 
           RequestBeans RequestB){
        RequestD.RequestInsert(ClientCode, EmployeeCode, Total, TableSize, RequestB);
    }
    
    
}
