//((((10+2)+2)-2)*2)/2)
package Package1;
public class Calculation {
	public int sum(int a , int b) {
		int c =  a + b;
		return c;	
	}
	public int sub(int a , int b) {
		int c =  a - b;
		return c;
}
	public int mul(int a , int b) {
		int c =  a * b;
		return c;
		}
	public int divide(int a , int b) {
		int c =  a / b;
		return c;
		}
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		 int sumresult = cal.sum(10, 2);
		 int sum1result = cal.sum(sumresult, 2);
		 int sub = cal.sub(sum1result, 2);
		 int mul = cal.mul(sub, 2);
		 int result = cal.divide(mul, 2);
		 System.out.println("result is"+ result);
		 }
}
