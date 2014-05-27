package uva11636;
/**
 * 
 */


import java.util.Scanner;

/**
 * @author Dinesh Appavoo
 *
 */
public class Main {

	public static void main(String[] args) {
		new Main().getInput();
	}

	public void getInput()
	{
		Scanner scanner=new Scanner(System.in);
		int n, serial=1;
		
		while(scanner.hasNextInt())
		{
			n=scanner.nextInt();
			if(n<0)
				break;
			if(n==0||n==1)
			{
				System.out.println("Case "+serial+": 0");
			}else
			{
				int m=(int) Math.pow(2, 1);
				int i=1;
				for(i=1;m<n;i++)
				{
					m=(int) Math.pow(2, i);
				}
				if(m==n)
					System.out.println("Case "+serial+": "+i);
				else
					System.out.println("Case "+serial+": "+(i+1));
			}
			serial++;
			
		}
	}

}
