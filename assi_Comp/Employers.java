


import java.util.ArrayList;
public class Employers
{
 
    private ArrayList<Employer> employers;
     Employers(){
            // Save the employers to an arraylist
        employers= new ArrayList<Employer>();
        //Create a employer object
        Employer employer=new Employer();
        employer.setName("John Smith ");
        employer.setName("Jane Doe");
        employer.setEmail("john.smith@uts.com");
        employer.setEmail("jave.doe@uts.com");
        employer.setPassword("super123");
        employer.setPassword("user222");

        employers.add(employer);

        
        }

}
