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
		int a, b, count;
		double value;
		
		
		while(scanner.hasNextInt())
		{
			a=scanner.nextInt();
			b=scanner.nextInt();			
			if(a==0 && b==0)
				break;
			if(a==b)
			{
				
			}
			while(a<=b)
			{
				value=Math.sqrt(a++);
			}
		}
	}

}
