import java.util.*;
public class DecToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter decimal number:");
		int n=s.nextInt();
		// Stack st = new Stack();
		int[] a=new int[n];
		int rem=n;
		int i=0;
		int count=0;
		while(n>0) {
			rem=n%2;
			n=n/2;
			a[i]=rem;
			i++;
			//st.push(rem);
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]);
		}
	//	System.out.println(st);
	}

}
