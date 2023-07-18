import java.util.Optional;

public class OptionalClassTesting {
	
	public static Optional<String> printName(){
		String a = null;
		Optional<String> b =  Optional.ofNullable(a);
		if(b.isPresent()) {
			return b;
		}
		else {
			return Optional.of("the value is empty");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(printName());
	}
}
