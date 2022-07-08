/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ClientBeans;
import DAO.ClientDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class ClientController {
    
    ClientDAO ClientD;
    
    public ClientController(){
        ClientD = new ClientDAO();
    }
    
    public boolean checkData(ClientBeans Client){
        if(Client.getNameCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getAdressCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Endereço", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        if(Client.getDistrictCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Bairro", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getStateCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Estado", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getPhoneCli().equals("(  )      -    ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getEmailCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Email", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getZipCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Cep", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }  
        
        ClientD.insertClient(Client);
        
        return true;
    }    
    
    public String CodControll(){
        return ClientD.nextClient();
    }
    
    public void findControll(String sSearch, DefaultTableModel mModel){
        ClientD.clientFind(sSearch, mModel);
    }
    
    public void findControll(String sSearch, List<String> sList){
        ClientD.clientFind(sSearch, sList);
    }
    
    public ClientBeans fillFielsControll(int Cod){
        return ClientD.fillFiels(Cod);    
    }
    
    public boolean checkDataEdit(ClientBeans Client){
        if(Client.getNameCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getAdressCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Endereço", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        if(Client.getDistrictCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Bairro", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getStateCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Estado", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getPhoneCli().equals("(  )      -    ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getEmailCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Email", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Client.getZipCli().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Cep", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }  
        
        ClientD.clientEdit(Client);
        
        return true;
    }  
       
       
}
