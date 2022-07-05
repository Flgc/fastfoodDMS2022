/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.MenuBeans;
import DAO.MenuDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class MenuController {
    
    MenuDAO MenuD;
    
    public MenuController(){
        MenuD = new MenuDAO();
    }
    
    public boolean checkData(MenuBeans Menu){
        if(Menu.getDescriptionMen().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Discriminação", "Error", 0,
                    new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Menu.getTypeMen().equals("Selecione um Tipo")){
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Error", 0,
                    new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        if(Menu.getPriceMen().equals(0)){
            JOptionPane.showMessageDialog(null, "Preencha o campo Preço", "Error", 0, 
                    new ImageIcon("img/dberro.png"));  
            return false;
        }        
        
        MenuD.insertMenu(Menu);
        
        return true;
    }    
    
    public String CodControll(){
        return MenuD.nextMenu();
    }
    
    public void findControll(String sSearch, DefaultTableModel mModel){
        MenuD.menuFind(sSearch, mModel);
    }
    
    public MenuBeans fillFielsControll(int Cod){
        return MenuD.fillFiels(Cod);    
    }
    
    public boolean checkDataEdit(MenuBeans Menu){
        if(Menu.getDescriptionMen().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Discriminação", "Error", 0,
                    new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Menu.getTypeMen().equals("Selecione um Item")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Tipo", "Error", 0,
                    new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        if(Menu.getPriceMen().equals(0)){
            JOptionPane.showMessageDialog(null, "Preencha o campo Valor", "Error", 0,
                    new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        MenuD.menuEdit(Menu);
        
        return true;
    }        
       
}
