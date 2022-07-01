/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.EmployeeBeans;
import DAO.EmployeeDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class EmployeeController {
    
    EmployeeDAO EmployeeD;
    
    public EmployeeController(){
        EmployeeD = new EmployeeDAO();
    }
    
    public boolean checkData(EmployeeBeans Employee){
        if(Employee.getNameEmp().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Employee.getOccupationEmp().equals("Selecione um Cargo")){
            JOptionPane.showMessageDialog(null, "Selecione um Cargo", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        EmployeeD.insertEmployee(Employee);
        
        return true;
    }    
    
    public String CodControll(){
        return EmployeeD.nextEmployee();
    }
    
    public void findControll(String sSearch, DefaultTableModel mModel){
        EmployeeD.employeeFind(sSearch, mModel);
    }
    
    public EmployeeBeans fillFielsControll(int Cod){
        return EmployeeD.fillFiels(Cod);    
    }
    
    public boolean checkDataEdit(EmployeeBeans Employee){
        if(Employee.getNameEmp().equals(" ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }

        if(Employee.getOccupationEmp().equals("Selecione um Cargo")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Cargo", "Error", 0, new ImageIcon("img/dberro.png"));  
            return false;
        }
        
        EmployeeD.employeeEdit(Employee);
        
        return true;
    }        
       
}
