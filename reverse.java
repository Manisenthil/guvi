import java.io.InputStreamReader;
import java.util.Scanner;
class reverse
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character:");
	String a=s.nextLine();
	StringBuffer b=new StringBuffer(a);
	b.reverse();
	a=b.toString();
	System.out.println(a);
	
	}
}
