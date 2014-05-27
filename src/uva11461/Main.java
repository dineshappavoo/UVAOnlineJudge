package uva11461;
/**
 * 
 */


import java.util.Scanner;

/**
 * @author Dany
 *
 */
public class Main {

	public static void main(String[] args) {
		new Main().getInput();
	}

	public void getInput()
	{
		Scanner scanner=new Scanner(System.in);
		int a, b, count=0,val1, startSquare=0;
		double value, newValue, m;


		while(scanner.hasNextInt())
		{
			a=scanner.nextInt();
			b=scanner.nextInt();			
			if(a==0 && b==0)
				break;
			
			value=Math.sqrt(a);
			val1=(int) Math.sqrt(a);
			newValue=val1;

			if(a==b)
			{
				if(value==newValue)
				{
					System.out.println("2");
				}else
				{
					System.out.println("0");
				}
			}else
			{
				if(value>newValue)
				{
					startSquare=val1+1;
				}else
				{
					startSquare=val1;
				}
				

				m=Math.pow(startSquare, 2);
				while(m<=b)
				{
					m=Math.pow(startSquare++, 2);
					if(m<=b)
					{
						count++;
					}
				}
				System.out.println(count);
				count=0;
			}
		}
	}

}
