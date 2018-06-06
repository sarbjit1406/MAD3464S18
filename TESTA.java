/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY5;

/**
 *
 * @author macstudent
 */
public class TESTA extends TESTC implements A, B, C{
    
    public void display(){
        System.out.println("Number inside A : " + number);
        
    }
    public void show(){
        System.out.println(" Show inside B ");
               
    }
    
    public void output(){
        System.out.println("output from c");;
    
}
