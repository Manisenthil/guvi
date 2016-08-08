import java.io.*;
import  java.util.*;

class prime
{
	public int howManyPrimeNumsWillGet(int input1){
		
		if(input1>0){
			int x[]=new int [100];int e=0,f=0;
			for(int b=11;b<=100;b++)
			{
				int d=0;
				for(int i=2;i<b;i++){
					if(b%i==0){
						d=1;
						break;
					}	
				}
				if(d==0){
					x[e]=b;e++;f++;
			
				}
			}
		
		int tmp=0,n=0;
		for(int i=f-1;i>=0;i--){
			for(int j=1;x[i]*j<=input1;j++){
				if(((n=howManyPrimeNumsWillGet(input1-x[i]*j))!=-1)||((input1-x[i]*j)==0))
				{ 
					if(n==-1)
					  	tmp=j;
					  else
						tmp=tmp+j+n; 
						i=0;
						break;
					}
			}
		}
		if(tmp!=0)
			return tmp;
		}
		return -1;
	
	}
	
    public static void main(String args[]){
    	prime obj=new prime();
    	System.out.println(obj.howManyPrimeNumsWillGet(366));
    }
}
