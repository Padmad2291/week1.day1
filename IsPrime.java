package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num=13;
		boolean prime=true;
		for(int i=2; i<num ; i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
			else {
				System.out.println(prime);
			}
		}

	}

}
