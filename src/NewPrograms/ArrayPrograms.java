package NewPrograms;

public class ArrayPrograms 
{

	public static void main(String[] args) 
	{
int a[]= {4,3,2,1,44};
for(int i=0; i<a.length;i++)
{
	System.out.println(a[i]);
}

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	}

}



for(int k=0;k<a.length;k++)
{
System.out.println(a[k]);	
}
}
}