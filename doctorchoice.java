import java.io.*;
import java.util.Scanner;

public class doctorchoice {
	public static void main(String[] args) {

		System.out.println("Enter your choice:1)Dr.Ali 2)Dr. Bereket 3)Doctor. Lime");

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		  

		do{

		switch(choice){   

		case 1: Receptionist R = new Receptionist();

		R.Choice();

		break;

		case 2: Patient P = new Patient();

		P.Choice();

		break;

		case 3: Doctor D = new Doctor();

		D.Choice();

		break;   

		}

		}while(choice!=4);

		}
}
