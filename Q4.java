
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=999;i>799;i--)
		{
			for(int j=999;j>799;j--)
			{
				int s=i*j;
				int s1=s;
				String pal="";
				while(s1>0)
				{
					int rem=s1%10;
					pal+=rem;
					s1/=10;	
				}
				if(Integer.parseInt(pal)==s)
				{
					System.out.println(s);
					System.exit(0);
				}
					
			}
		}
	}

}
