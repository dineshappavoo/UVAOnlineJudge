package uva10905;
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
		int n, maxNum, maxNumIndex, arrayCurrentSize;
		int[] values;
		boolean[] markedValues;
		String finalOutput;

		while(scanner.hasNextInt())
		{
			n=scanner.nextInt();
			values=new int[n];
			arrayCurrentSize=n;
			markedValues=new boolean[n];

			maxNum=0;
			maxNumIndex=0;
			finalOutput="";
			
			if(n==0)
				break;
			
			for(int i=0;i<n;i++)
			{
				values[i]=scanner.nextInt();
			}

			for(int m=arrayCurrentSize;m>0;m--)
			{
				for(int j=0;j<n;j++)
				{
					if(values[j]>=0)
					{
						String str=String.valueOf(values[j]);
						int firstDigit=Character.getNumericValue(str.charAt(0));
						//System.out.println("first "+firstDigit);

						int firstDigitMaxNum=Character.getNumericValue(String.valueOf(maxNum).charAt(0));
						if(firstDigit>firstDigitMaxNum)
						{
							maxNum=values[j];
							//values[j]=-1;
							maxNumIndex=j;
						}else if(firstDigit==firstDigitMaxNum)
						{
							String str1=String.valueOf(values[j]);
							String str2=String.valueOf(maxNum);

							int length1=str1.length();
							int length2=str2.length();
							if(length1<length2)
							{
								
								maxNum=values[j];
								maxNumIndex=j;
								;
								
								
							}else
							{
								int minLength=length2;
								for(int k=0;k<minLength;k++)
								{
									if(Character.getNumericValue(str1.charAt(k))>Character.getNumericValue(str2.charAt(k)))
									{
										maxNum=values[j];
										maxNumIndex=j;
										//values[j]=-1;
									}else if(Character.getNumericValue(str1.charAt(k))==Character.getNumericValue(str2.charAt(k)))
									{
										maxNum=values[j];
										maxNumIndex=j;
									}
								}
							}
						}
					}
				}
				//System.out.println(values[maxNumIndex]);
				finalOutput+=String.valueOf(values[maxNumIndex]);
				values[maxNumIndex]=-1;
				markedValues[maxNumIndex]=true;

				for(int l=0;l<n;l++)
				{
					if(!markedValues[l])
						maxNumIndex=l;
				}
			}
			System.out.println(finalOutput);
		}
	}
}
