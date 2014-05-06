package uva100;
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
		int i, j, p ,q;
		int cycleLength=0,maxCycle=0;
		while(scanner.hasNextInt())
		{
			i=scanner.nextInt();
			j=scanner.nextInt();
			if(i>j)
			{
				p=j;
				q=i;
			}else
			{
				p=i;
				q=j;
			}
			for(int k=p;k<=q;k++)
			{
				cycleLength=find3nplus1Cycle(k);
				if(cycleLength>maxCycle)
				{
					maxCycle=cycleLength;
				}
			}
			System.out.println(i+" "+j+" "+maxCycle);
			maxCycle=0;
		}
		return;
	}

	public int find3nplus1Cycle(int n)
	{
		int cycleLength=0;

		while(n!=1)
		{
			cycleLength++;

			if(n==1)
				break;
			if((n&1)==0)
			{
				n=n>>1;	//n=n/2;

			}
			else
			{
				n=(n+(n<<1)+1);	 //n=(3*n+1);

			}
		}
		cycleLength++;
		return cycleLength;
	}

}
