package conditional_statements;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int x=100;
		int y=60;
		int z=30;
		
		if(x>y && x>z)
			System.out.println(x);
		else if(y>x && y>z)
			System.out.println(y);
		else
			System.out.println(z);

	}

}
