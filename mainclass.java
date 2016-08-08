import java.util.Arrays;
import java.util.Scanner;
class mainclass {
int sub(int number,int digit){
int d=number;
int c=0;
while(number!=0)
{
c++;
number=number/10;
}
int b[]=new int[c];
int i=0;
while(d!=0)
{
b[i]=d%10;i++;
d=d/10;
}
Arrays.sort(b);
int x[]=new int[c-digit];
for(int i1=0;i1<digit-1;i1++)
{
x[i1]=b[i1];//System.out.println(x[i1]);
}
String str=x.toString();
int out=Integer.parseInt(str);
return out;
}
}
class guvi
{
public static void main(String[] args) {
mainclass g=new mainclass();
Scanner a=new Scanner(System.in);
System.out.println("Enter the number:");
System.out.println(g.sub(a.nextInt(),a.nextInt()));
}
}
