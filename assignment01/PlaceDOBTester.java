package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(2000, 3, 9, "Oceanside", "NY", "US");
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(1999, 3, 9, "Oceanside", "NY", "US");
		DateAndPlaceOfBirth dob3 = new DateAndPlaceOfBirth(2000, 3, 9, "Oceanside", "NY", "US");
		DateAndPlaceOfBirth dob4 = new DateAndPlaceOfBirth(1970, 6, 22, "Kabul", "Afghanistan");
		DateAndPlaceOfBirth dob5 = new DateAndPlaceOfBirth(1980, 2, 5, "Kabul", "Afghanistan");
		System.out.println(dob1);
		System.out.println(dob2);
		System.out.println(dob3);
		System.out.println(dob4);
		System.out.println(dob5);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(dob1.hasSameBirthDayAs(dob2));
		System.out.println(dob1.hasSameBirthDayAs(dob3));
		System.out.println(dob1.hasSameBirthDayAs(dob4));
		System.out.println(dob1.hasSameBirthDayAs(dob5));
		System.out.println(dob2.hasSameBirthDayAs(dob3));
		System.out.println(dob2.hasSameBirthDayAs(dob4));
		System.out.println(dob2.hasSameBirthDayAs(dob5));
		System.out.println(dob3.hasSameBirthDayAs(dob4));
		System.out.println(dob3.hasSameBirthDayAs(dob5));
		System.out.println(dob4.hasSameBirthDayAs(dob5));
		



	}
}
