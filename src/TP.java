import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TP {

	public static void main(String[] args) {
		for(int i=0;i<3;++i) {
			int a[] = {1,2,3,4,5};
		    int d[] = a;
		    int sum = 0;
		    for (int j = 0; j < 3; j++)
	                sum =sum+ (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
		    System.out.println(sum);
	       
		}
		
		//System.exit(0);
		
		String str ="asasaseet";
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else {
				hm.put(str.charAt(i),1);
			}
		}
		System.out.println(hm);

		Iterator<Character> itr = hm.keySet().iterator();
		Character key ;
		while(itr.hasNext()) {
			key = itr.next();
			if(hm.get(key)==2) {
				System.out.println(key +"  : "+hm.get(key));
			}
			
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
		for(Map.Entry<Character, Integer> entry :entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":"+ entry.getValue());
			}
		}
	}

}
