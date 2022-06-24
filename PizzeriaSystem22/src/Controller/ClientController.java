/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ClientBeans;
import DAO.ClientDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
}
