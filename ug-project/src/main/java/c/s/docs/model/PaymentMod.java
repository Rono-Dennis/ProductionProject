/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.model;

import lombok.Data;

/**
 *
 * @author John.Simiyu
 */
 
public class PaymentMod {

    private String ID, INVOICE_ID,  MOD_TYPE, REF_NUMBER, CLAIM_ID, CUST_ID;
    private Double AMOUNT;

    public PaymentMod() {
    }

    public PaymentMod(String ID, String INVOICE_ID, String MOD_TYPE, String REF_NUMBER, String CLAIM_ID, String CUST_ID, Double AMOUNT) {
        this.ID = ID;
        this.INVOICE_ID = INVOICE_ID;
        this.MOD_TYPE = MOD_TYPE;
        this.REF_NUMBER = REF_NUMBER;
        this.CLAIM_ID = CLAIM_ID;
        this.CUST_ID = CUST_ID;
        this.AMOUNT = AMOUNT;
    }

    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getINVOICE_ID() {
        return INVOICE_ID;
    }

    public void setINVOICE_ID(String INVOICE_ID) {
        this.INVOICE_ID = INVOICE_ID;
    }

    public String getMOD_TYPE() {
        return MOD_TYPE;
    }

    public void setMOD_TYPE(String MOD_TYPE) {
        this.MOD_TYPE = MOD_TYPE;
    }

    public String getREF_NUMBER() {
        return REF_NUMBER;
    }

    public void setREF_NUMBER(String REF_NUMBER) {
        this.REF_NUMBER = REF_NUMBER;
    }

    public String getCLAIM_ID() {
        return CLAIM_ID;
    }

    public void setCLAIM_ID(String CLAIM_ID) {
        this.CLAIM_ID = CLAIM_ID;
    }

    public String getCUST_ID() {
        return CUST_ID;
    }

    public void setCUST_ID(String CUST_ID) {
        this.CUST_ID = CUST_ID;
    }

    public Double getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(Double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    @Override
    public String toString() {
        return "PaymentMod{" + "ID=" + ID + ", INVOICE_ID=" + INVOICE_ID + ", MOD_TYPE=" + MOD_TYPE + ", REF_NUMBER=" + REF_NUMBER + ", CLAIM_ID=" + CLAIM_ID + ", CUST_ID=" + CUST_ID + ", AMOUNT=" + AMOUNT + '}';
    }

   

}








