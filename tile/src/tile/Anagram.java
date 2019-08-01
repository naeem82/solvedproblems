package tile;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( isAnagram());

	}

	public static boolean isAnagram() {
		String word1="ListenNNN";
		String word2="nnnSilent";
		Map<String,Integer> map=new HashMap<>();
		//  ------------- Store values in map
		for(int i=0;i<word1.length();i++) {
			String key=Character.toString(word1.charAt(i)).toLowerCase();
			if(map.containsKey(key)) {
			  Integer count=map.get(key);
			  count++;
			  map.put(key, count);
			}else {
				map.put(key, 1);
			}
			
		}
		//------------------ remove values from map
		for(int i=0;i<word2.length();i++) {
			String key=Character.toString(word2.charAt(i)).toLowerCase();
			if(map.containsKey(key)) {
				Integer count=map.get(key);
				if(count>1) {
					count--;
					map.put(key, count);
				}
				else {
					map.remove(key);
				}
			}
			else {
				return false;
			}
		}
		if(map.isEmpty())
			return true;
		else
			return false;
	}

}
