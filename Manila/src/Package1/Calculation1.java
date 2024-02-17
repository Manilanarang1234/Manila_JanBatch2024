//((((10/2)-2)+2)-2)/2



package Package1;

public class Calculation1 {
public int sum(int a, int b) {
	int c = a+b;
	return c;
	
	
}

public int sub(int a, int b) {
	int c = a-b;
	return c;
	
}

public int div(int a, int b) {
	int c = a/b;
	return c;
	
}

public static void main(String[] args) {
	 Calculation1 cal1 = new Calculation1();
	 int division = cal1.div(10,2);
	 int sub = cal1.sub(division, 2);
	 int add = cal1.sum(sub, 2);
	 int sub1 = cal1.sub(add, 2);
	 int div1 = cal1.div(sub1 , 2);
	 
	 System.out.println("result is"+ div1);
	 
	
}



}


