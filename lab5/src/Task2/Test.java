package Task2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		Vector<Person> p = new Vector<Person>();
		p.add(new Employee("Patrick", 60000.0, new Date(), "QT501"));
		p.add(new Employee("Adam", 70000.0, new Date() , "QR628"));
		p.add(new Employee("Rick", 120000.0, new Date(), "ID166"));
		p.add(new Employee("Pack", 85000.0, new Date(), "PO359"));
		p.add(new Employee("Rick", 120000.0, new Date(), "ID166"));
		Vector<Employee> v = new Vector<Employee>();
		for(Person e: p){
			v.add((Employee) e);
		}
		p.add(new Manager("May", 195000.0, new Date(),"CH489", v));
		System.out.println(p.toString());
		System.out.println(p.get(2).equals(p.get(4)));
		System.err.println(((Employee) p.get(2)).compareTo(p.get(4)));
		/*		Iterator<Person> i = p.iterator(); 
 		while (i.hasNext()) 
	    	if(i.getClass() == Employee.class)
	    		System.out.println(i.toString());
	    	v.add((Employee)i);
		System.out.println(i.toString());
	*/
	}
}