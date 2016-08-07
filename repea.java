class repea{
	int num(int[] a){
		int b=0;while(b!=0){
		for(int i=0;i<a.length-1;i++)
		{
			aa:for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b++;
					break aa;
				}
			}
			
		}}
		return b;
	}
}

class guvi
{
	public static void main(String[] args) {
		repeat r=new repeat();
		int a[]={1,2,1,4,2};
		System.out.println(r.num(a));
	}
}
