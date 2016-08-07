class power
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7};
		int b=0;
		for(int i=0;i<a.length-1;i++)
		{
			b=a[i]*a[i];
			
			for(int j=i+1;j<a.length;j++)
			{
				if(b==a[j])
				{
					System.out.println((int)Math.sqrt(b));
					break;
					
				}
			}
			
		}
		
	}
}
