import java.io.InputStreamReader;
import java.util.Scanner;
class repeatnumper
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,1};
		int b=a[0];
		int c=0;
		for(int i=1;i<a.length;i++)
		{
			if(b==a[i])
			{
				c++;  
				break;
			}
		}
		if(c>0){
	System.out.println("First element is repeated:");
	}
		else {
			System.out.println("First element is not repeated:");
		}
	}
}
