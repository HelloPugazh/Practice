package staticPractice;

public class Count {
	static int count;
	
	public Count () {
		count++;
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
	}
}
