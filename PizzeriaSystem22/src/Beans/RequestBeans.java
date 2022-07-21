/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabio
 */
public class RequestBeans {
    
    private Integer codReq;
    private Integer codCliReq;
    private String dateCadReq;
    private Double totalReq;
    private Integer codEmpReq;
    private Integer codDelReq;
    private String statusReq;
    private String timeCadReq;
    private List<Integer>MenuCode;
    private List<Integer>Quantit;
    
    public RequestBeans(){
        MenuCode = new ArrayList<>();
        Quantit = new ArrayList<>();
        
    }

    public int getMenuCode(int Position) {
        return MenuCode.get(Position);
    }

    public void setMenuCode(int MenuCode) {
        this.MenuCode.add(MenuCode);
    }
    
    public int getQuantit(int Position) {
        return Quantit.get(Position);
    }

    public void setQuantit(int Quantit) {
        this.Quantit.add(Quantit);
    }
    
    public Integer getCodReq() {
        return codReq;
    }

    public void setCodReq(Integer codReq) {
        this.codReq = codReq;
    }

    public Integer getCodCliReq() {
        return codCliReq;
    }

    public void setCodCliReq(Integer codCliReq) {
        this.codCliReq = codCliReq;
    }

    public String getDateCadReq() {
        return dateCadReq;
    }

    public void setDateCadReq(String dateCadReq) {
        this.dateCadReq = dateCadReq;
    }

    public Double getTotalReq() {
        return totalReq;
    }

    public void setTotalReq(Double totalReq) {
        this.totalReq = totalReq;
    }

    public Integer getCodEmpReq() {
        return codEmpReq;
    }

    public void setCodEmpReq(Integer codEmpReq) {
        this.codEmpReq = codEmpReq;
    }

    public Integer getCodDelReq() {
        return codDelReq;
    }

    public void setCodDelReq(Integer codDelReq) {
        this.codDelReq = codDelReq;
    }

    public String getStatusReq() {
        return statusReq;
    }

    public void setStatusReq(String statusReq) {
        this.statusReq = statusReq;
    }

    public String getTimeCadReq() {
        return timeCadReq;
    }

    public void setTimeCadReq(String timeCadReq) {
        this.timeCadReq = timeCadReq;
    }
}
