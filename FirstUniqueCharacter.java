package in.ineuron;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static int findFirstUniqueCharacter(String str) {
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==1) {
				return i;
		    }
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		String str="loveleettvcode";
		System.out.println(findFirstUniqueCharacter(str));

	}

}
