import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Conversioncodeapp 
{
    public static void main(String [] args) throws Exception
    {
        //read the input from the user
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter the  date : : (MM-yyyy-dd)");
        String sdate = scanner.next();

        //convert the date from string formant to java util.date
        SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy-dd");
        java.util.Date uDate = sdf.parse(sdate);

        //convert java.util. date to java.sql.date
        long value = uDate.getTime();
         java.sql.Date sqlDate = new java.sql.Date(value);

         //printing all 3 formats of date
         System.out.println(" String format date is : : " + sdate);
         System.out.println( "util date is : : " + uDate);
         System.out.println(" Sql date is : : " + sqlDate); 


         System.out.println("Enter the dom in the following format : : (yyyy-MM-dd)");
         String standardInput =scanner.next();
         java.sql.date sqlStandardInput = java.sql.Date.valueOf(standardInput);
         System.out.println(" String standardinput : : " + standardInput);
         System.out.println( "String sqlstandardinput: " + sqlStandardInput);
         

         scanner.close();
    }    
}
