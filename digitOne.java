package First;
import java.util.Scanner;
public class digitOne {
	public int check(int a)
	{
		
		int i=a,n;
		while(i>0)
		{			
			n=i%10;
					
			i=i/10;
			
			if(n==1)
			{
				return 1;
			}
			
			
		}
		return 0;
	}
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int a,f,i;
		System.out.println("Enter the number");
		int q;
		q=in.nextInt();
		for(i=1;i<=q;i++)
		{
			digitOne s= new digitOne();
			f=s.check(i);
			if(f==1){
			System.out.println(i);
			}
			
		}
		
		
	}
}
