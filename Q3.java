
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long ln= 6008514751431L;
		for(long i=ln/2;i>0;i--)
		{
			if(ln%i==0)
			{
			int c=0;
			for(long j=2;j<=i/2;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==0)
			
					System.out.println("the largest prime factor of given number is "+i);
					System.exit(0);
				}
			}
		}
	}


