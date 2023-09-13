package studio2;

import java.util.Scanner;
public class Ruin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Starting amount: ");
		int startingAmount = in.nextInt();
		System.out.println("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Enter win limit: ");
		int winLimit = in.nextInt();
		System.out.println("Enter number of Simulations: ");
		int numberOfSimulations = in.nextInt();
		int numberOfRuns = 0;
		//PLAY//
		for (int i = 0; i < numberOfSimulations; i++) 
		{
			while (startingAmount > 0 && startingAmount<winLimit)

			{
				numberOfRuns++;
				double value = Math.random();

				if(value < winChance) 
				{
					System.out.println("Simulaion " + numberOfRuns + ": Winner");
					startingAmount+=1;
				}
				else 
				{
					System.out.println("Simulaion " + numberOfRuns + ": Lose");
					startingAmount-=1;
				}
				System.out.println("Amount of money: " + startingAmount);
			}


		}

	}
}
