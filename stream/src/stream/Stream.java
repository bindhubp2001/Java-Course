package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<Integer> ref2 = Arrays.asList(1, 2, 7, 3, 4);
		java.util.stream.Stream<Integer> ref3 = ref2.stream().sorted().forEach(n -> System.out.println(n));
		
		
		
		ref3.count();
		
	}

}
