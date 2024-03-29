package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class  SimpleDateTester {
	public static void main(String[] args) {




		SimpleDate before1 = new SimpleDate(2019, 2, 9);
		SimpleDate after1 = new SimpleDate(2020, 2, 11) ;

		SimpleDate before2 = new SimpleDate(2020, 2, 9);
		SimpleDate after2 = new SimpleDate(2020, 2, 11) ;

		SimpleDate before3 = new SimpleDate(2020, 2, 13);
		SimpleDate after3 = new SimpleDate(2020, 2, 11) ;

		System.out.println(before1.before(after1));
		System.out.println(before2.before(after2));
		System.out.println(before3.before(after3));

	try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /* true means append to file */))) {
		output.println("\nTESTS FOR SimpleDate.java:");

		SimpleDate before12 = new SimpleDate(2019, 2, 9);
		SimpleDate after12 = new SimpleDate(2020, 2, 11) ;

		SimpleDate before22 = new SimpleDate(2020, 2, 9);
		SimpleDate after22 = new SimpleDate(2020, 2, 11) ;

		SimpleDate before32 = new SimpleDate(2020, 2, 13);
		SimpleDate after32 = new SimpleDate(2020, 2, 11) ;

		output.println(before12.before(after12));
		output.println(before22.before(after22));
		output.println(before32.before(after32));
	//Copy all your lines above, add an extra "2" to every variable name
	// and replace every System.out.print or System.out.println
	// by output.print or output.println
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}

}

}
