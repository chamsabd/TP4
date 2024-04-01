/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex1;

import java.util.ArrayList;

/**
 *
 * @author chams
 */
public class Bank {
    private ArrayList<Customer> clients;

    public Bank() {
        this.clients = new ArrayList();
    }
    
    public void addCustomer(Customer client){
        clients.add(client);
    }
    
     public void removeCustomer(Customer client){
       int i= clients.indexOf(client);
       clients.remove(i);
    }
     
     
     public Double getTotalBalance(){
          Double r=0.0;
            for(Customer a:clients){
                r+=a.getTotalAccountBalance();
            }
            return r;
        }
     }

