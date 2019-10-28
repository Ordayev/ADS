package Task2;

public abstract class Person {
	public String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	public boolean equals(Object o){
		if(o == null || o.getClass()!= this.getClass())
			return false;
		if(o == this)
			return true;
		Person p = (Person)o;
		return (p.name.equals(this.name));
	}

	public int hashCode(){
		return 31*17+(this.name.hashCode());
	}
}

