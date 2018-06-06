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
public class StringHandling {
    public static void main(String args[]){
        String str1="Test";
        String str2= new String("Java");
        
        
        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);

        String str3= str1 + str2;
        str3= str2.concat(str1);
        
        System.out.println("str3 : " + str3);
        
        int len = str2.length();
        System.out.println("len : " + len);
        
        str2= "Test string";
        
        for(int i=0; i<=str2.length()-1; i+=2){
            System.out.println(str2.charAt(i) + " ");
            
        }
        
    }
    
}
