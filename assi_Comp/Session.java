import java.util.ArrayList;
/**
 * Write a description of class Session here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Session
{
    
// Create main class for entry of details using scanner object
     public static void main(String[] args) {
        //Initialise the scanner class
        ///call the static methods in util for the inputs
        // Employer Details
        String email=In.nextLine();
        String password=In.nextLine();
        // Employee Details
        String empName=In.nextLine();
        String empEmail=In.nextLine();
        String empPhone=In.nextLine();
        String empAddress=In.nextLine();
        String empTFN=In.nextLine();
        String empType=In.nextLine();
        int empPaidHours=In.nextInt();
        double empHourlyRate= In.nextDouble();
        
        String Pname=Utils.string("Name");
        String Pphone=Utils.string("Phone");
        String Paddress=Utils.string("Address");
        String Ptfn=Utils.string("TFN");
        String Pemptype=Utils.string("Type");
        int Ppaidhours=Utils.number("Hours");
        double Phourlyrate=Utils.amount("Rate");
        //call on appropriate getters and setters
        //for the  employer and employees
        //Call the employer class
        Employer emp= new Employer();
        emp.setEmail(email);
        emp.setPassword(password);
        //Employee
        Employee employee= new Employee();
        employee.setName(empName);
        employee.setEmail(empEmail);
        employee.setPhone(empPhone);
        employee.setAddress(empAddress);
        employee.setTFN(empTFN);
        employee.setType(empType);
        employee.setHours(empPaidHours);
        employee.setPayPerHour(empHourlyRate);
       
        }
        //Prompt for Employer information
        public void EmployerInfo(){
        //Formatting 
        String Pemail=Utils.string("Email");
        String email=In.nextLine();
        //Formatting 
        String Pass=Utils.string("Password");
        String password=In.nextLine();
        // Check if the values match from the employers class Arralist
        //Instatiate the Employer's class
  
    
        
        
        }
        
        
        }

