package Task1;

public abstract class Abstract {
	private String name;
	public int x;
	
	public Abstract(String name, int x){
		this.name = name;
		this.x = x;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
