import java.util.*;
class Critter {
	public void born() {
		System.out.println("default new born butterfly.....");
	}
	public void fly() {
		System.out.println("default flying.....");
	}
	public void sleep() {
		System.out.println("default sleeping.....");
	}
	public void movement(int choice) {
		int i=1;
		while(choice!=0) {
			if(i%2==0) {
				System.out.println("X");
				i++;
			}
			else {
				System.out.println(" A");
				i++;
			}
			choice--;
		}
	}
}
public class Butterfly extends Critter{
	public void born(String born) {
		System.out.println("called new "+born+"  butterfly.....");
	}
	public void fly(String fly) {
		System.out.println(fly+" .....");
	}
	public void sleep(String sleep) {
		System.out.println(sleep+".....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Butterfly b=new Butterfly();
		System.out.println("calling default methods .....");
		b.born();
		b.fly();
		b.sleep();
		System.out.println();
		System.out.println("calling other than default methods.....");
		b.born("born");
		b.fly("fly");
		b.sleep("sleep");
		System.out.println("view butterfly movement....enter number of movements to show");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		s.close();
		b.movement(choice);
		

	}

}
