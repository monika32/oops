import java.util.*;
interface  AdvancedArithmetic {
	int divisor_sum(int n);
}
public class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int div=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				div=div+i;
			}
		}
		System.out.println("the sum of divisors of "+n+ " is "+div);
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		MyCalculator cl=new MyCalculator();
		cl.divisor_sum(n);
		
		
	}

}
