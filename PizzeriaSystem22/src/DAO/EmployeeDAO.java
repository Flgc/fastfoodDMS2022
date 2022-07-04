/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.EmployeeBeans;
import Utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Utility.Brokers;
import  java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class EmployeeDAO {
    public EmployeeDAO(){        
    }

    public void insertEmployee(EmployeeBeans Employee) {
        try {
            String SQLInsertion = "insert into tb_employee (  name_emp, occupation_emp, date_cad_emp)"
                    + " values (?, ? ,?)";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Employee.getNameEmp());
            st.setString(2, Employee.getOccupationEmp());
            st.setString(3, Brokers.DateConverterBrToUs(Employee.getDateCadEmp()));
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Empregado Salvo com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Empregado no Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }
    }
    
    public String nextEmployee() {
        String SQLSelection = "select * from tb_employee order by cod_emp desc limit 1";
        try {
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                return (Integer.parseInt(rs.getString("cod_emp")) + 1) + " ";
            }
            else {
                return "1";
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Buscar o Empregado", "Error", 0, new ImageIcon("img/btn_sair.png"));    
           return "0";
        }
    }
    
    public void employeeFind(String sSearch, DefaultTableModel mModel){        
        try {        
        String SQLSelection = "select * from tb_employee where name_emp like '%" + sSearch + "%' ";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            mModel.addRow(new Object[] {rs.getString("cod_emp"), rs.getString("name_emp"), 
                rs.getString("occupation_emp"), Brokers.DateConverterUsToBr(rs.getString("date_cad_emp"))});
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Empregado", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }        
    }
    
    public EmployeeBeans fillFiels(int Cod){
        EmployeeBeans Employee = new EmployeeBeans();        
        try {        
        String SQLSelection = "select * from tb_employee where cod_emp = ?";  
        PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLSelection);
        st.setInt(1, Cod);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            Employee.setCodEmp(rs.getInt("cod_emp"));
            Employee.setNameEmp(rs.getString("name_emp"));
            Employee.setOccupationEmp(rs.getString("occupation_emp"));
            Employee.setDateCadEmp(Brokers.DateConverterUsToBr(rs.getString("date_cad_emp")));
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Empregado", "Error", 0, new ImageIcon("img/btn_sair.png"));    
        }   
        
        return Employee;
    }
    
    public void employeeEdit(EmployeeBeans Employee){
        try {
            String SQLInsertion = "update tb_employee set name_emp = ?, occupation_emp = ? where cod_emp  = ?";
            PreparedStatement st = DbConnection.getConnection().prepareStatement( SQLInsertion);
            st.setString(1, Employee.getNameEmp());
            st.setString(2, Employee.getOccupationEmp());
            st.setInt(3, Employee.getCodEmp());
            
            st.execute();
            DbConnection.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Empregado Editado com Sucesso!", "Atenção !", 1, new ImageIcon("img/ok.png"));  
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar Empregado no Banco", "Error", 0, new ImageIcon("img/btn_sair.png"));            
        }    
    }
    
}
