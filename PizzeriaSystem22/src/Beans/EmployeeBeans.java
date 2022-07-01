/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author fabio
 */
public class EmployeeBeans {
      private int codEmp;
      private String nameEmp;
      private String occupationEmp;
      private String dateCadEmp;
      
      public EmployeeBeans(){
      }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public String getOccupationEmp() {
        return occupationEmp;
    }

    public void setOccupationEmp(String occupationEmp) {
        this.occupationEmp = occupationEmp;
    }

    public String getDateCadEmp() {
        return dateCadEmp;
    }

    public void setDateCadEmp(String dateCadEmp) {
        this.dateCadEmp = dateCadEmp;
    }       
}
