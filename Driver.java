import java.util.*;
import java.io.*;

/* @author Sam Zemen

*/
public class Driver {
	public static void main(String[]args) {
		//For user input
		Scanner sc = new Scanner(System.in);

		//choice and docChoice contains doctor choice for switch statememt 
		int choice;
		Doctor docChoice = null;

		// Storage variables to declare patient
		String name, sex, dob, hospital;
		int id;

		// Hospital String Array
		String hospitals[] = {"Mayo Clinic", "Cleveland Clinic", "The Johns Hopkins Hospital", "Mercy Hospital"};

		// Surgeon Array
		Surgeon surgeons[] = {new Surgeon("Elway", "UCLA Medical Center", "M", true),
			new Surgeon("Singleton", "Northwestern Memorial Hospital", "M", true),
			new Surgeon("Pasuke", "UCSF Medical Center", "F", true),
			new Surgeon("Rattler", "Mount Siani Hospital", "M", true)};

		// Surgeon ArrayList
		ArrayList<Surgeon> surgeonList = new ArrayList<Surgeon>(Arrays.asList(surgeons));

		//SurgeonArrayList allows surgeon objects to be added as needed
		surgeonList.add(new Surgeon("Karter", "Houston Methodist Hospital", "F", true));
		surgeonList.add(new Surgeon("Becker", "Duke University Hospital", "M", true));

		// Doctor Arrays for each hospital
		Doctor mayoDoctors [] = {new Doctor("Ramos", hospitals[0], "M", true),
			new Doctor("Hayden", hospitals[0], "F", true), 
			new Doctor("Donovan", hospitals[0], "M", false), 
			new Doctor("Mcintosh", hospitals[0], "M", false),
			new Doctor("Orr", hospitals[0], "F", true)};
		
		Doctor clevlandDoctors [] = {new Doctor("Clay", hospitals[1], "F", false),
			new Doctor("McNeil", hospitals[1], "M", false),
			new Doctor("Karr", hospitals[1], "F", true),
			new Doctor("Ali", hospitals[1], "M", true),
			new Doctor("Santana", hospitals[1], "M", true),
			new Doctor("Patton", hospitals[1], "F", true)};
		
		Doctor JHDoctors [] = {new Doctor("Schmitt", hospitals[2], "F", false),
			new Doctor("Webb", hospitals[2], "M", true),
			new Doctor("Rose", hospitals[2], "M", true),
			new Doctor("Guerra", hospitals[2], "F", true)};
		
		Doctor mercyDoctors [] = {new Doctor("Contreras", hospitals[3], "F", true),
			new Doctor("Evans", hospitals[3], "F", false),
			new Doctor("Livingston", hospitals[3], "M", true),
			new Doctor("Jackson", hospitals[3], "M", false),
			new Doctor("Cortez", hospitals[3], "F", true),
			new Doctor("Mann", hospitals[3], "F", true)};

		// 2D Array for all hospitals in the system
		Doctor systemDoctors [][] = {mayoDoctors, clevlandDoctors, JHDoctors, mercyDoctors};

		//Collect Patient information (user input)
		System.out.println("To schedule an appointment, Please enter your name: ");
		name = sc.next();

		System.out.println("Please enter national ID number: ");
		id = sc.nextInt();

		System.out.println("Please enter your date of birth for confirmation: ");
		dob = sc.next();

		System.out.println("Please enter sex (M,F, or n/a): ");
		sex = sc.next();

		System.out.println("What time would you like to schedult the appointment?");
		String time = sc.next();

		// Display hospital options
		System.out.println("The hospital list is as follows: " + 
		"\n1. Mayo Clinic\n2. Clevland\n3. The Johns Hopkins Hospital\n4. Mercy Hospital");
		System.out.println("Please enter the hospital number: ");
		choice = sc.nextInt();

		// Hospital choice validation
		while ((choice < 1) || (choice > 4)) {
			System.out.println("Invalid hospital input");

			System.out.println("The hospital list is as follows: " + 
			"\n1. Mayo Clinic\n2. Clevland\n3. The Johns Hopkins Hospital\n4. Mercy Hospital");
			System.out.println("Please enter the hospital number: ");
			choice = sc.nextInt();
		}

		
		hospital = "";

		// Display and choose one of the available doctors at chosen hospital
		switch (choice) {
			case 1:
				hospital = "Mayo Clinic";
				for (int i = 0; i < mayoDoctors.length; i++) {
					System.out.println((i+1) + ": " + mayoDoctors[i].getName());
				}
				System.out.println("Which doctor would you like to schedule?");
				choice = sc.nextInt();
				if (systemDoctors[0][(choice - 1)].isAvailable()) {
					System.out.println("The doctor is available, appointment scheduled!");
					docChoice = systemDoctors[0][(choice - 1)];
				}	
				else {
					System.out.println("The doctor is not available");
				}
				break;
			case 2:
				hospital = "Clevland Clinic";
				for (int i = 0; i < clevlandDoctors.length; i++) {
					System.out.println((i+1) + ": " + clevlandDoctors[i].getName());
				}
				System.out.println("Which doctor would you like to schedule?");
				choice = sc.nextInt();
				if (systemDoctors[1][(choice - 1)].isAvailable()) {
					System.out.println("The doctor is available, appointment scheduled!");
					docChoice = systemDoctors[1][(choice - 1)];
				}	
				else {
					System.out.println("The doctor is not available");
				}
				break;
			case 3:
				hospital = "The John Hopkins Hospital";
				for (int i = 0; i < JHDoctors.length; i++) {
					System.out.println((i+1) + ": " + JHDoctors[i].getName());
				}
				System.out.println("Which doctor would you like to schedule?");
				choice = sc.nextInt();
				if (systemDoctors[2][(choice - 1)].isAvailable()) {
					System.out.println("The doctor is available, appointment scheduled!");
					docChoice = systemDoctors[2][(choice - 1)];
				}	
				else {
					System.out.println("The doctor is not available");
				}
				break;
			case 4:
				hospital = "Mercy Hospital";
				for (int i = 0; i < mercyDoctors.length; i++) {
					System.out.println((i+1) + ": " + mercyDoctors[i].getName());
				}
				System.out.println("Which doctor would you like to schedule?");
				choice = sc.nextInt();
				if (systemDoctors[3][(choice - 1)].isAvailable()) {
					System.out.println("The doctor is available, appointment scheduled!");
					docChoice = systemDoctors[3][(choice - 1)];
				}	
				else {
					System.out.println("The doctor is not available");
				}
				break;
		}

		sc.close();
		// Declare patient object
		Patient user = new Patient(dob, id, name, sex, hospital);

		// If available doctor is scheduled, generate receipt.txt
		if (docChoice != null) {
			try {
				File receipt = new File("receipt.txt");
				FileWriter fw = new FileWriter(receipt);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Patient: " + user.getName());
				bw.newLine();
				bw.write("ID: " + user.getId());
				bw.newLine();
				bw.write("Appointment confirmed at " + user.getHospital() + 
					" with " + docChoice.getName() + " at " + time);
				docChoice.addPatient(user);
				bw.close();
			}
			catch (IOException e) {
				System.out.println("An error occured during recipt generation.");
			}
		}
	}
}