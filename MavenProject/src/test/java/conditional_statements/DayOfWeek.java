package conditional_statements;

public class DayOfWeek {

	public static void main(String[] args) {
		int x=5;//1-7

		switch(x) {
			case 1: 
				System.out.println("Sunday");
				break;
			case 2: 
				System.out.println("Monday");
				break;
			case 3: 
				System.out.println("Tueday");
				break;
			case 4: 
				System.out.println("Wedday");
				break;
			case 5: 
				System.out.println("Thuday");
				break;
			case 6: 
				System.out.println("Friday");
				break;
			case 7: 
				System.out.println("Satday");
				break;
			default:
				System.out.println("Invalid number");
		}
		
		System.out.println("After switch-case");
		
	}

}
