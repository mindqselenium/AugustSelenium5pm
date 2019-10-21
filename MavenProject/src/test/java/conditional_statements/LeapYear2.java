package conditional_statements;

public class LeapYear2 {

	public static void main(String[] args) {
		int year=2100;
		//2000, 2400, 2800
		if(year%400==0)
			System.out.println("Leap year");
		else if(year%4==0) {//2016, 2020, 2024
			if(year%100==0)
				System.out.println("Non leap year");
			else
				System.out.println("Leap year");
		}			
		else//2017, 2100, 2300
			System.out.println("Non Leap Year");
		
	}

}
