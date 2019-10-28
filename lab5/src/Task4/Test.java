package Task4;

public class Test {

	public static void main(String[] args) {
		int[] a = {0, 8, -3, 20};
		MinMax m = new MinMax(a);
		mINmAX1 m1 = new mINmAX1();
			System.out.println("Min: " + m.minmax()[0] + ", " + "Max:" +m.minmax()[1]);
			System.out.print("MIN: " + m1.minmax(a).a + ", MaX:"+ m1.minmax(a).b);
	}
}
