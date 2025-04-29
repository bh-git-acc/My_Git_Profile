package Logical_Programs;

import java.util.HashMap;
import java.util.Map;

public class StringOfOccurance {

	public static void main(String[] args) {

		String str= "apple,orange,mango,apple,apple,orange";
		//op= apple count is 3
		//   orange count is 2
		//   mango count is 1
	
		String [] words= str.split(",");
		
		HashMap<String,Integer> count= new HashMap<String,Integer>();
		
		for(String Words: words) {
			if(count.containsKey(words)) {
				count.put(Words, count.get(words)+1);
			}else {
				count.put(Words, 1);
			}
		}
		for(Map.Entry<String, Integer> entry: count.entrySet()) {
			System.out.println(entry.getKey()+"="+ entry.getValue());
		}
	}
		}//}
