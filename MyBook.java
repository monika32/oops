import java.util.*;
abstract class Book{
     String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
public class MyBook extends Book {
	String title1;
	void setTitle(String str) {
		System.out.print("the title is :");
	}
	public static void main(String[] args) {
		MyBook b=new MyBook();
		Scanner s=new Scanner(System.in);
		System.out.print("enter title ");
		b.title1=s.nextLine();
		s.close();
		b.setTitle(b.title1);
		b.title=b.title1;
		System.out.print(b.getTitle());
	}
}
