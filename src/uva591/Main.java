package uva591;
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
		int n, k=0, num, total=0, minBricks=0, moves;
		int[] values;
		
		while(scanner.hasNextInt())
		{
			n=scanner.nextInt();
			if(n==0)
				break;
			values=new int[n];
			for(int i=0;i<n;i++)
			{
				num=scanner.nextInt();
				values[i]=num;
				total+=num;
			}
			minBricks=total/n;
			
			for(int j=0;j<n;j++)
			{
				if(values[j]>minBricks)
					k+=values[j]-minBricks;
			}
			
			minBricks=0;
			total=0;
			System.out.println("The minimum number of moves is "+k);
		}
	}

}
