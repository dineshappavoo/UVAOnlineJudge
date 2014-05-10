package uva10055;
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
		return;
	}

	public void getInput()
	{
		Scanner scanner=new Scanner(System.in);
		long i, j, diff;
		
		while(scanner.hasNextInt())
		{
			i=scanner.nextLong();
			j=scanner.nextLong();
			
			if(i>=j)
			{
				diff=i-j;
				
			}else
			{
				diff=j-i;
			}
			System.out.println(diff);
			
		}
		return;
	}

}
