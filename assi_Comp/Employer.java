
/**
 * Write a description of class Employer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employer{
    private String name;
    private String email;
    private String password;
    private Employees employees;
    private STP stp;
    
    Employer(){
    
    }
  public Employer(String name, String email, String password, Employees employees, STP stp) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.employees = employees;
        this.stp = stp;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public STP getStp() {
        return stp;
    }

    public void setStp(STP stp) {
        this.stp = stp;
    }
      
}