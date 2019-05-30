import java.util.*;
class Calculate{
	int radius,len,breadth,side,radius1;
	public static void area(int radius,int len,int breadth,int side,int radius1) {
		System.out.println("Area of circle is :"+(2*3.14*radius));
		System.out.println("Area of rectangle is :"+(len*breadth));
		System.out.println("Area of square is :"+(side*side));
		System.out.println("Area of Sphere is :"+(4*3.14*radius1*radius1));
	}
}
public class Area extends Calculate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter circle radius:");
		int radius=s.nextInt();
		System.out.println("enter rectangle length and breadth:");
		int len=s.nextInt();
		int breadth=s.nextInt();
		System.out.println("enter Square side length:");
		int side=s.nextInt();
		System.out.println("enter Sphere radius:");
		int radius1=s.nextInt();
		Area.area(radius,len,breadth,side,radius1);
		
	}

}
