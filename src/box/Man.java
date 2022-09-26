package box;

public class Man extends Human{
	
	
	public Man(String name) {
		// constructor
		super(name);
	}
	
	public void show(){
	         
	        System.out.printf("The Man's name is %s \n", super.getName());
	}
}
