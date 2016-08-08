import java.io.InputStreamReader;
import java.util.Scanner;


class guvi3
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character:");
	String a=s.nextLine();int a1=0,a2=0;
	String[] b=a.split(" ");
	for(int i=0;i<b.length;i++)
	{
		char[] c=b[i].toCharArray();
		for(int j=0;j<c.length;j++)
		{
			if((c[j]>=(int)'A'&&c[j]<(int)'M')||(c[j]>=(int)'a'&&c[j]<=(int)'m'))
			{
				a1++;
			}
			else if((c[j]>=(int)'N'&&c[j]<=(int)'Z')||(c[j]>=(int)'n'&&c[j]<=(int)'z'))
			{
				a2++;
			}
		}
		if(a1==a2)
		{
			System.out.println("balanced");
		}
		else {
			System.out.println("not balanced");
		}
	}
	}
}
