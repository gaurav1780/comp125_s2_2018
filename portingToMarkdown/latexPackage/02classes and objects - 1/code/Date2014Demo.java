public class Date2014Demo
{
   public static void main(String[] args)
   {
        Date2014 myDate;
        myDate = new Date2014( );
        myDate.day   = 31;
        myDate.month = "December";
        System.out.println("A date this year:");
        myDate.writeOutput( );
    }
}
