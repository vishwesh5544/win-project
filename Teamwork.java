package cwk4; 


/**
 * Details of your team
 * 
 * @author (Goyani) 
 * @version (25/4)
 */
public class Teamwork
{
    private String[] details = new String[12];
    
    public Teamwork()
    {
        details[0] = "team number";

	details[10] = "Goyani";
        details[11] = "Palak";
        details[12] = "20072966";
        
        details[1] = "Lukhi";
        details[2] = "Paras";
        details[3] = "20073482";

        details[4] = "Radadiya";
        details[5] = "Rohan";
        details[6] = "20069608";

        details[7] = "Patel";
        details[8] = "Jay";
        details[9] = "21001195";

    }
    
    public String[] getTeamDetails()
    {
        return details;
    }
    
    public void displayDetails()
    {
        for(String temp:details)
        {
            System.out.println(temp.toString());
        }
    }
}
        
