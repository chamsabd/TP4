/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author chams
 */
public class SavingsAccount extends BankAccount {
    private Double interestRate;

    public SavingsAccount( Integer accountNumber, Double balance,Double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
   
    
    
    public Double calculateInterest(){
        return super.balance*interestRate/100;
    }
    public Double getInterestRate(){
        return this.interestRate;
    }
    @Override
     public void withdraw(double montant){
        balance-=montant-1;
    }
}
