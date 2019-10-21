package conditional_statements;

public class OperatorsDemo {

	public static void main(String[] args) {
		int group = 3;
		
		int x=10, y=5, z=12;
		
		if(group==1) {
			//1. Arithmetic Operators: +, -, *, /, %
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
		}else if(group==2) {
			//2. Relation operators: <, >, <=, >=, ==, !=
			System.out.println(x<y);
			System.out.println(x<=y);
			System.out.println(x>y);
			System.out.println(x>=y);
			System.out.println(x==y);
			System.out.println(x!=y);
		}else if(group==3) {
			//3. Unary operator: ++, --
			System.out.println(x++);//x=x+1; 10
			System.out.println(++y);//y=y+1; 6
			System.out.println(x--);//x=x-1; 11
			System.out.println(--y);//y=y-1;
		}else if(group==4) {
			//4. Logical operators: &&, ||
			System.out.println((x>y)&&(x>z));//T&&F=F
			System.out.println((x>y)||(x>z));//T||F=T	
		}
	}
}




















