package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class USAddressTester {
	public static void main(String[] args) {

		String nothing = " ";
		StreetUSAddress addy = new StreetUSAddress("2809 Brower Ave", "2nd Floor", "Oceanside", "NY", "11572") ;


		StreetUSAddress addy2 = new StreetUSAddress("2809 Brower Ave",nothing, "Oceanside", "NY", "11572") ;

		System.out.println(addy);
		System.out.println(addy2);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

  }
  }
