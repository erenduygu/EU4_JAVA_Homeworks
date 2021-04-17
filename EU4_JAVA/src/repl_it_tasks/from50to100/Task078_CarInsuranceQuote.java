package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task078_CarInsuranceQuote {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE

		System.out.println("Enter  your name");
		name = scan.next();

		System.out.println("Do you have a US driver license?");
		String drivingLicense = scan.next();

		if (drivingLicense.equalsIgnoreCase("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("Enter your zip code");
		int zipCode = scan.nextInt();

		if (zipCode == 20910 || zipCode == 20740) {
			premium += 60;
		} else if (zipCode == 22102 || zipCode == 22103) {
			premium += 30;
		} else {
			premium += 50;
		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();

		if (vehicleOwnership.equalsIgnoreCase("Owned")) {
			premium += 10;
		} else {
			premium += 20;
		}

		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();

		if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium += 50;
		} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium += 10;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium += 20;
		}

		System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool = scan.nextInt();

		premium = premium + 5 * daysDrivenToWorkOrSchool;

		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool = scan.nextInt();

		premium = premium + 1 * milesToWorkOrSchool;

		System.out.println("How old are you?");
		int age = scan.nextInt();

		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);

		} else if (age >= 16 && age < 18) {
			premium *= 20;
		} else if (age >= 18 && age <= 21) {
			premium *= 6;
		} else if (age > 21 && age < 25) {
			premium *= 2;
		}

		System.out.println("How many years you've been driving?");
		int yearsOfDriving = scan.nextInt();

		if (yearsOfDriving <= 0 || (age - yearsOfDriving) < 16) {
			System.out.println("Invalid data!");
			System.exit(0);

		} else {
			premium = premium - (5 * yearsOfDriving);
		}

		System.out.println("Have you had any accidents in the last 5 years?");
		String answer = scan.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();

			premium += (premium * 0.2 * accidentsAmount);
		}

		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();

		if (continuousInsurance.equalsIgnoreCase("No")) {
			premium *= 2;
		}

		scan.nextLine();

		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.next();

		if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelor")
				|| education.equalsIgnoreCase("Masters")) {
			premium -= premium * 0.05;

		} else if (education.equalsIgnoreCase("Doctors")) {
			premium -= premium * 0.1;
		} else if (education.equals("Less than High School")) {
			premium += premium * 0.05;
		}

		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		referenceNumber = name.substring(0, 2).toUpperCase() + age
				+ name.substring(name.length() - 2, name.length()).toUpperCase() + zipCode
				+ education.replace(" ", "").toUpperCase();
		System.out.println("Reference number: " + referenceNumber);

	}
}

/*	REPL SOLUTION
  
	  System.out.println("Enter your name");
	  name=scan.nextLine();
	  System.out.println("Do you have a US driver license?");
	  String license=scan.nextLine();
	  if(license.equalsIgnoreCase("no")) {
	  	System.out.println("Invalid data!");
	  	System.exit(0);
	  }
	  System.out.println("Enter your zip code");
	  int zip=scan.nextInt();
	  if(zip==20910||zip==20740) {
	  	premium+=60;
	  }else if(zip==22102||zip==22103) {
	  	premium+=30;
	  }else {
	  	premium+=50;
	  }
 System.out.println("Is this vehicle Owned, Financed, or Leased?");
	  vehicleOwnership=scan.next();
	  if(vehicleOwnership.equalsIgnoreCase("owned")) {
	  	premium+=10;
	  }else {
	  	premium+=20;
	  }
	  System.out.println("How is this vehicle primarily used?");
	  vehicleUsage=scan.next();
	  if(vehicleUsage.equalsIgnoreCase("business")) {
	  	premium+=50;
	  }else if(vehicleUsage.equalsIgnoreCase("pleasure")) {
	  	premium+=10;
	  }else if(vehicleUsage.equalsIgnoreCase("commute")) {
	  	premium+=20;
	  	System.out.println("Days Driven To Work And/Or School");
		  daysDrivenToWorkOrSchool=scan.nextInt();
		  premium+=5*daysDrivenToWorkOrSchool;
		  System.out.println("Miles Driven To Work And/Or School");
		  milesToWorkOrSchool=scan.nextInt();
		  premium+=1*milesToWorkOrSchool;
	  }
	  
	   
	   
	  System.out.println("How old are you?");
	  int age=scan.nextInt();
	  if(age<16) {
	  	System.out.println("Invalid data!");
	  	System.exit(0);
	  }else if(age>=16&&age<18) {
	  	premium=20*premium;
	  }else if(age>=18&&age<=21) {
	  	premium=6*premium;
	  }else if(age>21&&age<25) {
	  	premium=2*premium;
	  }
	  System.out.println("How many years you've been driving?");
	  int x=scan.nextInt();
	  if(x<0||age-x<16) {
	  	System.out.println("Invalid data!");
	  	System.exit(0);
	   	
	  }else {
	  	premium=premium-(x*5);
	  }
	  System.out.println("Have you had any accidents in the last 5 years?");
	  String accident=scan.next();
	  if(accident.equalsIgnoreCase("yes")) {
	  	System.out.println("How many?");
	  	accidentsAmount=scan.nextInt();
	  	premium=premium+(premium*accidentsAmount/5);
	  }
	  System.out.println("Have you had continuous insurance for the past 12 months?");
	  continuousInsurance=scan.next();
	  if(continuousInsurance.equalsIgnoreCase("no")) {
	  premium=2*premium;
	  }
	  scan.nextLine();
	  System.out.println("What is the highest level of education you have completed?");
	  education=scan.nextLine();
	  if(education.equalsIgnoreCase("phd")||education.equalsIgnoreCase("bachelors")||education.equalsIgnoreCase("masters")) {
	  	premium=95*premium/100;
	   	
	  }else if(education.equalsIgnoreCase("doctor")) {
	  	premium=90*premium/100;
	   	
	  }else {
	  	premium=premium+(premium*5/100);
	  }
	  System.out.println(name+", here's your quote!");
	  System.out.println("Start Your Policy Today For: $"+premium);
	  referenceNumber=name.substring(0,2).toUpperCase()+age+name.substring(name.length()-2, name.length()).toUpperCase()+zip+education.replace(" ","").toUpperCase();
	  System.out.println("Reference number: "+referenceNumber);
	 }
}*/
