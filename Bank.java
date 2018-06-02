/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Bank {
    String BankName;
    String bID;
    Bank(){
        this.BankName = "Unknown";
        this.bID = "I##";
        
    }
       Bank(String BankName, String bID){
            this.BankName = BankName;
            this.bID= bID;
        
            
       }
    void setBankName(){
        System.out.println("Bank Name: " + BankName);
        
    }
    String getBankName(){
        return BankName;
    }
    void setbID(){
        System.out.println("Bank Id: " + bID);
       
    }
    
    String getbID(){
        return bID;
    }
    public String toString(){
        String data = "Bank Name: " + BankName +
                "\n bID: " + bID;
        return data;
    }
    
    
}
