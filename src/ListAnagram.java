import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAnagram {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("code");
		lst.add("ocde");
		lst.add("anagram");
		lst.add("gramana");
		lst.add("anagraa");
		
		List<String> res = checkAnagramInList(lst);
		System.out.println(res);
	
		int abs = Math.abs(-1);
		System.out.println(abs);
		System.out.println(Math.min(45, 87));
		
	}

	//
	private static List<String> checkAnagramInList(List<String> lst) {
		List<String> res = new ArrayList<String>();
		
		for(int i=0;i<lst.size();i++) {
			String first = lst.get(i);//taking first element from the list.
		
			for(int j=i+1;j<lst.size();j++) {
			
				String check = lst.get(j); //taking i+1 element from the list and checking for the anagram..
				boolean  isAnagarm= checkAnagram(first,check);
				if(isAnagarm == true) {
					res.add(lst.get(i));
				}
			}
		}
		return res;
	}
	//main anagram logic
	private static boolean checkAnagram(String first, String check) {
		char[] f = first.toCharArray();
		char[] c = check.toCharArray();
		Arrays.sort(f);
		Arrays.sort(c);
	
		if(f.length!=c.length) {
			return false;
		}else {
			for(int i=0;i<f.length;i++) {
				if(f[i] != c[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
