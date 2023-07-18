package functionslInterface;

public interface FunctionalInterface {
	public int math(int num1,int num2);
	
	public default String say() {
		return "hi";
	}
}
