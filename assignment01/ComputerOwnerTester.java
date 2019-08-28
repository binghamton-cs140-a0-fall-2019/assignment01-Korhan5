package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class  ComputerOwnerTester {
	public static void main(String[] args) {

		DateAndPlaceOfBirth dobb = new DateAndPlaceOfBirth(2000, 3, 9, "Oceanside", "NY", "US");
		StreetUSAddress addd = new StreetUSAddress("2809 Brower Ave", "2nd Floor", "Oceanside", "NY", "11572") ;
		Person Joe = new Person("Joe", "Smith", "123456789", dobb, addd );
		String brand = "Apple";
		Computer comp13 = new Computer(brand,"na",8,1000, true,1000);
		Computer comp23 = new Computer(brand,"na", 8,2100, false, 900);
		Computer comp34 = new Computer(brand, "na", 8 ,500,true, 500);
		Computer comp44 = new Computer(brand, "na", 8,2100, false, 400);

		ComputerOwner compJoe = new ComputerOwner(Joe);
		compJoe.addComputer(comp13);
		compJoe.addComputer(comp23);
		compJoe.addComputer(comp34);
		compJoe.addComputer(comp44);

		System.out.println(compJoe);
		compJoe.removeComputer(2);
		System.out.println(compJoe);






		try(var output =new PrintWriter(new FileOutputStream(
					new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

			DateAndPlaceOfBirth dobb2 = new DateAndPlaceOfBirth(2000, 3, 9, "Oceanside", "NY", "US");
			StreetUSAddress addd2 = new StreetUSAddress("2809 Brower Ave", "2nd Floor", "Oceanside", "NY", "11572") ;
			Person Joe2 = new Person("Joe", "Smith", "123456789", dobb, addd );
			String brand2 = "Apple";
			Computer comp132 = new Computer(brand,"na",8,1000, true,1000);
			Computer comp232 = new Computer(brand,"na", 8,2100, false, 900);
			Computer comp342 = new Computer(brand, "na", 8 ,500,true, 500);
			Computer comp442 = new Computer(brand, "na", 8,2100, false, 400);

			ComputerOwner compJoe2 = new ComputerOwner(Joe);
			compJoe2.addComputer(comp132);
			compJoe2.addComputer(comp232);
			compJoe2.addComputer(comp342);
			compJoe2.addComputer(comp442);

			output.println(compJoe2);
			compJoe2.removeComputer(2);
			output.println(compJoe2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

  }

  }
