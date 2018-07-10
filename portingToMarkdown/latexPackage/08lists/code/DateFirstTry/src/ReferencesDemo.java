
public class ReferencesDemo {
	public static final void main(String[] args) {
		Date date1 = new Date(1,"February",2010);
		Date date2 = date1;
		date2.setDate(3, "March", 1980);
		assert date1.getDay() == 1;
		System.out.println(date1);
	}
}
