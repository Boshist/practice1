package pract1;

public class Test {
	
	public static void main(String[] args) {
		
		Ball T1 = new Ball();
		Ball T2 = new Ball(5,14.8, 9.5);
		
		System.out.println(T1);
		System.out.println(T2);
		
		System.out.println(T2.getX()+" "+T2.getY()+" "+T2.getR());
		
		T2.setX(5);
		T2.setY(6);
		T2.setR(5.6);
		
		System.out.println(T2);
	}

}
