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
public class MenuBeans {
    
    private Integer codMen;
    private String descriptionMen;
    private String typeMen;
    private Double priceMen;
    private String dateCadMen;
    
    public MenuBeans(){
    }

    public Integer getCodMen() {
        return codMen;
    }

    public void setCodMen(Integer codMen) {
        this.codMen = codMen;
    }

    public String getDescriptionMen() {
        return descriptionMen;
    }

    public void setDescriptionMen(String descriptionMen) {
        this.descriptionMen = descriptionMen;
    }

    public String getTypeMen() {
        return typeMen;
    }

    public void setTypeMen(String typeMen) {
        this.typeMen = typeMen;
    }

    public Double getPriceMen() {
        return priceMen;
    }

    public void setPriceMen(Double priceMen) {
        this.priceMen = priceMen;
    }

    public String getDateCadMen() {
        return dateCadMen;
    }

    public void setDateCadMen(String dateCadMen) {
        this.dateCadMen = dateCadMen;
    }   
    
}
