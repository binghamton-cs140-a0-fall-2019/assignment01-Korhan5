package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dob = new DateAndPlaceOfBirth(2000, 3, 9, "Oceanside", "NY", "US");
		StreetUSAddress add = new StreetUSAddress("2809 Brower Ave", "2nd Floor", "Oceanside", "NY", "11572") ;
		Person John = new Person("John", "Smith", "123456789", dob, add );


		System.out.println(John) ;




		try(var output =new PrintWriter(new FileOutputStream(
					new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


  }
  }
