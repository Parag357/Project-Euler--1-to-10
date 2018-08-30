
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=2,c=0,s=b;
		while(c<4000000)
		{
			c=a+b;
			if(c%2==0)
			s+=c;
			a=b;
			b=c;
		}
		System.out.println("the sum of all even fibonacci terms not exceeding 4 million is :"+s);
		
	}

}
