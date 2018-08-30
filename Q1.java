
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
 for(int i=1;i<1000;i++)
 {
	 if((i%5==0)||(i%3==0))
	 s+=i;
 }
 System.out.println("the sum of all multiples of 3 or 5 below 1000 is :"+s);
	}

}
