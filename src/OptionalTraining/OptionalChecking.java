package OptionalTraining;

import java.util.Optional;

public class OptionalChecking {
	public static void main(String[] args) {
		String [] name = new String[10];
		name[5] = "Hello";
		Optional<String> a = Optional.ofNullable(name[5]);
		if(a.isPresent()) {
			String b = name[5].toUpperCase();
			System.out.println(b);
		}
		else {
			System.out.println("The value is not present");
		}
		String x = "hello";
		Optional<String>  y = Optional.ofNullable(x);
		System.out.println(y.orElse("fhgjk"));
		System.out.println(y.orElseThrow(()-> new NullPointerException()));
	}
}
