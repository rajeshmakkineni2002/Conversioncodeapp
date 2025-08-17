import java.util.Date;
public class dateandtime 
{
    public static void main(String args [])
    {
        Date udate =new Date();
        System.out.println("utilDate is : :" + udate);

        long value =udate.getTime();

        java.sql.Date sqlDate = new java.sql.Date(value);
        System.out.println("sqldate is : : " + sqlDate);
    }
}