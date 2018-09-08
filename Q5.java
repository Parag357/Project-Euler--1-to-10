

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int lcm=11,n1,n2;
		for(int i=12;i<20;i++)
		{
			n1=lcm;n2=i;
			while(n1!=n2)
			{
				if(n1>n2)
					n1-=n2;
				else
					n2-=n1;
			}
			lcm=(lcm*i)/n1;
		}
		System.out.println(lcm);
		}
	}

