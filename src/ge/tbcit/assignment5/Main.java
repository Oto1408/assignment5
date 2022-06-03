package ge.tbcit.assignment5;

public class Main {
	public static void main (String []args) {
		Figure figure = new Figure();
		Rectangle rec = new Rectangle();
		System.out.println(figure instanceof Figure);
		System.out.println(rec instanceof Rectangle);
		System.out.println(figure instanceof Rectangle);
		System.out.println(rec instanceof Figure);

	}
	
	

}
