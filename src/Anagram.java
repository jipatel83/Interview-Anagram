import java.util.HashMap;


/**
 * interview queston
 * @author jaiminipatel
 * 
 * approach : Counting Characters 
 * Complexity : O(N)
 * 
 * /**
	 * verifies if two strings are anagrams
	 * @param s1
	 * @param s2
	 * @return boolean 
	Approach : 
	 1)Create Hashmap for two strings.
	2) Compare HashMaps  If both count HashMaps are same, then return true.
	3) O(N) 
 *
 */
public class Anagram {

		public static boolean anagramCheck(String s1, String s2) {
			// initial edge cases
			if (s1.length() != s2.length())
				return false;


			else if (s1 == null || s2 == null)
				return false;


			else {
				// create two hashmaps
				HashMap<Character, Integer> s1map = createHashMap(s1);
				HashMap<Character, Integer> s2map = createHashMap(s2);
				if (s1map.equals(s2map)) {
					return true;
				}
				return false;
			}
		}


		private static HashMap<Character, Integer> createHashMap(String s) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();


			for (int i = 0; i < s.length(); i++) {
				if (map.containsKey(s.charAt(i)) == true) {
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
				}
				else
					map.put(s.charAt(i), 1);
			} // end of for
			return map;
		}




}
