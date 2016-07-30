package jets;

import java.util.Scanner;


public class TestJet 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int choice;
		

		Jet bigBertha = new Jet("Big Bertha", 900F, 5000F, 50000.00F);
		Jet nannyMcPhee = new Jet("Nanny McPhee", 750F, 3000F, 60000.00F);
		Jet silentJim = new Jet("Silent Jim", 800F, 3500F, 62000.00F);
		Jet gandalfGrey = new Jet("Gandalf the Grey", 850F, 6000F, 80000.00F);
		Jet gandalfWhite = new Jet("Gandalf the White", 950F, 9500F, 1000000.00F);
		
		Jet[] jets = new Jet[5]; 
		jets[0] = bigBertha;
		jets[1] = nannyMcPhee;
		jets[2] = silentJim;
		jets[3] = gandalfGrey;
		jets[4] = gandalfWhite;
	
		do
		{
		
			System.out.println("*************************************");
			System.out.println("*          ~JETS 'R US~             *");
			System.out.println("*                                   *");
			System.out.println("*   1) List Jets in Current Fleet   *");
			System.out.println("*                                   *");
			System.out.println("*   2) View Fastest Jet in Fleet    *");
			System.out.println("*                                   *");
			System.out.println("*   3) View Jet with Longest Range  *");
			System.out.println("*                                   *");
			System.out.println("*   4) Add Jet to Existing Fleet    *");
			System.out.println("*                                   *");
			System.out.println("*   5) Quit Menu                    *");
			System.out.println("*                                   *");
			System.out.println("*************************************");
		
			choice = keyboard.nextInt();
		
			if (choice == 1)
			{
				listJets(jets);
			}
		
			if (choice == 2)
			{
				getFastestJet(jets);
			}
		
			if (choice == 3)
			{
				getLongestRange(jets);
			}
		
			if (choice == 4)
			{	
				System.out.println("Enter the model of the Jet: ");
				String model = keyboard.next();
				
				System.out.println("Enter the speed of the Jet (in mph): ");
				float speed = keyboard.nextFloat();
				
				System.out.println("Enter the range the Jet can fly (in miles): ");
				float range = keyboard.nextFloat();
				
				System.out.println("Enter the price of the Jet: ");
				float price = keyboard.nextFloat();
				
				Jet newJet = new Jet(model, speed, range, price);

				
				jets = addJet(newJet, jets);
			}
		} while (choice != 5);
		
		keyboard.close();
	}
		
	public static void listJets(Jet[] currentJets)
	{
		for (Jet index : currentJets) 
		{
			System.out.println(index + "\n");
		}
	}
//	
//	public static void convertToMach(float speed)
//	{
//		float mach = speed / 761.2F;
//		
//		System.out.printf("Speed converted to Mach: %1$.2f %n", mach);
//	}
	
	public static Jet[] addJet(Jet newJet, Jet[] jets)
	{
		Jet[] newJets = new Jet[jets.length + 1];
		
		for (int i = 0; i < jets.length; i++)
		{
			newJets[i] = jets[i];
		}
		
		newJets[jets.length] = newJet;
				
		for (Jet index : newJets) 
		{
			System.out.println(index + "\n");
		}
		
		return newJets;
	}
	
	public static void getFastestJet(Jet[] jets)
	{
		float maxSpeed = 0;
		Jet fastJet = null;
			
		for (Jet jet : jets) 
		{
			if (jet.getSpeed() > maxSpeed)
			{
				maxSpeed = jet.getSpeed();
				fastJet = jet; 
			}
		}
		System.out.println("The jet with the fastest speed is: " + fastJet.getModel() + 
				"\nWith a speed of: " + fastJet.getSpeed() + " Mach\n");
	}
	
	public static void getLongestRange(Jet[] jets)
	{
		float longRange = 0;
		Jet longJet = null;
			
		for (Jet jet : jets) 
		{
			if (jet.getRange() > longRange)
			{
				longRange = jet.getRange();
				longJet = jet; 
			}
		}
		System.out.println("The jet with the longest range: " + longJet.getModel() + 
					"\nWith a range of: " + longJet.getRange() + " miles\n");	
	}

}
