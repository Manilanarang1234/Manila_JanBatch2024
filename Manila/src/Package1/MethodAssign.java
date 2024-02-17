package Package1;

public class MethodAssign {
	public void MethodAssign() {
		this.MethodAssign(4, 6 ,  5 ,  7);
		
		System.out.println("default method");
	}

	public void MethodAssign(int a ) {
		this.MethodAssign();
		
		System.out.println("one parametrized method");
	}

	public void MethodAssign(int a , int b) {
		this.MethodAssign(4);
	
		System.out.println("two parametrized method");
	}
	
	public void MethodAssign(int a , int b , int c) {
		System.out.println("three parametrized method");
	}
	
	public void MethodAssign(int a , int b , int c , int d) {
		this.MethodAssign(5, 7 , 9);
		
		System.out.println("four parametrized method");
	}
	
	public static void main(String[] args) {
	MethodAssign m = new MethodAssign();
		m.MethodAssign(10,12);
		
	}
}


