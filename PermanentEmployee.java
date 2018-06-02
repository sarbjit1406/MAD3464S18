/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class PermanentEmployee extends Employee {
    String designation1;
    float hourlyRate1;
    public PermanentEmployee(){
        super();
        this.designation1= "Unknown";
        this.hourlyRate1= 0.00f;
    }
    public PermanentEmployee(String name, String address, int age,
            String eID, String joiningDate, int deptNo, String designation,
            float hourlyRate){
        super(name, address, age, eID, joiningDate, deptNo);
        this.designation1= designation;
        this.hourlyRate1=hourlyRate;
    }
    
    public String toString(){
           return (super.toString() + "\n Designation: " +
                   this.designation1 + "\n hourlyRate : " +
                   this.hourlyRate1);    
    }
    
}
