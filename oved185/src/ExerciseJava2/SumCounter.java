package ExerciseJava2;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SumCounter {
 
//	 
//	 *public static int f(int[] values, int sum) {
//		int result = 0;
//		
//		//...
//		for (int i = 0; i < values.length - 1; i++) {
//			for(int j = i + 1; j < values.length; j++) {
//				if(values[i] + values[j] == sum) {
//					result += 1;
//				}
//			}
//		}
//		
//		
//		return result;
//	}
//
//}


	
public static BigInteger addBigNumbers(BigInteger[] data) {
	if (data == null || data.length == 0) {
	return BigInteger.valueOf(0);
	}
	BigInteger result = data [0];
	
	for(int i = 1; i < data.length; i++) {
		result = result.add(data[i]);
	}
	return result;
}
 

	
	
	
//	public int[] data = new int[]{1, 2, 3 ,4, 4, 6, 7, 8, 12, 15, 20};
//	int sum;
	
	
	public static int createHashMap(int[] data, int sum) {
		if (data == null) {
			return 0;
		}
		
		int result = 0;
		
		
		Map<Integer, Integer> buffer = new HashMap<>();	
		for (int key : data)	{
			
			buffer.put(key, buffer.getOrDefault(key, 0) + 1);	
		}	
		
		Iterator<Integer> it = buffer.keySet().iterator();
		while (it.hasNext()) {
			Integer cur = it.next();
			Integer match = sum - cur;
			if (match > cur) {
				result += Math.min(buffer.get(cur), buffer.getOrDefault(match, 0));
			} else if (match == cur) {
				result += buffer.get(cur) / 2;
			}
		}
		
		return result;
		
		
		
		
		
		
		
}	
		
}	
		
	
		
		
		

		
		
//		
//		
//	Map<Integer, Integer> buffer = new HashMap<>();		
//		
//		buffer.put()
//	;
//
//	return result;
//}
//
//
//
//
//public HashMap setMap() {
//	
//	
//	return map;
//}
















