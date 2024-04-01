/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author chams
 */
public class CheckingAccount  extends BankAccount{
    private Double overdraftAllowed;

    public CheckingAccount( Integer accountNumber, Double balance,Double overdraftAllowed) {
        super(accountNumber, balance);
        this.overdraftAllowed = overdraftAllowed;
    }
    
    
    public void setOverdraftAllowed(Double overdraftAllowed){
        this.overdraftAllowed=overdraftAllowed;
    }
    public Double getOverdraftAllowed(){
        return this.overdraftAllowed;
    }
    @Override
     public void withdraw(double montant){
        balance-=montant-2;
    }
}
