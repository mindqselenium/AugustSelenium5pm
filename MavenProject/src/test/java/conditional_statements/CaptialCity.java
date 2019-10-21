package conditional_statements;

public class CaptialCity {

	public static void main(String[] args) {
		
		String code="ka";
		
		switch(code) {
			case "ap":
				System.out.println("AMT");
				break;
			case "ts":
				System.out.println("HYD");
				break;
			case "tn":
				System.out.println("CHE");
				break;
			case "ka":
				System.out.println("BNG");
				break;
			default:
				System.out.println("Invalid code");
		}
		

	}

}
