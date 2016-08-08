import java.io.InputStreamReader;
import java.util.Scanner;


class guvi1
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=s.nextInt();
	int b=a,e=a,h=a;
	int c[]=new int[100];
	int d=0;
	while(a!=0)
	{
		d++;
		a=a/10;
	}
	for(int i=0;i<d;i++)
	{
		while(b!=0){
		c[i]=b%10;
		b=b/10;
		}
	}int f=1;
	for(int j=0;j<d;j++)
	{
		while(e!=0){
		f=f*e%10;
		e=e/10;}
		
	}
	int g=h*f;
	System.out.println(g);
	}
}
