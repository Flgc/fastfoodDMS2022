/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.DeliverymanBeans;
import DAO.DeliverymanDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class DeliverymanController {
    
    DeliverymanDAO DeliverymanD;
    
    public DeliverymanController(){
        DeliverymanD = new DeliverymanDAO();
    }
    
    public boolean checkData(DeliverymanBeans Deliveryman){
        if(Deliveryman.getNameDel().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        DeliverymanD.insertDeliveryman(Deliveryman);
        
        return true;
    }    
    
    public String CodControll(){
        return DeliverymanD.nextDeliveryman();
    }
    
    public void findControll(String sSearch, DefaultTableModel mModel){
        DeliverymanD.deliverymanFind(sSearch, mModel);
    }
    
    public DeliverymanBeans fillFielsControll(int Cod){
        return DeliverymanD.fillFiels(Cod);    
    }
    
    public boolean checkDataEdit(DeliverymanBeans Deliveryman){
        if(Deliveryman.getNameDel().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        DeliverymanD.deliverymanEdit(Deliveryman);
        
        return true;
    }        
       
}
