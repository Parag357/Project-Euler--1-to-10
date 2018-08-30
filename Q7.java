
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0;
for(int i=1;i<1000000;i++)
{
	int k=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			k++;
		}
	}
	if(k==2)
		c++;
	if(c==10001)
	{
		System.out.println(i);
		System.exit(0);
	}
}
	}

}
