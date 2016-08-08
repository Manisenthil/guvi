import java.util.Scanner;

class sum
{
	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the elements in the array");
for(int i=0;i<a;i++)
{
	arr[i]=in.nextInt();
}
in.close();int temp;
for(int i=0;i<a;i++)
{
	for(int j=0;j<a;j++)
	if(arr[i]<arr[j])
	{
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
}
String sa="";
int len=arr.length;
int t=1; 
for(int k=len-1;k>=0;k--)
{
		sa=sa+arr[k];
if(t%3==0)
{
	sa=sa+",";
}
t++;
}
StringBuffer sb=new StringBuffer(sa);
sb.reverse();
sa=sb.toString();
System.out.println(sa);
}
}
