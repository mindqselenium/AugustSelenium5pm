package conditional_statements;

public class LeapYear {

	//2016, 2017, 2000, 2100
	
	//2016, 2017, 2100
	public static void main(String[] args) {
		int year=2016;
		
		if(year%400==0)//2000, 2400, 2800
			System.out.println("Leap year");
		else if(year%4==0 && year%100!=0)//2016, 2020, 2024
			System.out.println("Leap year");
		else//2017, 2100, 2300
			System.out.println("Non Leap Year");
		
	}

}
