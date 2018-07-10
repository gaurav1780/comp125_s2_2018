import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	@Test
	public void testDate() {
		Date date = new Date();
		assertEquals("Day", 1, date.getDay());
		assertEquals("Month", "January", date.getMonth());
		assertEquals("Year", 2000, date.getYear());
	}

	@Test
	public void testDateIntStringInt() {
		Date date = new Date(23,"February",2010);
		assertEquals("Day", 23, date.getDay());
		assertEquals("Month", "February", date.getMonth());
		assertEquals("Year", 2010, date.getYear());
	}

	@Test
	public void testToString() {
		Date date = new Date();
		assertEquals("toString", "1 January 2000", date.toString());
	}

	@Test
	public void testEquals() {
		Date date1 = new Date(1,"December", 2012);
		Date date2 = new Date(1,"December", 2012);
		Date date3 = new Date(2,"December", 2012);
		Date date4 = new Date(1,"January", 2012);
		Date date5 = new Date(1,"December", 2013);
		assertEquals(true,date1.equals(date2));
		assertEquals(false,date1.equals(date3));
		assertEquals(false,date1.equals(date4));
		assertEquals(false,date1.equals(date5));
	}
	
	@Test
	public void testSetDate() {
		Date date = new Date();
		date.setDate(12, "March", 2001);
		assertEquals("Day", 12, date.getDay());
		assertEquals("Month", "March", date.getMonth());
		assertEquals("Year", 2001, date.getYear());
	}

	@Test
	public void testGetDay() {
		Date date = new Date(23,"February",2010);
		assertEquals("Day", date.getDay(),23);

	}

	@Test
	public void testGetMonth() {
		Date date = new Date(23,"February",2010);
		assertEquals("Month", date.getMonth(),"February");
	}

	@Test
	public void testGetYear() {
		Date date = new Date(23,"February",2010);
		assertEquals("Year", date.getYear(),2010);
	}

}
