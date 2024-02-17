package Package1;

public class ConstructorAssign {
	public void ConstructorAssign() {
		this.ConstructorAssign(5, 6 , 7);
		System.out.println("default constructor");
	}

	public void ConstructorAssign(int a ) {
		this.ConstructorAssign();
		System.out.println("one parametrized constructor");
	}

	public void ConstructorAssign(int a , int b) {
		this.ConstructorAssign(4);
		System.out.println("two parametrized constructor");
	}
	
	public void ConstructorAssign(int a , int b , int c) {
		System.out.println("three parametrized constructor");
	}
	
	public void ConstructorAssign(int a , int b , int c , int d) {
		this.ConstructorAssign(4,5);
		System.out.println("four parametrized constructor");
	}
	
	public static void main(String[] args) {
	ConstructorAssign c = new ConstructorAssign();
		c.ConstructorAssign(10,12,13, 22);
		
	}
}




