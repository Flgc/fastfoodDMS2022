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
public class DeliverymanBeans {
      private int codDel;
      private String nameDel;
      private String statusDel;
      private String dateCadDel;
      
      public DeliverymanBeans(){
      }

    public int getCodDel() {
        return codDel;
    }

    public void setCodDel(int codDel) {
        this.codDel = codDel;
    }

    public String getNameDel() {
        return nameDel;
    }

    public void setNameDel(String nameDel) {
        this.nameDel = nameDel;
    }

    public String getStatusDel() {
        return statusDel;
    }

    public void setStatusDel(String statusDel) {
        this.statusDel = statusDel;
    }

    public String getDateCadDel() {
        return dateCadDel;
    }

    public void setDateCadDel(String dateCadDel) {
        this.dateCadDel = dateCadDel;
    }
}
