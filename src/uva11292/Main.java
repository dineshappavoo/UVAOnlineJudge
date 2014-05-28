package uva11292;
/**
 * 
 */


import java.util.Arrays;
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
		int n, m, mapCount=0, k, l, countValue=0;
		int[] dragonHead;
		int[] knight;

		while(scanner.hasNextInt())
		{
			n=scanner.nextInt();
			m=scanner.nextInt();
			if(n==0&&m==0)
				break;

			dragonHead=new int[n];
			knight=new int[m];

			for(int i=0;i<n;i++)
			{
				dragonHead[i]=scanner.nextInt();

			}

			for(int j=0;j<m;j++)
			{
				knight[j]=scanner.nextInt();
			}

			if(n>m)
			{
				System.out.println("Loowater is doomed!");
			}else
			{

				Arrays.sort(dragonHead);
				Arrays.sort(knight);

				k=0;
				l=0;
				while(k<m&&l<n)
				{
					if(knight[k]>=dragonHead[l])
					{
						mapCount++;
						countValue+=knight[k];
						k++;
						l++;
					}else
					{
						k++;
					}
				}

				if(mapCount>=n)
					System.out.println(countValue);
				else
				{
					System.out.println("Loowater is doomed!");

				}
				mapCount=0;
				countValue=0;
			}
		}
	}

}
