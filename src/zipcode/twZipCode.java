package zipcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class twZipCode {

	 public static void main(String[] args) {
		 	twZipCodeLib tZip=new twZipCodeLib();
		 	tZip.setCountry("台北市");
		 	tZip.setTown("信義區");
		 	System.out.println(tZip.getCountry()+"  "+"  "+tZip.getTown()+"  "+tZip.getZipCode());
		 	System.out.println("===============================");
		 	ArrayList tClist=(ArrayList)tZip.getCountryList();
		 	Iterator tIt=tClist.iterator();
		 	while(tIt.hasNext()){
		 		System.out.println(tIt.next());
		 	}
		 	System.out.println("===============================");
		 	System.out.println((String)tClist.get(0));
		 	ArrayList tTlist=(ArrayList)tZip.getTownList((String)tClist.get(0));
		 	Iterator tItt=tTlist.iterator();
		 	while(tItt.hasNext()){
		 		System.out.println(tItt.next());
		 	}
	    }
	
}
