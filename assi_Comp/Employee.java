
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String TFN;
    private String type; 
    private int hours;
    private double payPerHour;
    private double income;
    private double rate;
    private double net;
    private double deduction;
    private double superannuation;
    private double superRate=0.9;
    private Employer employer;
    Employee(){
    }
    public Employee(String name, String email, String phone, String address, String TFN, String type, int hours, double payPerHour, Employer employer) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.TFN = TFN;
    this.type = type;
    this.hours = hours;
    this.payPerHour = payPerHour;
    this.employer = employer;
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTFN() {
        return TFN;
    }

    public void setTFN(String TFN) {
        this.TFN = TFN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }
    public double Income(){
    
    double income= hours * payPerHour*52;
    return income;
    }

    public double Rate() {
        double rate=0;
        if (income>=15000 && income<45000){
        rate=0.19;
        }else if (income>=45000 && income<120000){
        rate=0.32;
        }else if (income>=120000 && income<180000){
        rate=0.37;
        }else if (income>=180000){
        rate=0.45;
        }
        return rate;
    }

    public double Net() {
        double net=(income-(income*rate));
        return net;
    }

    public double Deduction() {
         double deduction= income - net;
         return deduction;
    }

    public double Superannuation() {
         double superannuation= income*superRate;
         return superannuation;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    

    
}