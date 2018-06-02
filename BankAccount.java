/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class BankAccount extends Bank {
    String AccountNo;
    String OwnerName;
    String BalanceAmount;
    
    public BankAccount(){
       this.AccountNo ="###";
       this.OwnerName="Unknown";
       this.BalanceAmount= "0000";
    }
    public BankAccount(String BankName, String bID, String AccountNo, 
            String OwnerName, String BalanceAmount){
        super(BankName, bID);
        this.AccountNo= AccountNo;
        this.BalanceAmount= BalanceAmount;
        this.OwnerName= OwnerName;        
    }
    public String toString(){
        String personaldetail= super. toString();
        String data= "\n AccountNo: " + this.AccountNo +
                "\n OwnerName: " + this.OwnerName +
                "\n BalanceAmount: " + this.BalanceAmount;
                
                return personaldetail + data;
    }
    
    
}
