/**
 * 
 */
package uva694;

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
		int a, l;
		int cycleLength=0;
		int caseNo=0;
		while(scanner.hasNextInt())
		{
			a=scanner.nextInt();
			l=scanner.nextInt();
			if(a<0&&l<0)
			{
				break;
			}
			cycleLength=find3nplus1Cycle(a, l);
			System.out.println("Case "+(++caseNo)+": A = "+a+", limit = "+l+", number of terms = "+cycleLength);
		}
		return;
	}

	public int find3nplus1Cycle(int n, int limit)
	{
		int cycleLength=0;

		while(n!=1)
		{
			if(n>limit)
			{
				return cycleLength;
			}
			cycleLength++;

			if(n==1)
				break;
			if((n&1)==0)
			{
				n=n>>1;	//n=n/2;

			}
			else
			{
				int m=(limit-1)/3;
				if(n>m)
				{
					return cycleLength;
				}
				n=(n+(n<<1)+1);	 //n=(3*n+1);

			}
		}
		cycleLength++;
		return cycleLength;
	}

}
