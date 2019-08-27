package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class SimpleDate {
	private int yr;
	private int m;
	private int d;



	public SimpleDate(int year, int month, int day) {

		yr = year;
		m = month ;
		d = day ;



  }

		public static SimpleDate of(int yr, int m, int d){

			SimpleDate returnValue = new SimpleDate(yr,m, d);
			return returnValue ;


		}

	public boolean before(SimpleDate other){

		if(this.yr < other.yr){
			return true ;
		}else if(this.m < other.m){
			return true ;
		} else if(this.d < other.d){
			return true ;
		}else{
			return false ;
		}
		}

		}
