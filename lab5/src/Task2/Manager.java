package Task2;

import java.util.*;

public class Manager extends Employee implements Comparable{
	private Vector<Employee> team = new Vector<Employee>();
	private double bonus = 1000;

	public Manager(String name, double d, Date i, String s, Vector<Employee> v) {
		super(name, d, i, s);
		for (Employee e : v) {
			team.add(e);
			setBonus(getBonus() * 1.05);
		}
	}

	public void setTeam(Employee e) {
		team.add(e);
	}

	public double getBonus() {
		return bonus;
	}

	private void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Vector getTeam() {
		return team;
	}

	public String toString() {
		return super.toString() + " " + bonus + "";
	}

	public boolean equals(Object o) {
		boolean check = false;
		if(super.equals(o) == true){
		Manager m = (Manager) o;
		for (int i = 0; i < team.size(); i++) {
			if (m.team.elementAt(i).equals(this.team.elementAt(i)))
				check = true;
			else{
				check = false;
				break;
			}
		}
		if (m.bonus == this.bonus && check == true)
			return true;
		else
			return false;
		}
		else return false;
	}
	
	public int hashcode(){
		int k = 0;
		for(Employee e:team)
			k+=e.hashCode();
		return super.hashCode() + k + (int)bonus;
	}
	
	public int compareTo(Object o){
		Manager m = (Manager)o;
		if(super.compareTo(o) == 1){
			if(this.bonus > m.bonus)
				return 1;
			else if(this.bonus < m.bonus)
				return -1;
			else return 0;
					}
		else return 0;
		
	}
}
