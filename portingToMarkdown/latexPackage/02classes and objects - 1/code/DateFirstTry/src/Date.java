/**
 * This class implements dates
 * @author Diego Molla
 *
 */
public class Date {
	
	///////////////////////////////////////////////////
	// Private variables
	///////////////////////////////////////////////////
    private String month_; 
    private int day_;
    private int year_; //a four digit number.

    ///////////////////////////////////////////////////
    // Public methods
    ///////////////////////////////////////////////////
    
    /**
     * Default constructor
     */
    public Date() {
    	month_ = "January";
    	day_ = 1;
    	year_ = 2000;
    }
    
    /**
     * Constructor with parameters
     * @param theDay
     * @param theMonth
     * @param theYear
     */
    public Date(int theDay, String theMonth, int theYear){
    	setDate(theDay,theMonth,theYear);
    }
    
    /**
     * Represent the date as a string
     */
    public String toString()
    {
        return(day_ + " " + month_ + " " + year_); 
    }
    
    
    /**
     * Compare dates
     * @param date
     * @return true if the date parameter is equal to the internal date
     */
    public boolean equals(Date date)
    {
    	return (day_   == date.day_ &&
                month_.equals(date.month_) &&
                year_  == date.year_);
    }
    
    /**
     * Set the date
     * @param theDay
     * @param theMonth
     * @param theYear
     */
    public void setDate(int theDay, String theMonth, int theYear) {
        day_ = theDay;
        month_ = theMonth;
        year_ = theYear;
    }
    
    /**
     * Get the day
     * @return the value of the day
     */
    public int getDay() {
    	return day_;
    }
    
    /**
     * Get the month
     * @return the string representing the month
     */
    public String getMonth() {
    	return month_;
    }
    
    /**
     * Get the year
     * @return the value of the year
     */
    public int getYear() {
    	return year_;
    }
    
    public static final void main(String[] args)
    {
    	Date date1 = new Date(12,"August",2012);
    	Date date2 = new Date(13,"August",2012);
    	if (date1.equals(date2))
    	  System.out.println("The two dates are the same");
    	else
    	{
    	  System.out.println("Date "+date1.toString()+
    	                     " differs from "+date2.toString());

    	  // The following statement does the same
    	  System.out.println("Date "+date1+
    	                     " differs from "+date2);
    	}
    }
}
