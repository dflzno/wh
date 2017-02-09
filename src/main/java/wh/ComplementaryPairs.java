package wh;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ComplementaryPairs {

	private Integer[] numbers;
	private Map<Integer, Integer> numbersOcurrences = new HashMap<>();
	
	public ComplementaryPairs(Integer[] numbers) {
		
		if(numbers == null) {
			throw new IllegalArgumentException("numbers was null.");
		}
		
		this.numbers = numbers;
		
		Stream.of(numbers)
		.forEach(n -> 
				numbersOcurrences
				.compute(n, (key, value) -> (value == null) ? 1 : ++value));
	}
	
	public int findKComplementaryPairs(int K) {
		int totalComplementaryPairs = 0;
		for(int n : numbers) {
			int toFind = K - n;
			totalComplementaryPairs += (numbersOcurrences.getOrDefault(toFind, 0) - (n == toFind ? 1 : 0));
		}
		return totalComplementaryPairs;
	}
}
