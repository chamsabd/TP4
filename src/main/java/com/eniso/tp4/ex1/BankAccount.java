/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

/**
 *
 * @author chams
 */
public class BankAccount {
    protected Integer accountNumber;
    protected Double balance;

    public BankAccount(Integer accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    
    public void deposit(double montant){
        balance+=montant;
    }
        public void withdraw(double montant){
        balance-=montant;
    }
        public Double getBalance(){
            return this.balance;
        }
}
