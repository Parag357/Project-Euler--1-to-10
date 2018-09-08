
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long ln= 6008514751431L;
		int max=0;
		for (int i=2; i<= ln;i++)
			while (ln % i == 0)
			{
				if(i>max)
				max=i;
				ln/=i;
			}	
		System.out.println("the greatest prime factor of the given number is :"+max);
		}
	}


