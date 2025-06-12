/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Freddy A. Fernández
 */
public class Pay {
    
    // Attributes
    
    private String typePay;
    private double amountPay;
    
    // Methods
    
    // Constructor #1
    public Pay(){}
    
    // Constructor #2
    public Pay(String typePay, double amountPay) {
        this.typePay = typePay;
        this.amountPay = amountPay;
    }
   
    // Getter Methods
    
    public String getTypePay() {
        return typePay;
    }

    public double getAmountPay() {
        return amountPay;
    }
    
    // Setter Methods

    public void setTypePay(String typePay) {
        this.typePay = typePay;
    }

    public void setAmountPay(double amountPay) {
        this.amountPay = amountPay;
    }
    
}
