/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class DayFour {


public static void main(String args[]){       
Employee emp1 = new Employee ("Rutvi" , "Toronto", 23, "E101", "12 May 2017", 10);
emp1.name = "Rutvi";
emp1.address = "Toronto";
emp1.age = 23;
System.out.println("Name: " +emp1.name + 
        "\n Address: " + emp1.address + "\n Age: " + emp1.age);
System.out.println(emp1.toString());
    
TemporaryEmployee tE1= new TemporaryEmployee("Sukhwinder", 
        "Brampton", 22,"T123", "01 May 2018",20, "iOS Developer", 80.50f);
System.out.println(tE1.toString());

PermanentEmployee pE1= new PermanentEmployee("Sarbjit", 
        "Toronto", 26,"P123", "01 Apr 2018",10, "Web developer", 90.00f);
System.out.println(pE1.toString());

}
    
}
