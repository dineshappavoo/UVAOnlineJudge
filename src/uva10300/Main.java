/**
 * 
 */
package uva10300;

import java.util.Scanner;

/**
 * @author Dinesh Appavoo
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
		int testcase=0, noOfFormers=0; 
		double farmYardSize=0, noOfAnimals=0,envDegree=0, calcValue=0, totalValForTestCase=0;
		while(scanner.hasNextInt())
		{
			testcase=scanner.nextInt();
			for(int i=0;i<testcase;i++)
			{
				noOfFormers=scanner.nextInt();
				for(int j=0;j<noOfFormers;j++)
				{
					farmYardSize=scanner.nextInt();
					noOfAnimals=scanner.nextInt();
					envDegree=scanner.nextInt();
					calcValue=(((farmYardSize/noOfAnimals)*envDegree)*noOfAnimals);
					totalValForTestCase+=calcValue;
				}
				Math.round(totalValForTestCase);
				System.out.println((int)totalValForTestCase);
				totalValForTestCase=0;
			}
		}
		return;
	}

}
